package com.example.weatherjetpackcompapp.repository

import com.example.weatherjetpackcompapp.model.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor() : WeatherRepository {

    // Dummy Data for demonstration purposes
    private val weatherData = mapOf(
        "New York" to WeatherInfo("New York", 22, "Partly Cloudy"),
        "London" to WeatherInfo("London", 18, "Rainy"),
        "Tokyo" to WeatherInfo("Tokyo", 25, "Sunny"),
        "Paris" to WeatherInfo("Paris", 20, "Cloudy"),
        "Sydney" to WeatherInfo("Sydney", 28, "Sunny"),
    )

    override fun getWeatherForLocation(location: String): WeatherInfo {
        // Return weather data for the given location
        return weatherData[location] ?: WeatherInfo(location, 0, "Unknown")
    }

    override fun getAllLocations(): List<String> {
        return weatherData.keys.toList()

    }
}