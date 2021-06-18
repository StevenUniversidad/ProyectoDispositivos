package com.example.proyectofinalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Players_Details extends AppCompatActivity {
    TextView mostrar_id, mostrar_first, mostrar_last, mostrar_position, mostrar_height_free, mostrar_height_inchesView;
    String id, first_name, last_name, position,height_feet,height_inches ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_details);
        mostrar_id = findViewById(R.id.txt_id_players);
        mostrar_first = findViewById(R.id.txt_first_player);
        mostrar_last = findViewById(R.id.txt_last_name_player);
        mostrar_position = findViewById(R.id.txt_position_player);
        mostrar_height_free = findViewById(R.id.txt_height_free_player);
        mostrar_height_inchesView = findViewById(R.id.txt_height_inches_player);

        Bundle in = getIntent().getExtras();
        id = in.getString("id");
        first_name = in.getString("first_name");
        last_name = in.getString("last_name");
        position = in.getString("position");
        height_feet = in.getString("height_feet");
        height_inches = in.getString("height_inches");

        Toast.makeText(this, id, Toast.LENGTH_LONG).show();
        //getCivilizationById(id);
        mostrar_id.setText(id);
        mostrar_first.setText(first_name);
        mostrar_last.setText(last_name);
        mostrar_position.setText(position);
        mostrar_height_free.setText(height_feet);
        mostrar_height_inchesView.setText(height_inches);
    }
/*
    private void getCivilizationById(String id){

        Call<Players> call = RetrofitApi.getInstance().getMyApi().getPlayers(id);
        call.enqueue(new Callback<Players>() {
            @Override
            public void onResponse(Call<Players> call, Response<Players> response) {
                Players players = response.body();
                Toast.makeText(getApplicationContext(), players.getFirst_name(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Players> call, Throwable t) {

                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }

 */
}