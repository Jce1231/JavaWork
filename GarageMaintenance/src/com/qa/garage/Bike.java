package com.qa.garage;

public class Bike extends Vehicle{
	//
	//
//		You should create atleast 3 child classes extending off of Vehicle
	//
//		(car, bike, helicopter)
	//
//		Each child class should inherit the fields AND have 2 specific fields
	private int noOfWheels;
	private boolean helmetRequired;
	public Bike(String name, int maxHealth, int curHealth, boolean isInsured, boolean helmetRequired) {
		super(name, maxHealth, curHealth, isInsured);
		this.noOfWheels = 2;
		this.helmetRequired = helmetRequired;
	}
	public boolean isHelmetRequired() {
		return helmetRequired;
	}
	public void setHelmetRequired(boolean helmetRequired) {
		this.helmetRequired = helmetRequired;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	@Override
	public String toString() {
//		return "Bike [noOfWheels=" + noOfWheels + ", helmetRequired=" + helmetRequired + ", toString()="
//				+ super.toString() + "]";
		return "\nBike [\n"+super.toString() + "\nnoOfWheels=" + noOfWheels + "\nhelmetRequired=" + helmetRequired + "]\n";
	}
	
}
