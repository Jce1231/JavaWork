package com.qa.main;

//Exercise - Create a class called returns
//Write methods that return the following:
//
//
//
//- char
//- float
//- boolean
//- double
//- String
public class Returns {
public static char returnChar() {
	return 'A'; //Single Quote not double or assumes string
}
public static float returnFloat() {
	return 10.5f;
}
public static boolean returnBool() {
	return false;
}
public static double returnDoub() {
	return 10.5d;
}
public static String returnStr() {
	return "This is a string";
}
public static Dog returnDog(){
	Dog charlie = new Dog("Charlie",10);
	return charlie;
}
}
