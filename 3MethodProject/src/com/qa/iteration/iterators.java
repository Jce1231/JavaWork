package com.qa.iteration;

import java.util.Random;


public class iterators {
//	
//	Task - Create a new class and method that do the following:
//- Using a while loop start with a beginning total (300),
//	subtract an amount of money from it (45) 
//	until the total goes less than another value (87)
//	When the total goes below the set value, 
//	print out "You're spending too much money!"
	public static void demoWhile(int a, int b) { //A = total, B = limit
		int subAmnt = 45;
		int total = a;
		System.out.println("Spending Spree");
		while (total > b) {
			total -= subAmnt;
			System.out.println("Amount leftover: " + total);
		}
		System.out.println("You're spending too much money, spending spree over");
	}
//	Stretch goal - Use the random generator from earlier, 
//	subtract random amounts from the total
//	int random = new Random().nextInt(MAXNumber); between 0 and max number, not inclusive
	public static void randomWhile(int a, int b) { //A = total, B = limit
		int total = a;
		System.out.println("New Spending Spree");
		while (total > b) {
			total -= new Random().nextInt(total);
			System.out.println("Amount left: " + total);
		}
		System.out.println("You're spending too much money, spending spree over");
	}
	
//	Task - Make a new method, using the code from the previous loop
//	converting it to a do while loop
//	- attempt to start with a low total than the minimum value across both loops
	public static void demoDoWhile(int a, int b) { //A = total, B = limit
		int subAmnt = 45;
		int total = a;
		System.out.println("Spending Spree");
		do {
			total -= subAmnt;
			System.out.println("Amount leftover: " + total);
		}while (total > b);
		System.out.println("You're spending too much money, spending spree over");
	}
	
}
