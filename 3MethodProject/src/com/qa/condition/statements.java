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
//	Unique Sum
//	Given 3 integer values, return their sum.
//	If one value is the same as another value, 
//	they do not count towards the sum. In other words, 
//	only return the sum of unique numbers given.
	public static int uniqueSum(int a, int b, int c) {
		int sum = 0;
//So if A = B and B = c , return 0
//	 if a = b and c != a|b return C
		if ( a == b) {
			if (a == c) {
				sum = 0; //ABC = 0
			}else {
				sum = c;// AB = 0
				} 
		}else if (b == c) {
			sum = a; //BC = 0
		}else if (a==c){
		sum = b;
		}else{ sum = a+b+c; //ABC not equal each other
		}
		return sum;
	}
	
}
