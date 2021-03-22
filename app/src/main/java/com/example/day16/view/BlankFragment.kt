package com.example.day16.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.day16.R
import com.example.day16.adaptor.WeatherClickListener
import com.example.day16.databinding.FragmentBlankBinding
import com.example.day16.databinding.FragmentWeatherBinding
import com.example.day16.model.WeatherResponse
import com.example.day16.viewmodel.MainViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment(),WeatherClickListener {

    private lateinit var binding: FragmentBlankBinding
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentBlankBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.button.setOnClickListener {
            viewModel.getWeather(binding.editTextTextPersonName.toString())
        }


    }

    override fun weatherOnClickListener(weatherResponse: WeatherResponse) {


        when(view?.id){
            R.id.button -> {
                viewModel.getWeather(binding.editTextTextPersonName.toString())
                val actions = BlankFragmentDirections.actionBlankFragmentToWeatherFragment(weatherResponse)
                findNavController().navigate(actions)
            }
        }
    }
}