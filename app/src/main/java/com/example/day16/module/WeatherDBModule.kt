package com.example.day16.module

import android.content.Context
import androidx.room.Room
import com.example.day16.repo.dao.WeatherResponseDao
import com.example.day16.repo.local.WeatherDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class WeatherDBModule {

    @Provides
    @Singleton
    fun providesDB(
        @ApplicationContext applicationContext: Context
    ): WeatherDB = Room.databaseBuilder(
        applicationContext,WeatherDB::class.java,"WEATHER_TABLE").build()

    @Provides
    @Singleton
    fun providesWeatherDAO(db:WeatherDB) : WeatherResponseDao = db.weatherResponseDao()



}