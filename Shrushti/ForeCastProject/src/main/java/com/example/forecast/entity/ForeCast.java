package com.example.forecast.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="forecast")
public class ForeCast {
	@Id
	@Column(name="forecast_id")
	private int forecastId;
	//@NotNull
	@Column(name="Date")
	private LocalDate date;
	@Max(50)
	@Column(name="temp")
	private int tempreture;
	@Max(10)
	@Column(name="wind_speed")
	private float windSpeed;
	@NotNull
	@Column(name="Weather_cond")
	private String weatherCondition;
	@Max(30)
	@Column(name="location")
	private  String location;
	
	
	public ForeCast() {
		// TODO Auto-generated constructor stub
	}


	public ForeCast(int forecastId, @NotNull LocalDate date, @Max(50) int tempreture, @Max(10) float windSpeed,
			@NotNull String weatherCondition, @Max(30) String location) {
		super();
		this.forecastId = forecastId;
		this.date = date;
		this.tempreture = tempreture;
		this.windSpeed = windSpeed;
		this.weatherCondition = weatherCondition;
		this.location = location;
	}


	public int getForecastId() {
		return forecastId;
	}


	public void setForecastId(int forecastId) {
		this.forecastId = forecastId;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getTempreture() {
		return tempreture;
	}


	public void setTempreture(int tempreture) {
		this.tempreture = tempreture;
	}


	public float getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}


	public String getWeatherCondition() {
		return weatherCondition;
	}


	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "ForeCast [forecastId=" + forecastId + ", date=" + date + ", tempreture=" + tempreture + ", windSpeed="
				+ windSpeed + ", weatherCondition=" + weatherCondition + ", location=" + location + "]";
	}
	
	
	

}
