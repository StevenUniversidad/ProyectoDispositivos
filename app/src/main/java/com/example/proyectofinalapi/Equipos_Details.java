package com.example.proyectofinalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Equipos_Details extends AppCompatActivity {

    TextView mostrar_id, mostrar_city, mostrar_conference, mostrar_name, mostrar_division, mostrar_abreviation, mostrar_fullname;
    String id, city, conference, name, division,abreviation, fullname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos_details);
        mostrar_id = findViewById(R.id.txt_id_equipos);
        mostrar_city = findViewById(R.id.txt_city_equipos);
        mostrar_conference = findViewById(R.id.txt_conference_equipos);
        mostrar_name = findViewById(R.id.txt_name_equipos);
        mostrar_fullname = findViewById(R.id.txt_full_name_equipos);
        mostrar_division = findViewById(R.id.txt_division_equipos);
        mostrar_abreviation = findViewById(R.id.txt_abreviation_equipos);
        Bundle in = getIntent().getExtras();
        id = in.getString("id");
        city = in.getString("city");
        name = in.getString("name");
        division = in.getString("division");
        conference = in.getString("conference");
        fullname = in.getString("full_name");
        abreviation = in.getString("abbreviation");

        Toast.makeText(this, id, Toast.LENGTH_LONG).show();
        //getCivilizationById(id);
        mostrar_id.setText(id);
        mostrar_city.setText(city);
        mostrar_conference.setText(conference);
        mostrar_name.setText(name);
        mostrar_fullname.setText(fullname);
        mostrar_division.setText(division);
        mostrar_abreviation.setText(abreviation);
    }
}