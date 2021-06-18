package com.example.proyectofinalapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {

    private static RetrofitApi instance = null;
    private Api myApi;

    private RetrofitApi(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(Api.class);
    }

    public static synchronized RetrofitApi getInstance(){

        if (instance == null){
            instance = new RetrofitApi();
        }
        return instance;
    }

    public Api getMyApi(){
        return myApi;
    }
}
