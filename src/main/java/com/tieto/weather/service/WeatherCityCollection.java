package com.tieto.weather.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tieto.weather.model.WeatherCity;


@Component
public class WeatherCityCollection extends ArrayList<WeatherCity> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static WeatherCityCollection wcc = new WeatherCityCollection();
	private List<WeatherCity> citiesCollection = new ArrayList<WeatherCity>();
	
	private WeatherCityCollection() {

	}
	
	public List<WeatherCity> getCitiesCollection() {
		return citiesCollection;
	}

	public void setCitiesCollection(List<WeatherCity> cities) {
		this.citiesCollection = cities;
	}
	
	public void addCityToCollection(WeatherCity wc){
		this.citiesCollection.add(wc);
	}
	
	public WeatherCity getCityFromCollection(String name){
		WeatherCity wc = null;
		
		for (WeatherCity weatherCity : citiesCollection) {
			if(weatherCity.getLocation().getCity().equals(name)){
				wc=weatherCity;
			}
		}
		return wc;
	}
	

	public void clearCityInCollection(WeatherCity wc){
		this.getCitiesCollection().remove(wc);
	}
	

	public void weatherCityCollectionToPrint() {
		for (WeatherCity weatherCity : citiesCollection) {
			System.out.println(weatherCity);
			System.out.println();
		}
	}
	
	public static WeatherCityCollection getInstance()
	{
		return wcc;
	}

	

	
	
	
	
	
	
	
}
