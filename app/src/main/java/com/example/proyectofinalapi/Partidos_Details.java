package com.example.proyectofinalapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Partidos_Details extends AppCompatActivity {

    TextView mostrar_id, mostrar_date, mostrar_home_team_score,
            mostrar_visitor_team_score, mostrar_season, mostrar_period, mostrar_status;
    String id, date, home_team_score, visitor_team_score, season,period, status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partidos_details);
        mostrar_id = findViewById(R.id.txt_id_partidos);
        mostrar_date = findViewById(R.id.txt_date_partidos);
        mostrar_home_team_score = findViewById(R.id.txt_home_team_partidos);
        mostrar_visitor_team_score = findViewById(R.id.txt_visitor_team_partidos);
        mostrar_season = findViewById(R.id.txt_season);
        mostrar_period = findViewById(R.id.txt_periodo_partidos);
        mostrar_status = findViewById(R.id.txt_status_partidos);
        Bundle in = getIntent().getExtras();
        id = in.getString("id");
        date = in.getString("date");
        home_team_score = in.getString("home_team_score");
        visitor_team_score = in.getString("visitor_team_score");
        season = in.getString("season");
        period = in.getString("period");
        status = in.getString("status");
        Toast.makeText(this, id, Toast.LENGTH_LONG).show();
        //getCivilizationById(id);
        mostrar_id.setText(id);
        mostrar_date.setText(date);
        mostrar_home_team_score.setText(home_team_score);
        mostrar_visitor_team_score.setText(visitor_team_score);
        mostrar_season.setText(season);
        mostrar_period.setText(period);
        mostrar_status.setText(status);
    }
}