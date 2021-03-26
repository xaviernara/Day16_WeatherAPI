package com.example.day16.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.ForeignKey
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Clouds(

    val all: Int // 1
): Parcelable