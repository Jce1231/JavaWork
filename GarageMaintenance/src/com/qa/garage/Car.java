package com.qa.garage;

public class Car extends Vehicle {
	//
	//
//		You should create atleast 3 child classes extending off of Vehicle
	//
//		(car, bike, helicopter)
	//
//		Each child class should inherit the fields AND have 2 specific fields
	private int noOfDoors;
	private String licenseID;
	public Car(String name, int maxHealth, int curHealth, boolean isInsured, int noOfDoors, String licenseID) {
		super(name, maxHealth, curHealth, isInsured);
		this.noOfDoors = noOfDoors;
		this.licenseID = licenseID;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public String getLicenseID() {
		return licenseID;
	}
	public void setLicenseID(String licenseID) {
		this.licenseID = licenseID;
	}
	@Override
	public String toString() {
//		return "Car [noOfDoors=" + noOfDoors + ", licenseID=" + licenseID + ", toString()=" + super.toString() + "]";
		return "\nCar [\n" + super.toString() + "\nnoOfDoors=" + noOfDoors + "\nlicenseID=" + licenseID + "]\n";
	}
	
}
