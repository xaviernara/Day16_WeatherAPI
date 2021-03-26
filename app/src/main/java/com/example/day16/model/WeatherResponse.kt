package com.example.day16.model

import android.os.Parcelable
import androidx.room.*
import com.example.day16.repo.local.Converters
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@JsonClass(generateAdapter = true)

@Entity(
    tableName = "WEATHER_TABLE"
    //,indices = [Index(value = [])]
)

@Parcelize
data class WeatherResponse (
    //@ColumnInfo(name = "base")
    //@Ignore
    val base: String, // stations

    //@ColumnInfo(name ="clouds")
    //@Ignore


    val clouds: @RawValue Clouds,

    //@ColumnInfo(name ="cod")
    val cod: Int, // 200

    //@ColumnInfo(name ="coord")
    val coord: @RawValue Coord,//0

    //@ColumnInfo(name ="dt")
    val dt: Int, // 1613580189

    @PrimaryKey(autoGenerate = true)
    //@ColumnInfo(name = "id")
    val id: Int, // 4920607

    //@ColumnInfo(name ="main")
    //@Ignore
    val main: @RawValue Main,

    @ColumnInfo(name ="name")
    val name: String, // Gary

    //@ColumnInfo(name ="sys")
    //@Ignore
    val sys: @RawValue Sys,

    //@ColumnInfo(name ="timezone")
    val timezone: Int, // -21600

   // @ColumnInfo(name ="visibility")
    val visibility: Int, // 10000

    //@ColumnInfo(name ="weather")
    //@Ignore
    val weather: @RawValue List<Weather>,

    //@ColumnInfo(name ="wind")
    val wind: @RawValue Wind,

    @TypeConverters(Converters::class)
    val rain : @RawValue Rain


    /*@Ignore val current : WeatherResponse = WeatherResponse(
    "","",0,"",0,0,"","",""
    ,0,0,"","")*/

):Parcelable