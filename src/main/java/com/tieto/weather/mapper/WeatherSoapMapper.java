package com.tieto.weather.mapper;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Component;
import io.spring.guides.gs_producing_web_service.WeatherSoap;
import com.tieto.weather.model.WeatherCity;

@Component
public class WeatherSoapMapper {
	private static WeatherSoapMapper wsm = new WeatherSoapMapper();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
	
	private WeatherSoapMapper(){
		
	}
	
	public WeatherSoap mapSoapResponse(WeatherCity source) {
		WeatherSoap target = new WeatherSoap();
		
		if(source!=null){
			target.setLocation(source.getLocation().toString());
			target.setObservationTime("Last update: " + sdf.format(source.getObservationTime()));
			target.setRelativeHumidity(String.valueOf(source.getRelativeHumidity())+"%");
			target.setTemperatureCelsius(String.valueOf(source.getTemperatureCelsius() + " degrees Celsius"));
			target.setWeatherDescription(source.getWeatherDescription());
			target.setWindDescription(source.getWindDescription());
			target.setWindDirection(source.getWindDirection());
			target.setWindSpeed(String.valueOf(source.getWindSpeed()) + " km/h");		
		}
		
		
		return target;
	}
	
	public static WeatherSoapMapper getInstance(){
		return wsm;
	}
	
}
