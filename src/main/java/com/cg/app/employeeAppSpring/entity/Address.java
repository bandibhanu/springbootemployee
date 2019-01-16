package com.cg.app.employeeAppSpring.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	 private String flatlib;
	 private String name;
	 public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [flatlib=" + flatlib + ", name=" + name + ", street=" + street + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
	public Address(String flatlib, String name, String street, String city, String pincode) {
		super();
		this.flatlib = flatlib;
		this.name = name;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public String getFlatlib() {
		return flatlib;
	}
	public void setFlatlib(String flatlib) {
		this.flatlib = flatlib;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	private String street;
	 private String city;
	 private String pincode;


}
