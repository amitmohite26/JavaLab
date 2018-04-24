package com.cg;

public class Entry {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
<<<<<<< HEAD
<<<<<<< HEAD
		String msg = new B().getGreeting();
=======
		String msg = new com.cg.B().getGreeting();
>>>>>>> 384277962275894ce7e26e4a3f4b846c0681bd1f
=======
		String msg = new com.cg.B().getGreeting();
>>>>>>> 2a03190c2daa1c526e4f9f197523c9b06cea8544
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


