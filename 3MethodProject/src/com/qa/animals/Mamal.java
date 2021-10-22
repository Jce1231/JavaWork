package com.qa.animals;

public class Mamal extends Animal{
	private int size;
	private boolean hasTail;
	public Mamal(int limbs, boolean canFly, String species, int size, boolean hasTail) {
		super(limbs, canFly, species);
		this.size = size;
		this.hasTail = hasTail;
	}
	
	public void moveAnimal(){
		System.out.println("I'm walkin over here");
	}
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isHasTail() {
		return hasTail;
	}
	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	@Override
	public String toString() {
		return "Mamal [size=" + size + ", hasTail=" + hasTail + ", toString()=" + super.toString() + "]";
	}
	
}
