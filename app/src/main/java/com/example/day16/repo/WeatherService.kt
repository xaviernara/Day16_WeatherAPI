package com.example.day16.repo

import com.example.day16.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherService {

    /**
     * Implementation using kotlin coroutines multithreading mechanism
     *
     * suspend is a keyword that lets the compiler know this is a coroutine function
     */

    // https://v2.jokeapi.dev/joke/any?amount=10
/*
    @Path(""): is used for url elements after the base url without ? before it
    ex: BASE_URL:https://v2.jokeapi.dev/joke/any,misc,xmas?amount=10

    @Path("category")

    @Get("") is used for url elements after the base url with ? before it
    @Get("amount")

 */

    /*
        Ex:
        description: python
         location: san francisco
         full_time: true


     */

    //@GET("weather/")
    //@Headers("user-key: f603765881641623338f7722bbe26d40")
    @GET("forcasts/")
    suspend fun getWeatherService(@Query("q") cityName: String, @Query("appid")apiId:String): WeatherResponse


}