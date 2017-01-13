package com.tieto.weather.mapper;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.tieto.weather.endpoint.WeatherRest;
import com.tieto.weather.exceptions.BadRequestException;
import com.tieto.weather.model.WeatherCity;

@Component
public class WeatherRestMapper {
	private static final WeatherRestMapper wrm = new WeatherRestMapper();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
	
	private WeatherRestMapper(){
		
	}
	
	public WeatherRest mapRestResponse(WeatherCity source) {
		if(source==null){
			throw new BadRequestException();
		}
			
		WeatherRest target = new WeatherRest();
		
		target.setLocation(source.getLocation().toString());
		target.setObservationTime("Last update: " + sdf.format(source.getObservationTime()));
		target.setRelativeHumidity(String.valueOf(source.getRelativeHumidity())+"%");
		target.setTemperatureCelsius(String.valueOf(source.getTemperatureCelsius() + " degrees Celsius"));
		target.setWeatherDescription(source.getWeatherDescription());
		target.setWindDescription(source.getWindDescription());
		target.setWindDirection(source.getWindDirection());
		target.setWindSpeed(String.valueOf(source.getWindSpeed()) + " km/h");	
		
			
		return target;
	}
	
	public static WeatherRestMapper getInstance(){
		return wrm;
	}
}
