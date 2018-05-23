package demo.repo;

import java.util.HashMap;

import demo.beans.Customer;

public class WalletRepoImp implements WalletRepo 
{

	HashMap<String,Customer> data= new HashMap<String, Customer>();
	
	
	
	public boolean save(Customer c)
	{
		data.put(c.getMobileNumber(),c);
		return true;
	}

	public Customer findOne(String mobileNumber)
	{
		return( data.get(mobileNumber));
	}
	

}
