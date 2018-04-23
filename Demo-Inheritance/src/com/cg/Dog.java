package com.cg;

public class Dog extends Canine implements Pet{
	@Override
	public void eat() {
		System.out.println("I love biscuits");
	}
	
	@Override
	public boolean beFriendly() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("You can play with me");
	}
	
}
