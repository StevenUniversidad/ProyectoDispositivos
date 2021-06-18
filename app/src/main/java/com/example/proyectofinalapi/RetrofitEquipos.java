package com.example.proyectofinalapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitEquipos {


    private static RetrofitEquipos instance = null;
    private Api myApi;

    private RetrofitEquipos(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL_Equipos).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(Api.class);
    }

    public static synchronized RetrofitEquipos getInstance(){

        if (instance == null){
            instance = new RetrofitEquipos();
        }
        return instance;
    }

    public Api getMyApi1(){
        return myApi;
    }

}
