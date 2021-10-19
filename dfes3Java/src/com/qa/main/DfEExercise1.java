package com.qa.main;
public class DfEExercise1 {
    //public static void main(String[] args) {
	public static void what() {
		boolean amIHappy = false; // A boolean names amIHAppy is being delcared and assigned false
        int weight = 20;
        String name = "Billy Bob"; 
        Dog goodBoy = new Dog(name, weight);
        int x = weight - 10; // 
        if (x < 15) goodBoy.bark();
        while (x < 3) {
            goodBoy.play();
        }
        int[] numList = {1,2,3,4,5,6};
        System.out.println("How are you");
        System.out.println("My " + name + " is doing great"
                + " how's yours");
        String num = "305"; 
        int z = Integer.parseInt(num);
    }
    }