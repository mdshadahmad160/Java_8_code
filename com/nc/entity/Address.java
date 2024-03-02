package com.nc.entity;

/**
 * @author Shad Ahmad
 * @since 27/12/2024
 */

public class Address {
	
	private String homeAddress;
	private String officeAddress;
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Address(String homeAddress, String officeAddress) {
		super();
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	
	public Address() {
	}
	@Override
	public String toString() {
		return "Address [homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + "]";
	}
	
	
}
