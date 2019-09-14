package com.example.weathervibe.api;

import com.example.weathervibe.Models.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenWeatherService {

    @GET("/data/2.5/weather?units=metric")
    public Call<Response> getData(@Query("q") String location, @Query("apikey") String apiKey);

}
