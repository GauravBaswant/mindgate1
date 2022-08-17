package com.mindgate.pojo;

public class Address {
	private int addressid;
	private String housenumber;
	private String buildingName;
	private String street;
	private String city;
	private String pin;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int addressid, String housenumber, String buildingName, String street, String city, String pin) {
		super();
		this.addressid = addressid;
		this.housenumber = housenumber;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", housenumber=" + housenumber + ", buildingName=" + buildingName
				+ ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
}
