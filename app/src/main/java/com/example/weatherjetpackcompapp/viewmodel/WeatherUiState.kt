package com.example.weatherjetpackcompapp.viewmodel

import com.example.weatherjetpackcompapp.model.WeatherInfo

// Defines a fixed set of subclasses
open class WeatherUiState {
    object Loading : WeatherUiState()
    data class Success(val weatherInfo: WeatherInfo) : WeatherUiState()
    data class Error(val message: String) : WeatherUiState()
}
