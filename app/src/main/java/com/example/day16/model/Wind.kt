package com.example.day16.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Wind(

    @field:Json(name ="deg")
    val deg: Int, // 178

    @field:Json(name ="speed")
    val speed: Double // 1.39
)