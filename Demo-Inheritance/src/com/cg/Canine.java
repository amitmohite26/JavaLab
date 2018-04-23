package com.cg;

abstract public class Canine extends Animal{
	public Canine() {
		super("Grey", 1);
	}
	
	@Override
	public void roam() {
		System.out.println("I roam in a group");
	}
	
	
	
}
