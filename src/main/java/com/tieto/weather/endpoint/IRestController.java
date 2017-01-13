package com.tieto.weather.endpoint;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public interface IRestController {
	public List<WeatherRest> weather();
	public WeatherRest weather(@PathVariable String city);
	
}
