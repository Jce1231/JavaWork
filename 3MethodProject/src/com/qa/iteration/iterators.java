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
	
	
	
//	Coins
//	Given a cost and an amount, work out the change given in specific coinage.
//	For example; the cost is £4.58 and the customer
//	pays with a £20 note so as change they receive:
//	1 £10 note
//	1 £5 note
//	2 20p's
//	1 2p

	public static void changeCounter(double a, double b) { //A = cost B = Amount given
		double total = b;
		double cost = a;
		System.out.println("Product costs : "+cost + "You are paying with : " + total);
		total -= cost;
		System.out.println("Your change is : " + total + "Paid out in ");
		int curTens = 0;
		int curFives= 0;
		int cur2pnd= 0;
		int cur1pnd= 0;
		int cur50p= 0;
		int cur20p= 0;
		int cur10p= 0;
		int cur5p= 0;
		int cur2p= 0;
		int cur1p= 0;
		while (total>=10) {
			total -= 10;
			curTens++;
		}
		System.out.println("Change to receive is :" + curTens + " £10 pound note.");
		while (total>=5) {
			total -= 5;
			curFives++;
		}
		System.out.println("Change to receive is :" + curFives + " £5 pound note.");
		while (total>=2) {
			total -= 2;
			cur2pnd++;
		}
		System.out.println("Change to receive is :" + cur2pnd + " £2 pound coins.");
		while (total>=1) {
			total -= 1;
			cur1pnd++;
		}
		System.out.println("Change to receive is :" + cur1pnd + " £1 pound coins.");
		while (total>=0.5) {
			total -= 0.5;
			cur50p++;
		}
		System.out.println("Change to receive is :" + cur50p + " 50p's.");
		while (total>=0.2) {
			total -= 0.2;
			cur20p++;
		}
		System.out.println("Change to receive is :" + cur20p + " 20p's.");
		while (total>=0.1) {
			total -= 0.1;
			cur10p++;
		}System.out.println("Change to receive is :" + cur10p + " 10p's.");
		while (total>=0.05) {
			total -= 0.05;
			cur5p++;
		}System.out.println("Change to receive is :" + cur5p + " 5p's.");
		while (total>=0.02) {
			total -= 0.02;
			cur2p++;
		}System.out.println("Change to receive is :" + cur2p + " 2p's.");
		while (total>=0.01) {
			total -= 0.01;
			cur1p++;
		}System.out.println("Change to receive is :" + cur1p + " 1p's.");

		
	}
	
//	Numbers
//	Create a method that takes a number 10-99, 
//	and adds the two digits together for example 74 = 7 + 4 = 11.
public static void addDigits(int a) {
	int sum = 0;
	int curNum = a;
	while (curNum!=0) {
		sum += curNum%10;
		curNum = curNum / 10;
	}
	System.out.println("The sum of the digits in " + a + " is : " + sum);
}
	
	
	
//	Create a second method that when given the number 1-99 
//	returns a String representation of this number, 
//	for example 1 = one, 11 = eleven, 21 = twenty-one.

	
	
	
//	Expand on the method you wrote in Numbers 2 to allow the input 1-999.

	
	
	
//	Expand the method you wrote in Numbers 2 to allow the input 1-9999
}
