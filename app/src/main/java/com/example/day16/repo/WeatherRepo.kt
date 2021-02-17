package com.example.day16.repo

import com.example.day16.model.WeatherResponse
import com.example.day16.remote.RetrofitInstance

object WeatherRepo {

    val weatherService = RetrofitInstance.weatherService

    suspend fun getWeather(cityName :String) :List<WeatherResponse>{
        return RetrofitInstance.weatherService.getWeather(cityName)
    }
}