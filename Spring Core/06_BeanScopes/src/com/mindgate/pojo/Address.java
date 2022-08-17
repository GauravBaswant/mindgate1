package com.mindgate.pojo;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Address {
	private int addressid;
	private String housenumber;
	private String buildingName;
	public Address() {
System.out.println("default constructor of address constructor");
	}
	public Address(int addressid, String housenumber, String buildingName) {
		super();
		this.addressid = addressid;
		this.housenumber = housenumber;
		this.buildingName = buildingName;
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
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", housenumber=" + housenumber + ", buildingName=" + buildingName
				+ "]";
	}
	
}
