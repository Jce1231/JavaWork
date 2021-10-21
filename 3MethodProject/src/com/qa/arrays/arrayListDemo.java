package com.qa.arrays;

import java.util.ArrayList;

public class arrayListDemo {
//	Exercise - You are running a succesful cafe called QA-Cafe.
//	With a list of orders, create methods with paramaters
//	that can do the following:
//		2 ArrayLists, one doneOrders and orders
//	public static ArrayList<O> orderedList = new ArrayList<>();
	public static ArrayList<Items> orderList = new ArrayList<>();
	public static ArrayList<Items> doneOrders = new ArrayList<>();
////	
	
	
//	So notes for self, I've created a way to add an array to an object,
//	and store that in an array.
//
//	Then iterate through and calculate the price.
//
//	To do, change how I handle orders and create them..
	
	
	
//		- Add a new order to an orders array
	public static void addOrder(Items item) {
		orderList.add(item);
	}
//		- Move an existing order to a 'Done orders array'
	public static void moveOrder(int index) {
		doneOrders.add(getOrder(index));
		removeOrder(false,index);
	}
//		- Return the name of an order
	public static Items getOrder(int index) {
		return orderList.get(index);
	}
//		- Modify the order by index with a new name
	public static void updateOrder(int index, Items text) {
		orderList.set(index, text);
	}
//		- Remove the order from either arrays
	public static void removeOrder(boolean orderDone, int index) {
		if (orderDone) {
			doneOrders.remove(index);
		}else {
			orderList.remove(index);
		}
	}
//		- Print the length of either arrays
	public static int ordersLength(boolean orderDone){
		if (orderDone) {
			return doneOrders.size();
		}else {
			return orderList.size();
		}
	}
//		- Clear either arrays
	public static void clearOrders(boolean orderDone) {
		if (orderDone) {
			doneOrders.clear();
		}else {
			orderList.clear();
		}
	}
	
//	List of Orders
	public static void setupArrayList() {
		addOrder(new Items("Small","Espresso","Chocolate"));
		addOrder(new Items("Large","Cold Brew","double shot"));
		addOrder(new Items("Medium","Cappucino","Oat Milk"));
		addOrder(new Items("Medium", "Flat White",""));
		addOrder(new Items("Large", "Choc Cookie Frappe","Sugar free syrup"));
		addOrder(new Items("Small" ,"Caramel Iced Latte","Honeycomb dust"));
		addOrder(new Items("Small" ,"Americano",""));
		addOrder(new Items("Large", "Cafe Au Lait","Extra Milk"));
		addOrder(new Items("Medium", "Strawberry Iced Tea",""));
	}
}
