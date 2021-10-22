package com.qa.main;

import com.qa.animals.Cats;
//import com.qa.classExample.Pizza;
//import com.qa.condition.statements;
//import com.qa.iteration.iterators;

public class Runner {
public static void main(String[] args) {

	
// Using Methods	
//	String wordyy;
//	demo.favNumber(7);
//	wordyy = demo.favWord("Elephant");
//	System.out.println(wordyy);
//	demo.favTopping("Pepperoni");
	
//	Using data types
//	System.out.println(Returns.returnChar());
//	System.out.println(Returns.returnBool());
//	System.out.println(Returns.returnDoub());
//	System.out.println(Returns.returnFloat());
//	System.out.println(Returns.returnStr());
	
	
//	Class as data type
//	Dog charlie = new Dog("Charlie",10);
//	Dog Alfred = Returns.returnDog(charlie);
//	System.out.println(Alfred);
	
	
//	Calculator
//	System.out.println(Calculator.addNum(10,4));
//	System.out.println(Calculator.subNum(10,4));
//	System.out.println(Calculator.divNum(10,4));
//	System.out.println(Calculator.mulNum(10,4));
//	System.out.println(Calculator.powNum(10,4));
	
	
//	DiceRolling
//	System.out.println(DiceRoller.sum1OfEach());
//	System.out.println(DiceRoller.sum2TenDice2ThreeDice());
//	System.out.println(DiceRoller.sum4SixDice());
//	System.out.println(DiceRoller.sum4SixMinusSmall());
	
	
//	Flowchart
//	System.out.println(statements.compare10(15));
//	statements.flowChart(450);
//	System.out.println(statements.blackJack(10,19)); //Expected out 19
//	System.out.println(statements.blackJack(22,22)); //Expected out 0
//	System.out.println(statements.blackJack(21,19)); //Expected out 21
//	System.out.println(statements.blackJack(19,22)); //Expected out 19
	
	
//	Unique Sum
//	System.out.println(statements.uniqueSum(1, 1, 2)); //Expected 2
//	System.out.println(statements.uniqueSum(3, 5, 3)); //Expected 5
//	System.out.println(statements.uniqueSum(10, 6, 6)); //Expected 10
//	System.out.println(statements.uniqueSum(6, 6, 6)); //Expected 0
	
	
//	fizzBuzz
//	System.out.println(statements.fizzBuzz(3)); //Expected Fizz,
//	System.out.println(statements.fizzBuzz(5)); //Expected Buzz,
//	System.out.println(statements.fizzBuzz(15)); //Expected FizzBuzz,
//	System.out.println(statements.fizzBuzz(7)); //Expected 7,
	
	
//	Taxes
//	System.out.println(statements.perTax(34500)); // Expected 20
//	System.out.println(statements.amntTax(34500)); // 6900.0
//	System.out.println(statements.taxAmnt(34500)); // 6900.0
	
	//Do while loops
//	iterators.demoWhile(545,85);
//	iterators.randomWhile(500,32);
//	iterators.demoDoWhile(66, 120);
//	iterators.demoDoWhile(545, 85);
//	
	
	//Exercises
//
//	iterators.flowchart1();
//	iterators.flowchart2();
//	iterators.print110();
//	iterators.print111010();

//	iterators.changeCounter(20.5,293);
//	iterators.addDigits(753);
	
	
//	//Arrays, Exercise
//	arrayDemo.arrayNumbers();
//	arrayDemo.arrayNumbers2();
//	arrayDemo.arrayNumbers3();
//	arrayDemo.arrayNumbers4();

	
	//ArrayList Exercise
//	arrayListDemo.setupArrayList();
//	System.out.println(arrayListDemo.itemList);

	//create an order
//	Orders order = new Orders();
//	order.addItem(arrayListDemo.itemList.get(1));
//	order.addItem(arrayListDemo.itemList.get(2));
//	order.addItem(arrayListDemo.itemList.get(3));
//	order.addItem(arrayListDemo.itemList.get(1));
//	System.out.println(order);
//	
//	Orders order2 = new Orders();
//	order2.addItem(arrayListDemo.itemList.get(0));
//	order2.addItem(arrayListDemo.itemList.get(5));
//	order2.addItem(arrayListDemo.itemList.get(4));
//	order2.addItem(arrayListDemo.itemList.get(0));
//	System.out.println(order2);
	
//	
//	
//	//Classes Exercise
//	
//	Pizza pepperoni = new Pizza(12,"Rectangle",8);
//	System.out.println(pepperoni);
//	pepperoni.addTopping("Pepperoni");
//	pepperoni.addTopping("Extra Pepperoni");
//	pepperoni.eatPizza();
//	System.out.println(pepperoni);
//	pepperoni.eatPizza(3);
//	System.out.println(pepperoni);
//	
//	System.out.println(pepperoni.getSize());
//	
	
	//Class Inheritance exercise
	Cats charlie = new Cats(4, false, "Panther", 28, true,"charlie", 39);
	charlie.makeNoise();
	charlie.jump();
	charlie.moveAnimal();
	System.out.println(charlie);
}
}
