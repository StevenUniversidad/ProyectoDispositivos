package com.example.proyectofinalapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    String BASE_URL = "https://www.balldontlie.io/api/v1/";

    @GET("players")
    Call<Data> getData();


    @GET("players/{id}")
    Call<Players> getPlayers(@Path("id") String id);



    String BASE_URL_Equipos = "https://www.balldontlie.io/api/v1/";
    @GET("teams")
    Call<EquiposData> getDataEquipos();
    @GET("teams/{id}")
    Call<Equipos> getEquipos(@Path("id") String id);

    String BASE_URL_Partidos = "https://www.balldontlie.io/api/v1/";
    @GET("games")
    Call<PartidosData> getDataPartidos();
    @GET("games/{id}")
    Call<Partidos> getPartidos(@Path("id") String id);



}
