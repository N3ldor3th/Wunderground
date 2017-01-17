package com.tieto.weather.connector;

import generated.Response;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.tieto.weather.config.PropertiesFactory;
import com.tieto.weather.model.WeatherCity;

@Component
public class WundergroundConnector implements IWundergroundConnector {
	private final static WundergroundConnector instance = new WundergroundConnector();
	private final RestTemplate restTemplate = new RestTemplate();
	private final String apikey = PropertiesFactory.getInstance()
			.loadProperties("src/main/resources/apikey.properties");
	private final String url = PropertiesFactory.getInstance().loadProperties(
			"src/main/resources/url.properties");

	private WundergroundConnector() {

	}

	public WeatherCity getWeather(String city, String country) {

		Response response = restTemplate.getForObject(url, Response.class,apikey, country, city);
		WeatherCity weatherCity = WundergroundResponseMapper.getInstance().mapWundergroundResponse(response);

		return weatherCity;
	}

	public static WundergroundConnector getInstance() {
		return instance;
	}

}
