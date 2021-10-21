package com.qa.arrays;

import java.util.ArrayList;

public class Orders {
	double orderTotal;
	int orderID;
	public static int totalOrders;
	ArrayList<Items> items = new ArrayList<>();
	public Orders() {
		this.items = new ArrayList<>();
		totalOrders++;
		this.orderID = totalOrders;
	}
	public void addItem(Items item) {
		this.items.add(item);
		calOrderTotal();
	}
	public void calOrderTotal() {
		double total = 0d;
		for (Items a : this.items) {
			total += a.price;
		}
		this.orderTotal = total;
	}
	@Override
	public String toString() {
		return "orderID=" + orderID + "\n" + items + " \n Total Price: " + this.orderTotal;
	}
}
