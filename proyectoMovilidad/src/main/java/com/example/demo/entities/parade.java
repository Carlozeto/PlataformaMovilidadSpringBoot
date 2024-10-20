package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class parade {

	@Id
	 private int paradeId;
	    private String paradeName;
	    private String latitude;
	    private String longitude;
	    private String link;

	    
	    
	    public parade() {
			super();
		}


		public parade(String paradeName, String latitude, String longitude, String link) {
			super();
			this.paradeName = paradeName;
			this.latitude = latitude;
			this.longitude = longitude;
			this.link = link;
		}


		public parade (int paradeId, String paradeName, String latitude, String longitude, String link) {
	        this.paradeId = paradeId;
	        this.paradeName = paradeName;
	        this.latitude = latitude;
	        this.longitude = longitude;
	        this.link = link;
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


		public String getlongitude() {
			return longitude;
		}


		public void setlongitude(String longitude) {
			this.longitude = longitude;
		}


		public String getlink() {
			return link;
		}


		public void setlink(String link) {
			this.link = link;
		}
	
		
}
