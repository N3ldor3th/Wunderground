package com.tieto.weather.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tieto.weather.PropertiesFactory;
import com.tieto.weather.SupportedCities;
import com.tieto.weather.connector.WundergroundConnector;
import com.tieto.weather.model.WeatherCity;

import io.spring.guides.gs_producing_web_service.GetWeatherRequest;

@Component
@EnableScheduling
public class WeatherService implements IWeatherService {
	private WeatherCityCollection supportedCities = WeatherCityCollection.getInstance();
	

	@Scheduled(fixedDelay = 60000) // 1 minute
	public void updateWeather() {
		String configCities = PropertiesFactory.getInstance().loadProperties("src/main/resources/cities.properties");
		Map<String,String> cities = SupportedCities.getInstance().citiesToMap(configCities);

		for (Entry<String,String> entry : cities.entrySet()) {
			WeatherCity wc = WundergroundConnector.getInstance().getWeather(entry.getKey(), entry.getValue());
			
			if(!wc.equals(supportedCities.getCityFromCollection(entry.getKey()))){
				replaceCity(wc);
			}
		}
		//WeatherCityCollection.getInstance().weatherCityCollectionToPrint();
	}

	private void replaceCity(WeatherCity wc) {	
		supportedCities.clearCityInCollection(supportedCities.
				getCityFromCollection(wc.getLocation().getCity()));
		supportedCities.addCityToCollection(wc);
	}

	@Override
	public List<WeatherCity> getWeather() {		
		return WeatherCityCollection.getInstance().getCitiesCollection();
	}
	
	@Override
	public WeatherCity getWeather(String city) {		
		return WeatherCityCollection.getInstance().getCityFromCollection(city);
	}
	
	@Override
	public List<WeatherCity> getWeather(GetWeatherRequest request) {
		List<WeatherCity> cities = new ArrayList<WeatherCity>();
		
		for (String city : request.getCityName()) {
			for (WeatherCity wc : WeatherCityCollection.getInstance().getCitiesCollection()) {
				if (wc.getLocation().getCity().equals(city)) {
					cities.add(wc);
				}else if(request.getCityName().toString().equals("[]")){
					cities.add(wc);
				}
			}
		}
		return cities;
	}

}
