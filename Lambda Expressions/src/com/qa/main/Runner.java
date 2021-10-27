package com.qa.main;

public class Runner {


	    interface FuncInterface {
	        double operation(double a, double b);
	    }

	    private double operate(double a, double b, FuncInterface funcObj) {
	        return funcObj.operation(a, b);
	    }

	    public static void main(String[] args) {
	        FuncInterface add = (double x, double y) -> x + y;
	        FuncInterface sub = (double x, double y) -> x - y;
	        FuncInterface mul = (a,b) -> a*b;
	        FuncInterface div = (a,b) -> a/b;

	        Runner lambda = new Runner();
	        System.out.println(lambda.operate(5, 7, add));
	        System.out.println(lambda.operate(5, 7, sub));
	        System.out.println(lambda.operate(5, 7, mul));
	        System.out.println(lambda.operate(5, 7, div));
	    }
}
