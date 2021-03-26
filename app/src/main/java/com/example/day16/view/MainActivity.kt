package com.example.day16.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.day16.R
import com.example.day16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }


    }


    companion object {

        private lateinit var binding : ActivityMainBinding

        fun setToolbar(cityName : String, isVisible : Boolean){

            if(isVisible) binding.toolbar.visibility = View.VISIBLE
            binding.toolbar.visibility = View.INVISIBLE

            binding.cityNameText.text = cityName
        }
    }


}