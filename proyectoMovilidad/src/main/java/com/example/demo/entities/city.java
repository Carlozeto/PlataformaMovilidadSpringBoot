package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class city {

	@Id
	private int cityId;
	private String cityName;
	private int cityRouteAreaId;
	
	public city(int cityId, String cityName, int cityRouteAreaId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityRouteAreaId = cityRouteAreaId;
	}

	public city(String cityName, int cityRouteAreaId) {
		super();
		this.cityName = cityName;
		this.cityRouteAreaId = cityRouteAreaId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityRouteAreaId() {
		return cityRouteAreaId;
	}

	public void setCityRouteAreaId(int cityRouteAreaId) {
		this.cityRouteAreaId = cityRouteAreaId;
	}
	
	
}
