package com.tieto.weather.endpoint;

import io.spring.guides.gs_producing_web_service.WindDirection;


public class WeatherRest {
	private String location;
	private String observationTime; 
	private String temperatureCelsius;
	private String relativeHumidity;
	private String windSpeed;
	private WindDirection windDirection;
	private String weatherDescription;
	private String windDescription;
	
	public WeatherRest(){
		
	}

	
	public String getLocation() {
		return location;
	}
	

	public void setLocation(String location) {
		this.location = location;
	}
	public String getObservationTime() {
		return observationTime;
	}
	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}
	public String getTemperatureCelsius() {
		return temperatureCelsius;
	}
	public void setTemperatureCelsius(String temperatureCelsius) {
		this.temperatureCelsius = temperatureCelsius;
	}
	public String getRelativeHumidity() {
		return relativeHumidity;
	}
	public void setRelativeHumidity(String relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public WindDirection getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(WindDirection windDirection) {
		this.windDirection = windDirection;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public String getWindDescription() {
		return windDescription;
	}
	public void setWindDescription(String windDescription) {
		this.windDescription = windDescription;
	}
	
	
}
