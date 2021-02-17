package com.example.day16.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Main(
    @field:Json(name = "feels_like")
    val feels_like: Double, // 257.45

    @field:Json(name ="humidity")
    val humidity: Int, // 85

    @field:Json(name ="pressure")
    val pressure: Int, // 1030

    @field:Json(name ="temp")
    val temp: Double, // 261.71

    @field:Json(name ="temp_max")
    val temp_max: Double, // 262.59

    @field:Json(name ="temp_min")
    val temp_min: Double // 260.15
)