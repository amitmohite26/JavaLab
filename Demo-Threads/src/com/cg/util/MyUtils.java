package com.cg.util;

public class MyUtils {
	public static synchronized void m1(){
		
		System.out.println("inside m1()...");
	}
	
}

class Entry5{
	
	public static void main(String[] args) {
		
		
		new TempThread1().start();
		new TempThread1().start();
		
		
		System.out.println("inside main()..");
	}
}

class TempThread1 extends Thread{
	
	public void run() {
		MyUtils.m1();
	}
}



