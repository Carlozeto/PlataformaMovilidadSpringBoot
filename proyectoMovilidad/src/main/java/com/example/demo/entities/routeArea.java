package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class routeArea {

	private int routeAreaId;
	private String routeAreaName;
	
	
	public routeArea(String routeAreaName) {
		super();
		this.routeAreaName = routeAreaName;
	}

	public routeArea(int routeAreaId, String routeAreaName) {
		super();
		this.routeAreaId = routeAreaId;
		this.routeAreaName = routeAreaName;
	}

	public int getRouteAreaId() {
		return routeAreaId;
	}

	public void setRouteAreaId(int routeAreaId) {
		this.routeAreaId = routeAreaId;
	}

	public String getRouteAreaName() {
		return routeAreaName;
	}

	public void setRouteAreaName(String routeAreaName) {
		this.routeAreaName = routeAreaName;
	}
	
	
}
