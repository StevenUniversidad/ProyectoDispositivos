package com.example.proyectofinalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        controladorEquipos();
        controladorJugadores();
        controladorPartidos();
    }

    public void controladorEquipos() {

        ImageView entry = (ImageView) findViewById(R.id.imgequipos);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), EquiposMain.class);
                startActivity(ListSong);
            }
        });

    }


    public void controladorPartidos() {

        ImageView entry = (ImageView) findViewById(R.id.imgpartidos);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), PartidosMain.class);
                startActivity(ListSong);
            }
        });

    }


    public void controladorJugadores() {

        ImageView entry = (ImageView) findViewById(R.id.imgjugadores);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(getApplicationContext(), PlayersMain.class);
                startActivity(ListSong);
            }
        });

    }
}