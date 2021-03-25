package com.example.day16.view

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day16.adaptor.WeatherAdaptor
import com.example.day16.adaptor.WeatherClickListener
import com.example.day16.databinding.FragmentWeatherBinding
import com.example.day16.model.WeatherResponse
import com.example.day16.viewmodel.MainViewModel
import kotlin.random.Random
import kotlin.random.nextInt

class WeatherFragment : Fragment(), WeatherClickListener {

    private lateinit var binding: FragmentWeatherBinding
    private lateinit var viewModel: MainViewModel
    private val args : WeatherFragmentArgs by navArgs()




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //val mainActivity : MainActivity

        initObservers()
        MainActivity.setToolbar(args.weatherResponse.name,true)





       /* Handler().postDelayed({
            initObservers()
        }, 2000)
*/

    }

    private fun initObservers() {


        //viewModel.createWeatherResponse(args.cityName)
        viewModel.insertWeatherResponse(args.cityName)
        viewModel.getAllWeatherResponses()

        viewModel.weatherResponseListLiveData.observe(viewLifecycleOwner, Observer {
            generateWeatherAdapter(it)
        })

        //viewModel.getWeather(randomCityName())

        //viewModel.getWeather()

        /*viewModel.weatherResponse.observe(viewLifecycleOwner){
*//*
            binding.cityNameText.text = it.name
            //binding.weatherDescText.text = it.weather[1].description
            binding.weatherText.text = it.weather.toString()
            binding.feelLikeText.text = it.main.feels_like.toString()
            binding.humidityText.text = it.main.humidity.toString()
            binding.tempMaxText.text = it.main.temp_max.toString()
            binding.tempMinText.text = it.main.temp_min.toString()
            binding.windSpeedText.text = it.wind.toString()
            binding.tempText.text = it.main.temp.toString()*//*
        }*/




    }

   /* fun initObservers(){
        viewModel.weatherLiveData.observe(viewLifecycleOwner, Observer {
            generateWeatherAdapter(it)
        })
    }
*/
    fun randomCityName() : String{

        //val random : Random()

        val randomNames = arrayOf("chicago","newyork","gary","denver","cary","hammond","miami","chicago","crown point")
        return randomNames[Random.nextInt(0 .. randomNames.size-1)]
        //randomNames[(0 until randomNames.size ).random()]
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = FragmentWeatherBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root


    private fun generateWeatherAdapter(weatherResponseList : List<WeatherResponse>){

        binding.weatherRecycler.layoutManager = LinearLayoutManager(binding.root.context)
        binding.weatherRecycler.adapter = WeatherAdaptor(weatherResponseList,this)

    }

    override fun weatherOnClickListener(weatherResponse: WeatherResponse) {
        viewModel.weatherLiveData.observe(viewLifecycleOwner, Observer {
            val actions = WeatherFragmentDirections.actionWeatherFragmentToWeatherClickFragment(it)
            findNavController().navigate(actions)
        })




    }

}