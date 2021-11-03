package com.jordan.main;


public class Solution {

	public static String run(int N, int M) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/
		String sequence = "";
		for (int i = N; i<=M;i++){
			sequence += fizzBuzz(i) + ",";
		}
		sequence = sequence.substring(0, sequence.length()-1);
		return sequence;
	}
	public static String fizzBuzz(Integer a){
		String returnString = "";
		if(a%3 == 0 || a%5 ==0){
			if(a%3 == 0){
			returnString += "Fizz";
			}
			if(a%5==0){
			returnString += "Buzz";
			}
		}else{
			returnString = a.toString();
		}
		return returnString;
	}

}
