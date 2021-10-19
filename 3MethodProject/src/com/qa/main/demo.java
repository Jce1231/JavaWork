package com.qa.main;

public class demo {
	public static void favTopping(String topping) {
		System.out.println(topping);
	}
	public static String favWord(String word) {
		return word;
	}
	public static void favNumber(int number) {
		if (number != 7) {
			System.out.println("Wrong, 7 is the only favorite Number, not :" + number);
		}else {
			System.out.println(number);
		}
	}
}
