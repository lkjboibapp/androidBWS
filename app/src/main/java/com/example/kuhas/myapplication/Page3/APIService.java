package com.example.kuhas.myapplication.Page3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kuhas on 2/2/2561.
 */

public class APIService {

    APIClient service;
    public APIService() {
//        Gson gson = new GsonBuilder()
//                .setDateFormat("Y-m-d H:i:s")
//                .create();

                        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl("http://172.20.10.2/jsonphp/reportNew_v_2.php/")
                                .addConverterFactory(GsonConverterFactory.create())

                                .build();

                        service = retrofit.create(APIClient.class);
        }

    public APIClient getService() {
        return service;
    }
}
