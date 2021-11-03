package com.qa.kittens.domain;

public class Kitten {
	private String name;
	private String breed;
	private Integer weight;
	/**
	 * @param name
	 * @param breed
	 * @param weight
	 */
	public Kitten(String name, String breed, Integer weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Kitten [name=" + name + ", breed=" + breed + ", weight=" + weight + "]";
	}
	
}
