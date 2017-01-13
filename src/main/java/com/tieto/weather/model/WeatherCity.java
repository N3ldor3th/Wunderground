package com.tieto.weather.model;

import io.spring.guides.gs_producing_web_service.WindDirection;

import java.util.Date;

public class WeatherCity {
	final private Location location;
	final private Date observationTime;
	final private float temperatureCelsius;
	final private int relativeHumidity;
	final private float windSpeed;
	final private WindDirection windDirection;
	final private String weatherDescription;
	final private String windDescription;

	private WeatherCity(WeatherCity.Builder builder) {
		this.location = builder.location;
		this.observationTime = builder.observationTime;
		this.temperatureCelsius = builder.temperatureCelsius;
		this.relativeHumidity = builder.relativeHumidity;
		this.windSpeed = builder.windSpeed;
		this.windDirection = builder.windDirection;
		this.weatherDescription = builder.weatherDescription;
		this.windDescription = builder.windDescription;

	}

	public static class Builder {
		private Location location;
		private Date observationTime;
		private float temperatureCelsius;
		private int relativeHumidity;
		private float windSpeed;
		private WindDirection windDirection;
		private String weatherDescription;
		private String windDescription;

		public Builder() {
		}

		public Builder setLocation(Location location) {
			this.location = location;
			return this;
		}

		public Builder setObservationTime(Date observationTime) {
			this.observationTime = observationTime;
			return this;
		}

		public Builder setTemperatureCelsius(float temperatureCelsius) {
			this.temperatureCelsius = temperatureCelsius;
			return this;
		}

		public Builder setRelativeHumidity(int relativeHumidity) {
			this.relativeHumidity = relativeHumidity;
			return this;
		}

		public Builder setWindSpeed(float windSpeed) {
			this.windSpeed = windSpeed;
			return this;
		}

		public Builder setWindDirection(WindDirection windDirection) {
			this.windDirection = windDirection;
			return this;
		}

		public Builder setWeatherDescription(String weatherDescription) {
			this.weatherDescription = weatherDescription;
			return this;
		}

		public Builder setWindDescription(String windDescription) {
			this.windDescription = windDescription;
			return this;
		}

		public WeatherCity build() {
			return new WeatherCity(this);
		}
	}

	public Location getLocation() {
		return location;
	}

	public Date getObservationTime() {
		return observationTime;
	}

	public float getTemperatureCelsius() {
		return temperatureCelsius;
	}

	public int getRelativeHumidity() {
		return relativeHumidity;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public WindDirection getWindDirection() {
		return windDirection;
	}

	public String getWeatherDescription() {
		return weatherDescription;
	}

	public String getWindDescription() {
		return windDescription;
	}

	@Override
	public boolean equals(Object o) {
		Boolean bool = false;
		if (!(o instanceof WeatherCity)) {
			return bool;
		}
		WeatherCity wcNew = (WeatherCity) o;

		if (location.getCity().equals(wcNew.location.getCity())
				&& location.getCountry().equals(wcNew.location.getCountry())
				&& observationTime.equals(wcNew.getObservationTime())
				&& temperatureCelsius == wcNew.getTemperatureCelsius()
				&& relativeHumidity == wcNew.getRelativeHumidity()
				&& windSpeed == wcNew.getWindSpeed()
				&& windDirection.equals(wcNew.getWindDirection())
				&& weatherDescription.equals(wcNew.getWeatherDescription())
				&& windDescription.equals(wcNew.getWindDescription())) {
			bool = true;

		}

		return bool;
	}

	@Override
	public String toString() {
		return "location: " + location + "\n" + "observationTime: "
				+ observationTime + "\n" + "temperatureCelsius: "
				+ temperatureCelsius + "\n" + "relativeHumidity: "
				+ relativeHumidity + "\n" + "windSpeed: " + windSpeed + "\n"
				+ "windDirection: " + windDirection + "\n"
				+ "weatherDescription: " + weatherDescription + "\n"
				+ "windDescription: " + windDescription;
	}

}
