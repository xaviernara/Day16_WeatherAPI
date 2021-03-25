package com.example.day16.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.day16.R
import com.example.day16.databinding.FragmentWeatherBinding
import com.example.day16.databinding.FragmentWeatherClickBinding

class WeatherClickFragment : Fragment() {

    private lateinit var binding : FragmentWeatherClickBinding
    private val args: WeatherClickFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    )= FragmentWeatherClickBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.feelLikeText.text = args.weatherResponse.main.feels_like.toString()
        binding.forecast2Text.text = args.weatherResponse.weather[0].description
        binding.forecastText.text = args.weatherResponse.weather[0].main
        binding.tempText.text = args.weatherResponse.main.temp.toString()


    }

}