package com.tieto.weather.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SupportedCities {
	private static SupportedCities sc = new SupportedCities();
	private static Scanner scanner;
	private static Scanner scanner2;
	private Map<String, String> cities;
	

	private SupportedCities(){
		
	}

	public Map<String,String> citiesToMap(String configCities) {
		cities = new HashMap<String, String>();
		
		scanner = new Scanner(configCities);
		Scanner countryScaner = scanner.useDelimiter(";");
		while (countryScaner.hasNext()) {

			String countryBlock = countryScaner.next();
			scanner2 = new Scanner(countryBlock);
			Scanner cityScaner = scanner2.useDelimiter("\\w*:|,");
			String country = cityScaner.findInLine("\\w*:").replace(":", "");
			while (cityScaner.hasNext()) {
				String city = cityScaner.next();
				cities.put(city, country);
			}
			cityScaner.close();
		}
		countryScaner.close();
		
		return cities;
	}
	
	
	public static SupportedCities getInstance(){
		return sc;
	}
	
	public Map<String, String> getCities() {
		return cities;
	}

}
