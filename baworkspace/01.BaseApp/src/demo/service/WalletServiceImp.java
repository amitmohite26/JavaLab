package demo.service;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.*;

public class WalletServiceImp implements WalletService{
private WalletRepoImp repo = new WalletRepoImp();

	public Customer createAccount(String name, String mobileNumber, float balance) 
	{
		Customer customer=new Customer();
		Wallet w1 = new Wallet();
		w1.setBalance(balance);
		customer.setName(name);
		customer.setMobileNumber(mobileNumber);
		customer.setWallet(w1);
		repo.save(customer);
		System.out.println("Customer is created");
		return customer;
	}

	public Customer showBalance(String mobileNumber)
	{
		return  repo.findOne(mobileNumber);
		
		
	}
	

}
