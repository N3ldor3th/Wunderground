package com.tieto.weather.service;

import io.spring.guides.gs_producing_web_service.GetWeatherRequest;
import java.util.List;
import com.tieto.weather.model.WeatherCity;

public interface IWeatherService {

	public List<WeatherCity> getWeather();
	public WeatherCity getWeather(String city);
	public List<WeatherCity> getWeather(GetWeatherRequest request);
	
}