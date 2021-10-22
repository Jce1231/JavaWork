package com.qa.animals;

public class Cats extends Mamal {
	private String catName;
	private int jumpHeight;
	private int yLoc = 0;
	
	
	
	

	
	public int getyLoc() {
		return yLoc;
	}
	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}
	public Cats(int limbs, boolean canFly, String species, int size, boolean hasTail, String catName, int jumpHeight) {
		super(limbs, canFly, species, size, hasTail);
		this.catName = catName;
		this.jumpHeight = jumpHeight;
	}
	@Override
	public void makeNoise() {
		System.out.println("purRRrrrRRr");
	}
	public void jump() {
		System.out.println("I have jumped " + this.jumpHeight + " meters forward");
		for (int i = 0; i < this.jumpHeight; i++) {
			this.yLoc++;
			System.out.println("I'm " + this.yLoc+ " meters in the sky");
		}
		for (int i = 0; i < this.jumpHeight; i++) {
			this.yLoc--;
			System.out.println("I'm coming down!!!: " + this.yLoc);
		}
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getJumpHeight() {
		return jumpHeight;
	}

	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
	}
	@Override
	public String toString() {
		return "Cats [catName=" + catName + ", jumpHeight=" + jumpHeight + ", yLoc=" + yLoc + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
