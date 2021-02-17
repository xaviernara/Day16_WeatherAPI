package com.example.day16.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Clouds(

    val all: Int // 1
)