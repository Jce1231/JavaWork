package com.qa.garage;


public class Vehicle {
	private String name;
	private int maxHealth;
	private int curHealth;
	private boolean isInsured;
//
//	Vehicles
//
//	Vehicle should be a base class (parent) with atleast 3 fields
//
//	and a fixVehicle() method
//

	public void fixVehicle() {
		this.curHealth += this.maxHealth/25;
	}
	
	public Vehicle(String name, int maxHealth, int curHealth, boolean isInsured) {
	super();
	this.name = name;
	this.maxHealth = maxHealth;
	this.curHealth = curHealth;
	this.isInsured = isInsured;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurHealth() {
		return curHealth;
	}
	public void setCurHealth(int curHealth) {
		this.curHealth = curHealth;
	}
	public int getMaxHealth() {
		return maxHealth;
	}
	public boolean isInsured() {
		return isInsured;
	}
	public void setInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nmaxHealth=" + maxHealth + "\ncurHealth=" + curHealth + "\nisInsured=" + isInsured;
	}


}
