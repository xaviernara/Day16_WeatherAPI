package com.example.day16.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.example.day16.model.WeatherResponse
import com.example.day16.repo.WeatherRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val _weatherResponse = MutableLiveData <WeatherResponse>()

    val weatherResponse : LiveData<WeatherResponse>
        get() = _weatherResponse


  /*  init{

        val callback : Callback<WeatherResponse> = object : Callback<WeatherResponse>{
            *//**
             * Invoked for a received HTTP response.
             *
             *
             * Note: An HTTP response may still indicate an application-level failure such as a 404 or 500.
             * Call [Response.isSuccessful] to determine if the response indicates success.
             *//*
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                _weatherResponse.value = response.body()
                Log.d("Successful callback", "inside onResponse ")

            }

            *//**
             * Invoked when a network exception occurred talking to the server or when an unexpected exception
             * occurred creating the request or processing the response.
             *//*
            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.d("Error callback", "onFailure: "+t.message)
            }
        }

        viewModelScope.launch(Dispatchers.Main){WeatherRepo.getWeatherRepo("Chicago")}
    }*/

    fun getWeather(cityName : String){

        /*
        CoroutineScope tied to this ViewModel. This scope will be
        canceled when ViewModel will be cleared, i.e ViewModel.onCleared is called

        Launches a new coroutine without blocking the current thread and returns a reference to the coroutine as a Job.
        The coroutine is cancelled when the resulting job is cancelled.
        */

        viewModelScope.launch(Dispatchers.IO) {
            val weather = WeatherRepo.getWeatherRepo(cityName)
            _weatherResponse.postValue(weather.copy())
        }
    }

   /* fun getWeather2(cityName : String){

        *//*
        CoroutineScope tied to this ViewModel. This scope will be
        canceled when ViewModel will be cleared, i.e ViewModel.onCleared is called

        Launches a new coroutine without blocking the current thread and returns a reference to the coroutine as a Job.
        The coroutine is cancelled when the resulting job is cancelled.
        *//*

        viewModelScope.launch(Dispatchers.IO) {
            val weather = WeatherRepo.getWeatherRepo(cityName)
            _weatherResponse.postValue(weather.copy())
            Log.d("Inside getWeather2", "getWeather2: $_weatherResponse")

        }*/
    }








