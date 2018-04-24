package com.cg;

public class Account {

	private double balance = 5000;
	
	public double getBalance() {
		return balance;
	}
	
	synchronized
	public void deposit(double amount) throws InterruptedException{
		System.out.println("inside deposit()...");
		
		double lBalance = this.balance;
		lBalance += amount;
		
		try {
			Thread.sleep(1400);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		this.balance = lBalance;
				
		
	}
	
	synchronized
	public void withdraw(double amount) throws InterruptedException{
		System.out.println("inside withdraw()...");
		double lBalance = this.balance;
		lBalance -= amount;
		
		Thread.sleep(900);
		
		this.balance = lBalance;
				
		
	}

	
	
}
