package com.example.weatherjetpackcompapp.repository

import com.example.weatherjetpackcompapp.model.WeatherInfo

// interface for te repository that provides weather data
// this is what we'll inject
// using an interface allows us to swap implementations (like for testing)
interface WeatherRepository {

    fun getWeatherForLocation(location: String): WeatherInfo
    fun getAllLocations(): List<String>

}