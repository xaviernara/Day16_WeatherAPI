package com.example.day16.view

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import com.example.day16.databinding.FragmentWeatherBinding
import com.example.day16.viewmodel.MainViewModel
import kotlin.random.Random
import kotlin.random.nextInt

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WeatherFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WeatherFragment : Fragment() {
    // TODO: Rename and change types of parameters
    /*private var param1: String? = null
    private var param2: String? = null*/

    private lateinit var binding: FragmentWeatherBinding
    private lateinit var viewModel: MainViewModel

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)



        Handler().postDelayed({
            initObservers()
        }, 2000)


    }

    private fun initObservers() {

        viewModel.getWeather(randomCityName())

        viewModel.weatherResponse.observe(viewLifecycleOwner){

            binding.cityNameText.text = it.name
            //binding.weatherDescText.text = it.weather[1].description
            binding.weatherText.text = it.weather.toString()
            binding.feelLikeText.text = it.main.feels_like.toString()
            binding.humidityText.text = it.main.humidity.toString()
            binding.tempMaxText.text = it.main.temp_max.toString()
            binding.tempMinText.text = it.main.temp_min.toString()
            binding.windSpeedText.text = it.wind.toString()
            binding.tempText.text = it.main.temp.toString()
        }




    }

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




    /*companion object {
        *//**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment WeatherFragment.
         *//*
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WeatherFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}