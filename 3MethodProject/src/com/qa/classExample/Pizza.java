package com.qa.classExample;

import java.util.ArrayList;

public class Pizza {
//	Exercise -
//	Pizzas
//	Create a class with that name Car etc
//	Create atleast 4 fields and 1 method (syso something..)
//	Create a constructor with some values
//	With your main method, create an object and syso the values and run the method
	private ArrayList<String> toppings = new ArrayList<>();
	private int size;
	private String shape;
	private int pieces;
	
	public ArrayList<String> getToppings() {
		return toppings;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size > 22) {
			System.out.println("This is too big for the over m'dude");
			return;
		}
		this.size = size;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		if (pieces > (size/10)) {
			System.out.println("That's gonna be too thin of a slice m'guy");
			return;
		}
		this.pieces = pieces;
	}

	public String getShape() {
		return shape;
	}

	public Pizza(int size, String shape, int pieces) {
		this.size = size;
		this.shape = shape;
		this.pieces = pieces;
	}
	
	public void addTopping(String topp) {
		this.toppings.add(topp);
	}
	public void eatPizza() {
		this.pieces -= 1;
	}
	public void eatPizza(int a) {
		this.pieces -= a;
	}
	@Override
	public String toString() {
		return "Pizza [toppings=" + toppings + ", size=" + size + ", shape=" + shape + ", pieces=" + pieces + "]";
	}
	
}
