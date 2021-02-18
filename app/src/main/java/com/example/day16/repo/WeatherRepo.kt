package com.example.day16.repo

import com.example.day16.model.WeatherResponse
import com.example.day16.remote.RetrofitInstance

object WeatherRepo {

    val weatherService = RetrofitInstance.weatherService

    suspend fun getWeatherRepo(cityName :String) :WeatherResponse{
        return RetrofitInstance.weatherService.getWeatherService(cityName,"f603765881641623338f7722bbe26d40" )
    }
}