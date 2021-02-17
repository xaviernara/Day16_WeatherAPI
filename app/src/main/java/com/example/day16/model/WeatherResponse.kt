package com.example.day16.model

data class WeatherResponse(
    val base: String, // stations
    val clouds: Clouds,
    val cod: Int, // 200
    val coord: Coord,
    val dt: Int, // 1613580189
    val id: Int, // 4920607
    val main: Main,
    val name: String, // Gary
    val sys: Sys,
    val timezone: Int, // -21600
    val visibility: Int, // 10000
    val weather: List<Weather>,
    val wind: Wind
)