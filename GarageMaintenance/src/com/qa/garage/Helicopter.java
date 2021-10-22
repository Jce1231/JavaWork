package com.qa.garage;

public class Helicopter extends Vehicle{
	//
	//
//		You should create atleast 3 child classes extending off of Vehicle
	//
//		(car, bike, helicopter)
	//
//		Each child class should inherit the fields AND have 2 specific fields
	private int propCount;
	private boolean isArmed;
	public Helicopter(String name, int maxHealth, int curHealth, boolean isInsured, int propCount, boolean isArmed) {
		super(name, maxHealth, curHealth, isInsured);
		this.propCount = propCount;
		this.isArmed = isArmed;
	}
	public int getPropCount() {
		return propCount;
	}
	public void setPropCount(int propCount) {
		this.propCount = propCount;
	}
	public boolean isArmed() {
		return isArmed;
	}
	public void setArmed(boolean isArmed) {
		this.isArmed = isArmed;
	}
	@Override
	public String toString() {
//		return "Helicopter [propCount=" + propCount + ", isArmed=" + isArmed + ", toString()=" + super.toString() + "]";
		return "\nHelicopter [\n"+ super.toString() + "\npropellerCount=" + propCount + "\nisArmed=" + isArmed + "]\n";
	}
	
	
}
