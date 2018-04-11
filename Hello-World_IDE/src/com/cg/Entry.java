package com.cg;

public class Entry {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		String msg = new B().getGreeting();
		System.out.println(msg);
		
		A ref = new A("Good morning!!!");
//		ref.message = "Bad message";
		
		msg = ref.getGreeting();
		System.out.println(msg);

		ref.setGreeting("Good afternoon!");
	
		msg = ref.getGreeting();
		System.out.println(msg);
	
	
	}
	
}


