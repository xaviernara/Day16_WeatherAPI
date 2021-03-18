package com.example.day16.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day16.databinding.FragmentWeatherBinding
import com.example.day16.databinding.WeatherRecyclerBinding
import com.example.day16.model.WeatherResponse

class WeatherAdaptor (val weatherResponseList: List<WeatherResponse>):
    RecyclerView.Adapter<WeatherAdaptor.WeatherViewHolder>() {

    lateinit var binding: WeatherRecyclerBinding

    /**
     * Called when RecyclerView needs a new [ViewHolder] of the given type to represent
     * an item.
     *
     *
     * This new ViewHolder should be constructed with a new View that can represent the items
     * of the given type. You can either create a new View manually or inflate it from an XML
     * layout file
     *
     *
     * The new ViewHolder will be used to display items of the adapter using
     * [.onBindViewHolder]. Since it will be re-used to display
     * different items in the data set, it is a good idea to cache references to sub views of
     * the View to avoid unnecessary [View.findViewById] calls.
     *
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     * an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return A new ViewHolder that holds a View of the given view type.
     * @see .getItemViewType
     * @see .onBindViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherAdaptor.WeatherViewHolder {
        binding = WeatherRecyclerBinding.inflate(LayoutInflater.from(parent.context))
        return WeatherViewHolder(binding)
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    override fun getItemCount(): Int {
       return weatherResponseList.size
    }

    /**
     * Called by RecyclerView to display the data at the specified position. This method should
     * update the contents of the [ViewHolder.itemView] to reflect the item at the given
     * position.
     *
     *
     * Note that unlike [android.widget.ListView], RecyclerView will not call this method
     * again if the position of the item changes in the data set unless the item itself is
     * invalidated or the new position cannot be determined. For this reason, you should only
     * use the `position` parameter while acquiring the related data item inside
     * this method and should not keep a copy of it. If you need the position of an item later
     * on (e.g. in a click listener), use [ViewHolder.getAdapterPosition] which will
     * have the updated adapter position.
     *
     * Override [.onBindViewHolder] instead if Adapter can
     * handle efficient partial bind.
     *
     * @param holder The ViewHolder which should be updated to represent the contents of the
     * item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    override fun onBindViewHolder(holder: WeatherAdaptor.WeatherViewHolder, position: Int) {
        holder.setTextViews2(weatherResponseList[position].name,
            weatherResponseList[position].coord.lat+weatherResponseList[position].coord.lon,
            weatherResponseList[position].weather[position].main,
            weatherResponseList[position].weather[position].description,
            weatherResponseList[position].main.temp,
            weatherResponseList[position].main.feels_like
            )

    }

    class WeatherViewHolder (private val binding: WeatherRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setTextViews(cityName: String,long_lat: Double, weather :String,weatherDesc : String, temp : Double, feelLike: Double,
                         tempMax : Double, tempMin: Double, humidity: Double, windSpeed : Double){
            binding.cityNameText.text = cityName
            binding.longLatText.text = long_lat.toString()
            binding.feelLikeText.text = feelLike.toString()
            binding.humidityText.text = humidity.toString()
            binding.tempMaxText.text = tempMax.toString()
            binding.tempMinText.text = tempMin.toString()
            binding.weatherDescText.text =weatherDesc
            binding.weatherText.text = weather
            binding.windSpeedText.text =windSpeed.toString()
            binding.tempText.text= temp.toString()
        }

        fun setTextViews2(cityName: String,long_lat: Double, weather :String, weatherDesc : String, temp : Double, feelLike: Double){
            binding.cityNameText.text = cityName
            binding.weatherText.text = weather
            binding.weatherDescText.text =weatherDesc
            binding.tempText.text= temp.toString()
            binding.feelLikeText.text = feelLike.toString()
            binding.longLatText.text = long_lat.toString()
        }


    }
}