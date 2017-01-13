package com.tieto.weather.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tieto.weather.exceptions.BadRequestException;
import com.tieto.weather.mapper.WeatherRestMapper;
import com.tieto.weather.model.WeatherCity;
import com.tieto.weather.service.IWeatherService;

@RestController
@Component
public class WeatherRestController implements IRestController{
	@Autowired
	WeatherRestMapper mapper;
	@Autowired
	IWeatherService service;
	
	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	@ResponseBody
	public List<WeatherRest> weather() {
		List<WeatherRest> cities = new ArrayList<WeatherRest>();
		
		for (WeatherCity city : service.getWeather()) {
			cities.add(mapper.mapRestResponse(city));
		}
		
		return cities;
	}
	
	@RequestMapping(value = "/weather/{city}", method = RequestMethod.GET)
	@ResponseBody
	public WeatherRest weather(@PathVariable String city) {
		WeatherRest wr = mapper.mapRestResponse(service.getWeather(city));
		if(wr.getLocation()==null){
			throw new BadRequestException();
		}

		return wr;
	}

}
