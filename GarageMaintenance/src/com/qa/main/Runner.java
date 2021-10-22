package com.qa.main;
import com.qa.garage.*;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garages garage = new Garages();
		Vehicle beeboop = new Car("Brum",250,175,false,2,"AD80034");
		beeboop.fixVehicle();
		garage.addVehicle(beeboop);
		Vehicle baabeep = new Helicopter("Whirlllly",1000,750,true,2,true);
		garage.addVehicle(baabeep);
		Vehicle boobaa = new Bike("Vhmmmm",140 , 100, true, true);
		garage.addVehicle(boobaa);
		System.out.println(garage);
		
	}

}
