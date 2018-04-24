package com.cg;

public class Container {

	private String message;
	private boolean isMessageAvailable;
	
	synchronized
	public void put(String message) throws InterruptedException{
		while(isMessageAvailable== true){
			((Container) this).wait();
		}
		
		Thread.sleep(800);
		this.message = message;
		System.out.println("PUT");
		
		isMessageAvailable = true;
		
		((Container) this).notify();
	}
	
	synchronized
	public String get() throws InterruptedException{
		while(isMessageAvailable == false){
			((Container) this).wait();
		}
		
		Thread.sleep(800);
		
		System.out.println("GET");

		isMessageAvailable = false;
		((Container) this).notify();
		return message;
	}
	
	
	
	
}
