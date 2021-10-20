package com.qa.condition;

public class statements {
	//Class Exercise
	public static String compare10(int x) {
		if (x == 10) { return "Equals";
		} else if (x < 10) { return "Less Than";
		}else { return "Greater Than";
		}
	}
	//Stretch Goal Flowchart
	public static void flowChart(int A) {
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			}else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
			}
		}else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A >600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if (A>500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
			}else {
				System.out.println("2");
			}
		}
	}
//	BlackJack
//	Given 2 integer values greater than 0,
//	return whichever is closest to 21 without going over 21. 
//	If they both go over 21 then return 0.
	public static int blackJack(int a, int b) {
		if (a > 21 && b >21) {
			return 0;
		}else if (a > 21 && b < 21) {
			return b;
		}else if (a< 21 && b > 21) {
			return a;
		}else {
			if (a>b) {
				return a;
			}else {
				return b;
				}
			}
		}
}
