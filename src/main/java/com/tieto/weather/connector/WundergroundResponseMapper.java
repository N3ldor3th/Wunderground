package com.tieto.weather.connector;

import java.util.Date;

import org.springframework.stereotype.Component;

import generated.Response;
import generated.Response.CurrentObservation;

import com.tieto.weather.model.Location;
import com.tieto.weather.model.WeatherCity;

import io.spring.guides.gs_producing_web_service.WindDirection;

@Component
public class WundergroundResponseMapper {
	private static WundergroundResponseMapper wrm = new WundergroundResponseMapper();
	WeatherCity target;

	private WundergroundResponseMapper() {

	}

	public WeatherCity mapWundergroundResponse(Response source) {

		CurrentObservation observation = source.getCurrentObservation();

		target = new WeatherCity.Builder()
				.setLocation(
						new Location(
								observation.getDisplayLocation().getCity(),
								observation.getDisplayLocation().getStateName()))
				.setObservationTime(
						new Date(observation.getObservationEpoch() * 1000L))
				.setTemperatureCelsius(observation.getTempC())
				.setRelativeHumidity(
						Integer.valueOf(observation.getRelativeHumidity()
								.substring(
										0,
										observation.getRelativeHumidity()
												.length() - 1)))
				.setWeatherDescription(observation.getWeather())
				.setWindDescription(observation.getWindString())
				.setWindDirection(
						WindDirection.fromValue(observation.getWindDir()))
				.setWindSpeed(observation.getWindKph()).build();

		return target;
	}

	public static WundergroundResponseMapper getInstance() {
		return wrm;
	}

}
