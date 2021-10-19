package com.qa.main;

public class Calculator {
//	Exercise - Create a new class called 'calculator' add the following methods:
//
//
//
//		- add
//		- subtract
//		- multiply
//		- divide
	public static float addNum(float n1, float n2) {
		float result = n1+n2;
		return result;
		
	}
	public static float subNum(float n1, float n2) {
		float result = n1-n2;
		return result;
		
	}
	public static float mulNum(float n1, float n2) {
		float result = n1*n2;
		return result;
		
	}
	public static float divNum(float n1, float n2) {
		float result = (float)n1/n2;
		return result;
		
	}
	
//	Stretch goal:
//
//		Add a method that raises the first number to the power of the second
	public static float powNum(float n1, float n2) {
		
		float result = 1;
		for (int i = 0; i < n2; i++) {
			result *= n1;
		}
		return result;
		
	}
}
