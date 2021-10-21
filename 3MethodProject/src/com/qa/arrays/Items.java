package com.qa.arrays;

public class Items {
	String name;
	String size;
	String extra;
	double price;
//	int orderID;
//	totalOrders++;
//	this.orderID = totalOrders;
//	public static int totalOrders;
	public Items(String size, String name, String extra) {
		this.name = name;
		this.size = size;
		this.extra = extra;

		this.price = getPrice();
	}
	
	private double getPrice() {
		double cost = 0d;
		switch(this.size) {
		case "Small":
			cost += 0;
			break;
		case "Medium":
			cost += 0.4;
			break;
		case "Large":
			cost +=0.8;
			break;
		}
		cost += 2.5;
		if (this.extra != "") {
			cost += 0.6;
		}
		return cost;
		}
	@Override
	public String toString() {
//		return "Orders [name=" + name + ", size=" + size + ", extra=" + extra + "]";
		return "£" +price + " : "+ size +" "+ name + " W/ " + extra+"\n";
	}
	
}
