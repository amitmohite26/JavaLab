package demo.repo;

import demo.beans.Customer;

public interface WalletRepo {
	public boolean save(Customer c);
	public boolean update(Customer c);
	public Customer findOne(String mobileNumber);
}
