package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class parade {

	@Id
	 private int paradeId;
	    private String paradeName;
	    private String latitude;
	    private String longtitude;
	    private String routeId;

	    
	    public parade(String paradeName, String latitude, String longtitude, String routeId) {
			super();
			this.paradeName = paradeName;
			this.latitude = latitude;
			this.longtitude = longtitude;
			this.routeId = routeId;
		}


		public parade (int paradeId, String paradeName, String latitude, String longtitude, String routeId) {
	        this.paradeId = paradeId;
	        this.paradeName = paradeName;
	        this.latitude = latitude;
	        this.longtitude = longtitude;
	        this.routeId = routeId;
	    }


		public int getParadeId() {
			return paradeId;
		}


		public void setParadeId(int paradeId) {
			this.paradeId = paradeId;
		}


		public String getParadeName() {
			return paradeName;
		}


		public void setParadeName(String paradeName) {
			this.paradeName = paradeName;
		}


		public String getLatitude() {
			return latitude;
		}


		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}


		public String getLongtitude() {
			return longtitude;
		}


		public void setLongtitude(String longtitude) {
			this.longtitude = longtitude;
		}


		public String getRouteId() {
			return routeId;
		}


		public void setRouteId(String routeId) {
			this.routeId = routeId;
		}
	
		
}
