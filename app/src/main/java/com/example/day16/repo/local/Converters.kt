package com.example.day16.repo.local

import androidx.room.TypeConverter
import com.example.day16.model.*
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class Converters {

    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun windToString(wind: Wind): String{
        val adapter = Moshi.Builder().build().adapter<Wind>(Wind::class.java)
        return adapter.toJson(wind)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToAddress(jsonString: String): Wind? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Wind>(Wind::class.java)
        return adapter.fromJson(jsonString)
    }

    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun cloudToString(clouds: Clouds): String{
        val adapter = Moshi.Builder().build().adapter<Clouds>(Clouds::class.java)
        return adapter.toJson(clouds)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToClouds(jsonString: String): Clouds? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Clouds>(Clouds::class.java)
        return adapter.fromJson(jsonString)
    }



    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun coordToString(coord: Coord): String{
        val adapter = Moshi.Builder().build().adapter<Coord>(Coord::class.java)
        return adapter.toJson(coord)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToCoord(jsonString: String): Coord? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Coord>(Coord::class.java)
        return adapter.fromJson(jsonString)
    }

    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun mainToString(main: Main): String{
        val adapter = Moshi.Builder().build().adapter<Main>(Main::class.java)
        return adapter.toJson(main)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToMain(jsonString: String): Main? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Main>(Main::class.java)
        return adapter.fromJson(jsonString)
    }

    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun rainToString(rain: Rain): String{
        val adapter = Moshi.Builder().build().adapter<Rain>(Rain::class.java)
        return adapter.toJson(rain)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToRain(jsonString: String): Rain? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Rain>(Rain::class.java)
        return adapter.fromJson(jsonString)
    }

    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun sysToString(sys: Sys): String{
        val adapter = Moshi.Builder().build().adapter<Sys>(Sys::class.java)
        return adapter.toJson(sys)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToSys(jsonString: String): Sys? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Sys>(Sys::class.java)
        return adapter.fromJson(jsonString)
    }

    //Converter for Wind object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun weatherToString(weather: Weather): String{
        val adapter = Moshi.Builder().build().adapter<Weather>(Weather::class.java)
        return adapter.toJson(weather)
    }

    //Converter for String to Wind object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToWeather(jsonString: String): Weather? {
        //val type = Types.newParameterizedType(Address::class.java)
        val adapter = Moshi.Builder().build().adapter<Weather>(Weather::class.java)
        return adapter.fromJson(jsonString)
    }

    //Converter for List to String
    //ONLY NEED type variable WHEN CONVERTING A LIST<>
    @TypeConverter
    fun listToString(list : List<String>):String{
        val type = Types.newParameterizedType(List::class.java,String::class.java)
        val adapter = Moshi.Builder().build().adapter<List<String>>(type)
        return adapter.toJson(list)
    }

    //Converter for String to list
    //ONLY NEED type variable WHEN CONVERTING A LIST<>
    @TypeConverter
    fun stringToPhoneList(jsonString: String): List<String>? {
        val type = Types.newParameterizedType(List::class.java,String::class.java)
        val adapter = Moshi.Builder().build().adapter<List<String>>(type)
        return adapter.fromJson(jsonString)?:listOf()
    }








}