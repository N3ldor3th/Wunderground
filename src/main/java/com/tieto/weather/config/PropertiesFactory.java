package com.tieto.weather.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;


import org.springframework.stereotype.Component;

@Component
public class PropertiesFactory {
	
	private static PropertiesFactory pf = new PropertiesFactory();
	private Map<String, String> cities;
	

	private PropertiesFactory(){
		
	}

	
	public String loadProperties(String file){
		String prop = null;

		try {
			File namefile = new File(file);
			FileReader namereader = new FileReader(namefile);
			BufferedReader in = new BufferedReader(namereader);
			prop = in.readLine();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public static PropertiesFactory getInstance(){
		return pf;
	}
	
	public Map<String, String> getCities() {
		return cities;
	}



}
