package com.example.day16.repo

import android.content.Context
import com.example.day16.model.WeatherResponse
import com.example.day16.remote.RetrofitInstance
import com.example.day16.repo.dao.WeatherResponseDao
import com.example.day16.repo.local.WeatherDB
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherRepo @Inject constructor(private var weatherResponseDao: WeatherResponseDao) {


    suspend fun createWeatherResponse(cityName: String): WeatherResponse {
        return RetrofitInstance.weatherService.getWeatherService(
            cityName,
            "f603765881641623338f7722bbe26d40"
        )
    }

    suspend fun insertWeatherResponse(weatherResponse: WeatherResponse) = weatherResponseDao.insertWeatherResponse(weatherResponse)

    /*suspend fun insertWeatherResponse(
        context: Context,
        cityName: String
    ) {
        weatherResponseDao = WeatherDB.getDatabase(context)?.weatherResponseDao()!!

        weatherResponseDao.insertWeatherResponse(
            RetrofitInstance.weatherService.getWeatherService(
                cityName,
                "f603765881641623338f7722bbe26d40"
            )
        )

    }*/

    val weatherFlow = weatherResponseDao.getAllWeatherResponses()

    /* val weatherFlow : Flow<List<WeatherResponse>>
         get() = */
/*

    fun getWeatherResponse(context: Context): Flow<List<WeatherResponse>>? {
        weatherResponseDao = WeatherDB.getDatabase(context)?.weatherResponseDao()!!
        return weatherResponseDao.getAllWeatherResponses()
    }
*/


    /*// get last timestamp,   compare last timestamp to current timestamp, if greater than 10 mins fetch from server
    suspend fun getWeatherRepo2(cityName :String) {
        return
    }*/
}