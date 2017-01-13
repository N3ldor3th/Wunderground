package com.tieto.weather.endpoint;

import io.spring.guides.gs_producing_web_service.GetWeatherRequest;
import io.spring.guides.gs_producing_web_service.GetWeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.tieto.weather.mapper.WeatherSoapMapper;
import com.tieto.weather.model.WeatherCity;
import com.tieto.weather.service.WeatherService;

@Endpoint
@Component
public class WeatherSoapEndpoint implements ISoapEndpoint {
	public static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
	@Autowired
	WeatherService ws;
	@Autowired
	WeatherSoapMapper wsm;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWeatherRequest")
	@ResponsePayload
	public GetWeatherResponse getWeather(@RequestPayload GetWeatherRequest request) {
		GetWeatherResponse response = new GetWeatherResponse();
		
		for (WeatherCity wc : ws.getWeather(request)) {
			response.getWeatherSoap().add(wsm.mapSoapResponse(wc));
		}
		
		return response;
	}
}
