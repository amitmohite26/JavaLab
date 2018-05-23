package demo.repo;
import java.util.Map;

import demo.beans.Customer;

public class WalletRepoClass implements WalletRepo{
	Map<String,Customer> data;

	public WalletRepoClass(Map<String, Customer> data) {
		// TODO Auto-generated constructor stub
	this.data=data;
	}

	@Override
	public boolean save(Customer c) {
		data.put(c.getMobileNumber(),c);
		
		return false;
	}

	@Override
	public Customer findOne(String mobileNumber) {
		
		return data.get(mobileNumber);
	}

	
	
	

}
