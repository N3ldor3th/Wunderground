//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 04:33:20 PM CET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weatherSoap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weatherSoap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observationTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temperatureCelsius" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windDirection" type="{http://spring.io/guides/gs-producing-web-service}windDirection"/>
 *         &lt;element name="weatherDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weatherSoap", propOrder = {
    "location",
    "observationTime",
    "temperatureCelsius",
    "relativeHumidity",
    "windSpeed",
    "windDirection",
    "weatherDescription",
    "windDescription"
})
public class WeatherSoap {

    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String observationTime;
    @XmlElement(required = true)
    protected String temperatureCelsius;
    @XmlElement(required = true)
    protected String relativeHumidity;
    @XmlElement(required = true)
    protected String windSpeed;
    @XmlElement(required = true)
    protected WindDirection windDirection;
    @XmlElement(required = true)
    protected String weatherDescription;
    @XmlElement(required = true)
    protected String windDescription;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the observationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationTime(String value) {
        this.observationTime = value;
    }

    /**
     * Gets the value of the temperatureCelsius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureCelsius() {
        return temperatureCelsius;
    }

    /**
     * Sets the value of the temperatureCelsius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureCelsius(String value) {
        this.temperatureCelsius = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeHumidity(String value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindSpeed(String value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link WindDirection }
     *     
     */
    public WindDirection getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindDirection }
     *     
     */
    public void setWindDirection(WindDirection value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the weatherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherDescription() {
        return weatherDescription;
    }

    /**
     * Sets the value of the weatherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherDescription(String value) {
        this.weatherDescription = value;
    }

    /**
     * Gets the value of the windDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDescription() {
        return windDescription;
    }

    /**
     * Sets the value of the windDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDescription(String value) {
        this.windDescription = value;
    }

}
