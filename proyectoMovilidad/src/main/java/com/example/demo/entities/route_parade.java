package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class route_parade {

	@Id
	private int routeId;
	private int paradeId;
	
	public route_parade() {
		super();
	}
	
	public route_parade(int routeId, int paradeId) {
		super();
		this.routeId = routeId;
		this.paradeId = paradeId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getParadeId() {
		return paradeId;
	}

	public void setParadeId(int paradeId) {
		this.paradeId = paradeId;
	}
	
	
	
}
