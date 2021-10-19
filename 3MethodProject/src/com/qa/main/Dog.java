package com.qa.main;
public class Dog {
    String name;
    int weight;
    String file;
    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void bark() {
        System.out.println("Woof");
    }
    public void play() {
        System.out.println("I am playing");
    }
	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + "]";
	}
}