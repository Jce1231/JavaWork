package com.qa.main;
import java.util.Random;
public class DiceRoller {
	
//	Task - Create methods that return the following dice rolls
//			3 sided dice
//			4 sided dice
//			6 sided
//			8 sided
//			10 sided

	public static int roll(int diceType) {
		int rolled = new Random().nextInt(diceType+1)+1;
		if (rolled == diceType) {
		rolled += roll(diceType);
		}
		return rolled;
	}
//	methods that do the following calculations
//	- sum of 4 six sided dice
	public static int sum4SixDice() {
		int result = 0;
		int d1 = roll(6);
		int d2= roll(6);
		int d3= roll(6);
		int d4= roll(6);
		result = d1+d2+d3+d4;
		if (d1 == 1 || d2 == 1 || d3 == 1 || d4 == 1) {result=1;}
		return result;
	}
//	- sum of 2 10 sided dice and 2 3 sided dice
	public static int sum2TenDice2ThreeDice() {
		int result = 0;
		int d1= roll(10);
		int d2= roll(10);
		int d3= roll(3);
		int d4= roll(3);
		result = d1+d2+d3+d4;
		if (d1 == 1 || d2 == 1 || d3 == 1 || d4 == 1) {result=1;}
		return result;
	}

//	- sum of 1 of each dice
	public static int sum1OfEach() {
		int result = 0;
		
		int d1 = roll(3);
		int d2 = roll(4);
		int d3 = roll(6);
		int d4 = roll(8);
		int d5 = roll(10);
		result = d1+d2+d3+d4+d5;
		if (d1 == 1 || d2 == 1 || d3 == 1 || d4 == 1||d5 == 1) {result=1;}
		return result;
	}
//	Stretch goal:
//	- sum of 4 six sided dice ignoring the smallest value
	public static int sum4SixMinusSmall() {
		int result = 0;
		int d1 = roll(6); 
		int d2 = roll(6);
		int d3 = roll(6);
		int d4 = roll(6);
		System.out.println(d1 + " " + d2 + " " + d3 + " " +d4);
		//Comparing dice results to find the smallest value
		//Adding up all but smallest dice
		//If dice result is 1, total is 1
		if (d1 < d2 && d1<d3 && d1 < d4) {
			if (d2 == 1 || d3 == 1 || d4 == 1) {result=1;}else {
			result = d2+d3+d4;}
		}else if (d2<d3 && d2<d4) {
			if (d1 == 1 || d3 == 1 || d4 == 1) {result=1;}else {
			result = d1+d3+d4;}
		}else if (d3<d4) {
			if (d1 == 1 || d2== 1 || d4 == 1) {result=1;}else {
			result = d1+d2+d4;}
		}else if (d1 == 1 || d1 == 1 || d3== 1) {result=1;}else {
			result = d1+d2+d3;
		}
		
	
		return result;
	}
}
