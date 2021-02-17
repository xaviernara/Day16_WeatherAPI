package com.example.day16.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Sys(

    @field:Json(name = "country")
    val country: String, // US

    @field:Json(name = "id")
    val id: Int, // 4309

    @field:Json(name = "sunrise")
    val sunrise: Int, // 1613565705

    @field:Json(name = "sunset")
    val sunset: Int, // 1613604317

    @field:Json(name = "type")
    val type: Int // 1
)