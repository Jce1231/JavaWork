package com.qa.arrays;

public class Orders {
	String name;
	String size;
	String extra;
	public Orders(String size, String name, String extra) {
		this.name = name;
		this.size = size;
		this.extra = extra;
	}
	@Override
	public String toString() {
//		return "Orders [name=" + name + ", size=" + size + ", extra=" + extra + "]";
		return size +" "+ name + " W/ " + extra; 
	}
	
}
