package com.qa.animals;

public class Animal {
	
	private int limbs;
	private boolean canFly;
	private String species;
	
	
	
	public Animal(int limbs, boolean canFly, String species) {
		super();
		this.limbs = limbs;
		this.canFly = canFly;
		this.species = species;
	}
	
	public void makeNoise() {
		System.out.println("Aug");
	}
	
	public int getLimbs() {
		return limbs;
	}
	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Animal [limbs=" + limbs + ", canFly=" + canFly + ", species=" + species + "]";
	}
	
	
}
