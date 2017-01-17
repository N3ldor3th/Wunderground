package com.tieto.weather;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.tieto.weather.config.PropertiesFactory;
import com.tieto.weather.config.SupportedCities;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PropertiesFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoadAPIkey() {
		assertEquals("f3dbb608553ac7e7", PropertiesFactory.getInstance().loadProperties("src/main/resources/apikey.properties"));
		
		
	}
	
	@Test
	public void testLoadURLWunderground() {
		assertEquals("http://api.wunderground.com/api/{apiKey}/conditions/q/{country}/{city}.xml",
				PropertiesFactory.getInstance().loadProperties("src/main/resources/url.properties"));
		
	}
	

	
	@Test
	public void citiesToMap() {
		Map<String, String> expectedCities = new HashMap<String, String>();
		expectedCities.put("Ostrava", "czech");
		expectedCities.put("Oslo", "norway");
		expectedCities.put("Vilnius", "lithunia");
		expectedCities.put("Stockholm", "sweden");
		expectedCities.put("Helsinki", "Finland");
		
		Map<String, String> actualCities = 
				SupportedCities.getInstance().citiesToMap(PropertiesFactory.getInstance().loadProperties("src/main/resources/cities.properties"));
		
		assertNotNull(actualCities);
		assertTrue(expectedCities.size()==actualCities.size());
		assertEquals(expectedCities.keySet(),actualCities.keySet());
		assertEquals(expectedCities.get("Ostrava"),actualCities.get("Ostrava"));
	}
	
	

}
