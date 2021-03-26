package com.example.day16.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.day16.BlankFragmentDirections
import com.example.day16.R
import com.example.day16.databinding.FragmentBlankBinding
import com.example.day16.viewmodel.MainViewModel

class BlankFragment : Fragment(),View.OnClickListener {

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
            viewModel.createWeatherResponse(binding.editTextTextPersonName.toString())

        }


    }

    /*override fun weatherOnClickListener(weatherResponse: WeatherResponse) {
        when(view?.id){
            R.id.button -> {
                viewModel.createWeatherResponse(binding.editTextTextPersonName.toString())
                val actions = BlankFragmentDirections.actionBlankFragmentToWeatherFragment(weatherResponse)
                findNavController().navigate(actions)
            }
        }

    }*/

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    override fun onClick(v: View?) {
        when(view?.id){
            R.id.button -> {
                //viewModel.createWeatherResponse(binding.editTextTextPersonName.toString())
                val actions = BlankFragmentDirections.actionBlankFragmentToWeatherFragment(binding.editTextTextPersonName.toString())
                findNavController().navigate(actions)
            }
        }
    }
}