package com.example.proyectofinalapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitPartidos {


    private static RetrofitPartidos instance = null;
    private Api myApi;

    private RetrofitPartidos(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL_Partidos).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(Api.class);
    }

    public static synchronized RetrofitPartidos getInstance(){

        if (instance == null){
            instance = new RetrofitPartidos();
        }
        return instance;
    }

    public Api getMyApi2(){
        return myApi;
    }

}

