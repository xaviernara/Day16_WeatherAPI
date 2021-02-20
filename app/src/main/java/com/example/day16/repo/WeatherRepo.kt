package com.example.day16.repo

import com.example.day16.model.WeatherResponse
import com.example.day16.remote.RetrofitInstance

object WeatherRepo {

    val weatherService = RetrofitInstance.weatherService

    suspend fun getWeatherRepo(cityName :String) :WeatherResponse{
        return RetrofitInstance.weatherService.getWeatherService(cityName,"f603765881641623338f7722bbe26d40" )
    }


    // get last timestamp, compare last timestamp to current timestamp, if greater than 10 mins fetch from server
    suspend fun getWeatherRepo2(cityName :String) {
        return
    }
}