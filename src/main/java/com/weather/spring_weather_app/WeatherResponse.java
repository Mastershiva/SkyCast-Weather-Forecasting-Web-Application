package com.weather.spring_weather_app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Main getMain() {
	return main;
}
public void setMain(Main main) {
	this.main = main;
}
public Weather[] getWeather() {
	return weather;
}
public void setWeather(Weather[] weather) {
	this.weather = weather;
}
private Main main;
private Weather[] weather;

private Wind wind;
	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

}
class Main{
	private double temp;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	private  int humidity;

	private double feels_like;

	public double getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}

	private double temp_min;

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	private double temp_max;

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
}
class Weather{
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}


