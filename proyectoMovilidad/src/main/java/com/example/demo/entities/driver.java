package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class driver {

	@Id
	private String driverId;
    private String driverFirstName;
    private String driverLastName;

    public driver (String driverId, String driverFirstName, String driverLastName) {
        this.driverId = driverId;
        this.driverFirstName = driverFirstName; 
        this.driverLastName = driverLastName; 
    }

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getDriverFirstName() {
		return driverFirstName;
	}

	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}

	public String getDriverLastName() {
		return driverLastName;
	}

	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}
    

}
