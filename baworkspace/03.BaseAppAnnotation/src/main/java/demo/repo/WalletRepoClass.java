package demo.repo;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import demo.beans.Customer;
@Repository(value="repo")
public class WalletRepoClass implements WalletRepo{
@Resource(name="data")
	private Map<String,Customer> data;

	/*public WalletRepoClass(Map<String, Customer> data) {
		// TODO Auto-generated constructor stub
	this.data=data;
	}*/

	public boolean save(Customer c) {
		data.put(c.getMobileNumber(),c);
		
		return false;
	}

	public Customer findOne(String mobileNumber) {
		
		return data.get(mobileNumber);
	}

	
	
	

}
