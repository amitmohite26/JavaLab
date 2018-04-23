package com.cg;

abstract public class Animal {

	private String color;
	private int age;
	public Animal(String color, int age) {
		this.color = color;
		this.age = age;
	}
	
	abstract public void eat();
	abstract public void roam();
}
