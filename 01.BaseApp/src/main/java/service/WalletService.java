package demo.service;

import demo.beans.Customer;

public interface WalletService {
	public  Customer createAccount(String name,String mobileNumber,float amount);
	public  Customer showBalance(String mobileNumber);
	public  Customer deposit(String mobileNumber,float amount);
	public Customer withDraw(String mobileNumber, float withDrawAmount);
}
