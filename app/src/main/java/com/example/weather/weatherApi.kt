package com.example.weather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface weatherApi {
    @GET("data/2.5/weather?")
   fun getCurrentWeatherData(@Query("q")  name:String, @Query("APPID")  app_id:String):Call<WeatherResponse>
}