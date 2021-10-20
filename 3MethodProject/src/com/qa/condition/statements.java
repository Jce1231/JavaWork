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
		}else if (a > 21) {
			return b;
		}else if (b > 21) {
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
	
//	
//	FizzBuzz
//	Create a method which returns 'Fizz' for multiples of three
//	and 'Buzz' for the multiples of five.
//	Return 'FizzBuzz' for numbers which are multiples of both three and five.
//	Return the input number for numbers that are neither.
	public static String fizzBuzz(int a) {
		String fizzer = "";
		if (a % 3 == 0 || a % 5 == 0) {
			if (a % 3 == 0) {
			fizzer += "Fizz";
			} 
			if (a % 5 == 0){ 
				fizzer += "Buzz";
			}
			return fizzer;
			}else {
				return (String.valueOf(a));
		}
	}
	
//	Taxes
//	Create the tax class, it contains 2 methods.
//The salaries are taxed as below:

//0 - 14,999 : 0% tax
//15,000 - 19,999 : 10% tax
//20,000 - 29,999 : 15% tax
//30,000 - 44,999 : 20% tax
//45,000+ : 25% tax
//	Method 1 - which takes a salary and works out the percentage by 
//	which the salary will be taxed.
	public static int perTax(int a) {
		int percen = 0;
		if (a < 15000) {
			percen = 0;
		}else if (a <20000) {
			percen = 10;
		}else if (a<30000) {
			percen = 15;
		}else if (a<45000) {
			percen = 20;
		}else {
			percen = 25;
		}
		return percen;
	}
//	Method 2 - which works out the exact amount that the user will be 
//	taxed using a similar process to that in the first method. 
//	That amount should be returned and output to the console.
//	These 2 methods should be able to work independently,
//	so it is fine in this case if some of the code is repeated.*
	public static double amntTax(int a) {
		double tax = 0f;
		if (a < 15000) {
			tax = 0;
		}else if (a <20000) {
			tax = a*0.10;
		}else if (a<30000) {
			tax = a*0.15;
		}else if (a<45000) {
			tax = a*0.20;
		}else {
			tax = 25;
		}
		return tax;
	}

//	Finally combine the 2 methods so that the second method utilizes the 
//	first method to return the correct result.
	public static double taxAmnt(int a) {
		double tax = a * (perTax(a)/100f);
		return tax;
	}
}
	
