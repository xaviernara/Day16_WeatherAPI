package com.example.day16.adaptor

import com.example.day16.model.WeatherResponse

interface WeatherClickListener {

    fun weatherOnClickListener(weatherResponse: WeatherResponse)
}