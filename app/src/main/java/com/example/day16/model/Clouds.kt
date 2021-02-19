package com.example.day16.model

import androidx.room.Entity
import androidx.room.ForeignKey
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity(tableName = "CLOUDS")
data class Clouds(

    val all: Int // 1
)