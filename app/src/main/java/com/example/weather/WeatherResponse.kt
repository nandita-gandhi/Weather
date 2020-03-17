package com.example.weather

 class WeatherResponse(val main: Main, val sys: Sys) {

    val weather : List<Weather>
        get() = TODO()
 }

data class Weather (

    val id : Int,
    val main : String,
    val description : String,
    val icon : String
)
data class Clouds (
    val all : Int
)
data class Rain(
    val h3 : Float
)

data class Wind (
    val speed : Double,
    val deg : Int
)
data class Main (

    val temp : Double,
    val pressure : Int,
    val humidity : Int,
    val temp_min : Double,
    val temp_max : Double
)
data class Sys (

    val type : Int,
    val id : Int,
    val message : Double,
    val country : String,
    val sunrise : Int,
    val sunset : Int
)
data class Coord (

    val lon : Double,
    val lat : Double
)