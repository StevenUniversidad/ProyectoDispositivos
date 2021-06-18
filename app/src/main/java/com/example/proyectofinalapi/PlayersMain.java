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

public class PlayersMain extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listPlayers;
    Data mydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_main);
        listPlayers = findViewById(R.id.listPlayers);
        getFromInternetCivilizations();
        listPlayers.setOnItemClickListener(this);
    }

    private void getFromInternetCivilizations(){

        Call<Data> call = RetrofitApi.getInstance().getMyApi().getData();
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {

                mydata = response.body();
                String Message = "";


                PlayersAdapter adapter = new PlayersAdapter(PlayersMain.this, mydata.getPlayersList());
                listPlayers.setAdapter(adapter);


                for (int i = 0; i < mydata.getPlayersList().size(); i++) {

                    Message = Message + mydata.getPlayersList().get(i).getFirst_name() + " : ";
                }


            }
            @Override
            public void onFailure(Call<Data> call, Throwable t) {

                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this, Players_Details.class);
        in.putExtra("id", mydata.getPlayersList().get(position).getIdPlayer());
        in.putExtra("first_name", mydata.getPlayersList().get(position).getFirst_name());
        in.putExtra("last_name", mydata.getPlayersList().get(position).getLast_name());
        in.putExtra("position", mydata.getPlayersList().get(position).getPosition());
        in.putExtra("height_feet", mydata.getPlayersList().get(position).getHeight_feet());
        in.putExtra("height_inches", mydata.getPlayersList().get(position).getHeight_inches());

        startActivity(in);
    }
}