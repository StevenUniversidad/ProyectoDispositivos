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

public class PartidosMain extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listPartidos;
    PartidosData mydata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partidos_main);
        listPartidos = findViewById(R.id.listPartidos);
        getFromInternetPartidos();
        listPartidos.setOnItemClickListener(this);
    }
    private void getFromInternetPartidos(){

        Call<PartidosData> call = RetrofitPartidos.getInstance().getMyApi2().getDataPartidos();
        call.enqueue(new Callback<PartidosData>() {
            @Override
            public void onResponse(Call<PartidosData> call, Response<PartidosData> response) {

                mydata = response.body();
                String Message = "";


                PartidosAdapter adapter = new PartidosAdapter(PartidosMain.this, mydata.getPartidosList());
                listPartidos.setAdapter(adapter);


                for (int i = 0; i < mydata.getPartidosList().size(); i++) {

                    Message = Message + mydata.getPartidosList().get(i).getDate() + " : ";
                }


            }
            @Override
            public void onFailure(Call<PartidosData> call, Throwable t) {

                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this, Partidos_Details.class);
        in.putExtra("id", mydata.getPartidosList().get(position).getIdpartido());
        in.putExtra("date", mydata.getPartidosList().get(position).getDate());
        in.putExtra("home_team_score", mydata.getPartidosList().get(position).getHome_team_score());
        in.putExtra("visitor_team_score", mydata.getPartidosList().get(position).getVisitor_team_score());
        in.putExtra("season", mydata.getPartidosList().get(position).getSeason());
        in.putExtra("period", mydata.getPartidosList().get(position).getPeriod());
        in.putExtra("status", mydata.getPartidosList().get(position).getStatus());
        startActivity(in);
    }
}