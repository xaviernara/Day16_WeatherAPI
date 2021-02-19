package com.example.day16.repo.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.day16.model.WeatherResponse

interface WeatherResponseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    fun setWeatherResponse(response: WeatherResponse)


    //@Query("SELECT * FROM WeatherResponse limit 1")
    fun getWeatherResponse() : WeatherResponse
}