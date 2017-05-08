package com.warrengreen.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String name;
	private List<Address> addresses;
	
	public User (){
		this.addresses = new ArrayList<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void addAddress(Address address) {
		addresses.add(address);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
	
	
	
}
