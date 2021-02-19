package com.example.day16.model

import androidx.room.Entity
import androidx.room.ForeignKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity(
/*foreignKeys = [ForeignKey(
entity =  WeatherResponse::class,
parentColumns = ["id"],
childColumns = [])*/)


data class Coord(
    @field:Json(name="lat")
    val lat: Double, // 41.5934

    @field:Json(name="lon")
    val lon: Double // -87.3464
)