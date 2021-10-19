package com.qa.main;

public class HelloDataTypes {
	//public static void main(String[] args) {
	public String dataTypes() {
		//"H3LL0 W0.000000r1d 5.0 false"
		boolean boo = false;
		
		byte byting = 0; 
		
		char letterR = 'r';
		short num1 = 3;
		int num2 = 1;
		long num3 = 0;
		float num4 = 0.00000f;
		String str = String.format("%05f", num4);
		double num5 = 5.0d;
		String word = ("H"+num1+"LL"+num3+" W"+str+byting+letterR+num2+"d " + num5 +" " +boo);
		return word;
	}
}
