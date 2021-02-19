package com.example.day16.model

import androidx.room.Entity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Weather(
    @field:Json(name="description")
    val description: String, // clear sky

    @field:Json(name="icon")
    val icon: String, // 01d

    @field:Json(name="id")
    val id: Int, // 800

    @field:Json(name="main")
    val main: String // Clear
)