package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class route {

	@Id
	private int routeId;
	private String routeName;
	private String routeBoard;
	private String routeCol;
	private int routeRouteAreaId;
	
	public route(String routeName, String routeBoard, String routeCol, int routeRouteAreaId) {
		super();
		this.routeName = routeName;
		this.routeBoard = routeBoard;
		this.routeCol = routeCol;
		this.routeRouteAreaId = routeRouteAreaId;
	}

	public route(int routeId, String routeName, String routeBoard, String routeCol, int routeRouteAreaId) {
		super();
		this.routeId = routeId;
		this.routeName = routeName;
		this.routeBoard = routeBoard;
		this.routeCol = routeCol;
		this.routeRouteAreaId = routeRouteAreaId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteBoard() {
		return routeBoard;
	}

	public void setRouteBoard(String routeBoard) {
		this.routeBoard = routeBoard;
	}

	public String getRouteCol() {
		return routeCol;
	}

	public void setRouteCol(String routeCol) {
		this.routeCol = routeCol;
	}

	public int getRouteRouteAreaId() {
		return routeRouteAreaId;
	}

	public void setRouteRouteAreaId(int routeRouteAreaId) {
		this.routeRouteAreaId = routeRouteAreaId;
	}
	
	
	
}
