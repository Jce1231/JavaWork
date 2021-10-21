package com.qa.arrays;

import java.util.ArrayList;

public class arrayListDemo {
//	Exercise - You are running a succesful cafe called QA-Cafe.
//	With a list of orders, create methods with paramaters
//	that can do the following:
//		2 ArrayLists, one doneOrders and orders
	public static ArrayList<Orders> orderList = new ArrayList<>();
	public static ArrayList<Orders> doneOrders = new ArrayList<>();
//	
//		- Add a new order to an orders array
	public static void addOrder(Orders item) {
		orderList.add(item);
	}
//		- Move an existing order to a 'Done orders array'
	public static void moveOrder(int index) {
		doneOrders.add(getOrder(index));
		removeOrder(false,index);
	}
//		- Return the name of an order
	public static Orders getOrder(int index) {
		return orderList.get(index);
	}
//		- Modify the order by index with a new name
	public static void updateOrder(int index, Orders text) {
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
		addOrder(new Orders("Small","Espresso","Chocolate"));
		addOrder(new Orders("Large","Cold Brew","double shot"));
		addOrder(new Orders("Medium","Cappucino","Oat Milk"));
		addOrder(new Orders("Medium", "Flat White",""));
		addOrder(new Orders("Large", "Choc Cookie Frappe","Sugar free syrup"));
		addOrder(new Orders("Small" ,"Caramel Iced Latte","Honeycomb dust"));
		addOrder(new Orders("Small" ,"Americano",""));
		addOrder(new Orders("Large", "Cafe Au Lait","Extra Milk"));
		addOrder(new Orders("Medium", "Strawberry Iced Tea",""));
	}
}
