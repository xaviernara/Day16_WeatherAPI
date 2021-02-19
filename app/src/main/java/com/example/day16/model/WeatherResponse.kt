package com.example.day16.model

import androidx.room.*
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

@Entity(
    tableName = "WEATHER_TABLE"
    //,indices = [Index(value = [])]
)
data class WeatherResponse @JvmOverloads constructor (





    @ColumnInfo(name = "base")
    @Ignore
    val base: String, // stations

    //@ColumnInfo(name ="clouds")
    @Ignore
    val clouds: Clouds,

    //@ColumnInfo(name ="cod")
    val cod: Int, // 200

    @ColumnInfo(name ="coord")
    val coord: Coord,//0

    @ColumnInfo(name ="dt")
    val dt: Int, // 1613580189

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int, // 4920607

    //@ColumnInfo(name ="main")
    @Ignore
    val main: Main,

    @ColumnInfo(name ="name")
    val name: String, // Gary

    //@ColumnInfo(name ="sys")
    @Ignore
    val sys: Sys,

    @ColumnInfo(name ="timezone")
    val timezone: Int, // -21600

    @ColumnInfo(name ="visibility")
    val visibility: Int, // 10000

    //@ColumnInfo(name ="weather")
    @Ignore
    val weather: List<Weather>,

    //@ColumnInfo(name ="wind")
    @Ignore
    val wind: Wind


    /*@Ignore val current : WeatherResponse = WeatherResponse(
    "","",0,"",0,0,"","",""
    ,0,0,"","")*/









)