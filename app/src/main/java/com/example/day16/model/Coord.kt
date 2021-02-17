package com.example.day16.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coord(
    @field:Json(name="lat")
    val lat: Double, // 41.5934

    @field:Json(name="lon")
    val lon: Double // -87.3464
)