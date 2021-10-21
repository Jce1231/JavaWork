package com.qa.arrays;

import java.util.Arrays;

public class arrayDemo {
//	Exercise - Create an array of numbers 1 - 10
//	- Print out the number * 2 ( 2 -> 4, 3 ->6)
	public static int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	public static void arrayNumbers() {

		for (int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]*2);
		}
	}
//	- Print out the squared value of each of the numbers (2 -> 4, 3 -> 9)
	public static void arrayNumbers2() {
		for (int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]*numbers[i]);
		}
	}
	
	
	//	- Have a second array created with 10 numbers 1,1,1,1,1.. when you square the number from the first array, modify the 2nd array to have the squared number
	public static void arrayNumbers3() {
		int[] numbers2 = {1,1,1,1,1,1,1,1,1,1};
		for (int i = 0; i<numbers.length;i++) {
			numbers2[i] = numbers[i]*numbers[i];
			System.out.println(numbers2[i]);
		}
	
	}
//	Stretch goal - Do the same for the last exercise but in reverse, 
//	10th number in 2nd array will be 1st number squared
	public static void arrayNumbers4() {
		int[] numbers2 = {1,1,1,1,1,1,1,1,1,1};
		for (int i = 0; i<numbers.length;i++) {
			numbers2[numbers2.length - (i+1)] = numbers[i]*numbers[i];
		}
		String arrNum = Arrays.toString(numbers2);
		System.out.println(arrNum);
	}
}

