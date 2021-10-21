package com.qa.classExample;

import java.util.ArrayList;

public class Pizza {
//	Exercise -
//	Pizzas
//	Create a class with that name Car etc
//	Create atleast 4 fields and 1 method (syso something..)
//	Create a constructor with some values
//	With your main method, create an object and syso the values and run the method
	ArrayList<String> toppings = new ArrayList<>();
	int size;
	String shape;
	int pieces;
	
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
