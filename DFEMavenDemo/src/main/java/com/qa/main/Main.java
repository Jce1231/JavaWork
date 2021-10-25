package com.qa.main;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		calculate(n1,n2,args[2]);
	}
		public static void roll(int diceType, int times) {
			for( int i = 0; i<times; i++) {
				int rolled = new Random().nextInt(diceType)+1;
				System.out.println(rolled);
			}
	}
		public static void calculate(int n1, int n2, String operation) {
			switch(operation) {
			case "add":
				System.out.println(n1+ " + " + n2 + " = " +(n1+n2));
				break;
			case "div":
				System.out.println(n1+ " / " + n2 + " = " +(n1/n2));
				break;
			case "mul":
				System.out.println(n1+ " * " + n2 + " = " +(n1*n2));
				break;
			case "sub":
				System.out.println(n1+ " - " + n2 + " = " +(n1-n2));
				break;
			case "roll": roll(n1,n2);
				break;
			default: System.out.println("Not a valid operation");
			}
		}
}
