package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class owner {

	@Id
	private String ownerId;
	private String ownerFirstName;
	private String ownerLastName;
	private String ownerCellphone;
	
	public owner() {
		super();
	}

	public owner(String ownerId, String ownerFirstName, String ownerLastName, String ownerCellphone) {
		super();
		this.ownerId = ownerId;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.ownerCellphone = ownerCellphone;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getOwnerCellphone() {
		return ownerCellphone;
	}

	public void setOwnerCellphone(String ownerCellphone) {
		this.ownerCellphone = ownerCellphone;
	}
	
}
