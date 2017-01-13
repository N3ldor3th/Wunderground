package com.tieto.weather.model;

import org.springframework.stereotype.Component;

@Component
public class Location {
	String city;
	String country;
	
	public Location(){
	}
	
	public Location(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return city + ", " + country;
	}
	
	
	
	
}
