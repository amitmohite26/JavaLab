package com.cg;

public class A {
	private  String message;

	public void setGreeting(String message){
//		We can validate message value
		if(message != null)
			this.message = message;
	}
	
/*	public A() {
		// TODO Auto-generated constructor stub
	}*/
	
	public A(String message) {
		this.message = message;
	}

	public String getGreeting() {
		return message;
	}

	public int m1(int a, int b) {
		return (a * b);
	}

	/*
	 * public void m1(int a, int b){ return; }
	 */

}

class B extends A {

	public B() {
		super("test message");
	}

	public int m1(int a, int b) {

		return (a - b);
	}

}
