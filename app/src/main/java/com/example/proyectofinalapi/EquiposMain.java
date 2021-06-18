package com.example.proyectofinalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EquiposMain extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listEquipos;
    EquiposData mydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos_main);
        listEquipos = findViewById(R.id.listEquipos);
        getFromInternetEquipos();
        listEquipos.setOnItemClickListener(this);
    }
    private void getFromInternetEquipos(){

        Call<EquiposData> call = RetrofitEquipos.getInstance().getMyApi1().getDataEquipos();
        call.enqueue(new Callback<EquiposData>() {
            @Override
            public void onResponse(Call<EquiposData> call, Response<EquiposData> response) {

                mydata = response.body();
                String Message = "";


                EquiposAdapter adapter = new EquiposAdapter(EquiposMain.this, mydata.getEquiposList());
                listEquipos.setAdapter(adapter);


                for (int i = 0; i < mydata.getEquiposList().size(); i++) {

                    Message = Message + mydata.getEquiposList().get(i).getFull_name() + " : ";
                }


            }
            @Override
            public void onFailure(Call<EquiposData> call, Throwable t) {

                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this, Equipos_Details.class);
        in.putExtra("id", mydata.getEquiposList().get(position).getIdequipo());
        in.putExtra("city", mydata.getEquiposList().get(position).getCiudad());
        in.putExtra("abbreviation", mydata.getEquiposList().get(position).getAbbreviation());
        in.putExtra("conference", mydata.getEquiposList().get(position).getConference());
        in.putExtra("division", mydata.getEquiposList().get(position).getDivision());
        in.putExtra("full_name", mydata.getEquiposList().get(position).getFull_name());
        in.putExtra("name", mydata.getEquiposList().get(position).getName());
        startActivity(in);
    }
}