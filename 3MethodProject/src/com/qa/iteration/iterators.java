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
	//Flowchart
	
	public static void flowchart1() {
		for (int a = 100;a<200;a++) {
			System.out.println(a);
		}
	}
	
	//Flowchart 2
	
	public static void flowchart2() {
		for (int a = 100;a<200;a++) {
			if (a%2==0) {
			System.out.println("*");
			}else {
				System.out.println("-");
			
			}
		}
	}
	
//	Create a method that can print out the numbers 1-10 10 times each.
//
	public static void print110() {
		for (int i = 1; i<11;i++) {
			for (int j = 1; j<11;j++) {
				System.out.println(i); //Can print J instead for each number going 1 to 10, but
				//use i so we see 10 sets of 1 then 10 sets of 2.. etc..
			}
		}
	}
	
	
//	If you have used a while()-loop at any point in these exercises,
//	replace them with for()-loops. Remember you should use a for()-loop when
//	you know when the iteration should end.
//
//	Create a method to print the numbers 1 to 10 as many times as the value of that number.
//	For example; you will print 1 once, and 10 ten times.
	
	public static void print111010() {
		for (int i = 1; i<11;i++) {
			for (int j = 11;j>0;j--) {
				if (i>=j) {
					System.out.println(i);
				}
			}
		}
	}
}
