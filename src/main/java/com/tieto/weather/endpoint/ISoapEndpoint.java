package com.tieto.weather.endpoint;

import io.spring.guides.gs_producing_web_service.GetWeatherRequest;
import io.spring.guides.gs_producing_web_service.GetWeatherResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public interface ISoapEndpoint {
	
	@ResponsePayload
	public GetWeatherResponse getWeather(@RequestPayload GetWeatherRequest request);
}
