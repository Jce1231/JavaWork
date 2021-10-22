package com.qa.garage;

import java.util.ArrayList;

public class Garages {
//	Garage Task
//
//	The task is to create a garage class with methods for the following:
	public ArrayList<Vehicle> garage = new ArrayList<>();
//	- Adding Vehicles to garage
	public void addVehicle(Vehicle x){
		garage.add(x);
	}
//	- Removing vehicles
	public void removeVehicle(int x) {
		garage.remove(x);
	}
//	- Updating vehicles
	public void updateVehicle(int x,Vehicle y) {
		garage.set(x, y);
	}
//	- Reading vehicle
	public Vehicle getVehicle(int x) {
		return garage.get(x);
	}
//	- Removing all vehicles
	public void clearGarage() {
		garage.clear();
	}
//	- Running vehicle.fixVehicle() custom method
	public void fixVehicle(int x) {
		getVehicle(x).fixVehicle();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Garage= ");
		builder.append(garage);
		return builder.toString();
	}

	
}
