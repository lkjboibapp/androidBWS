package com.example.kuhas.myapplication.Page3;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by kuhas on 2/2/2561.
 */

public interface APIClient {
    @GET("getReport")
    Call<DataList> getReport();
}
