package com.qa.arrays;

import java.util.ArrayList;

public class Orders {
	double orderTotal;
	int orderID;
	public static int totalOrders;
	ArrayList<Items> items = new ArrayList<>();
	public Orders(Items item) {
		this.items.add(item);
		totalOrders++;
		this.orderID = totalOrders;
	}
	public double calOrderTotal() {
		double total = 0d;
		for (Items a : this.items) {
			total += a.price;
		}
		return total;
	}
}
