package com.example.sanjum.currencyexchange.network;

import com.example.sanjum.currencyexchange.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sanjum on 3/12/2018.
 */

public interface ApiInterface {

    @GET(".")
    Call<Result>
    getData();
}
