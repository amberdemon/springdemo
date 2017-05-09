package com.warrengreen.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Address {
	private int id;
	private int doorNumber;
	private String streetName;
	private String postcode;
	private User owner;

	
	
	
	public Address(int id, int doorNumber, String streetName, String postcode) {
		super();
		this.id = id;
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.postcode = postcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", doorNumber=" + doorNumber + ", streetName=" + streetName + ", postcode="
				+ postcode + ", owner=" + owner.getId() + "]";
	}
	
	

}
