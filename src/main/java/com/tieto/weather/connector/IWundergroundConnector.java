package com.tieto.weather.connector;

import com.tieto.weather.model.WeatherCity;

public interface IWundergroundConnector {

	public WeatherCity getWeather(String city, String country);
	
}
