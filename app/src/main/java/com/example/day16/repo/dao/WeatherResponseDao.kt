package com.example.day16.repo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.day16.model.WeatherResponse
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherResponseDao {

    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    fun selectWeatherResponse(response: WeatherResponse)
*/

    @Query("SELECT * FROM WEATHER_TABLE")
    fun getAllWeatherResponses() :Flow<List<WeatherResponse>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWeatherResponse(response: WeatherResponse)
}