package demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;
@Service(value="service")
public class WalletServiceClass implements WalletService {
	@Autowired
	private WalletRepo repo;
/*@Autowired
public WalletServiceClass(WalletRepo repo) {
	super();
	this.repo = repo;
}*/
public Customer createAccount(String name, String mobileNumber, float amount) {
	Customer customer=new Customer();
	Wallet wallet=new Wallet();
	customer.setName(name);
	customer.setMobileNumber(mobileNumber);
	wallet.setBalance(amount);
	customer.setWallet(wallet);
	repo.save(customer);
		return customer;
	}



	

	public WalletServiceClass() {
		// TODO Auto-generated constructor stub
	}

	public Customer showBalance(String mobileNumber) {
		
		return repo.findOne(mobileNumber);
	}
	
	
	public Customer deposit(String mobileNumber, float depositAmount) {
	//repo.findOne(mobileNumber);
			Customer customer=repo.findOne(mobileNumber);
	//Wallet wallet1=new Wallet();
			float temp = customer.getWallet().getBalance() + depositAmount;
			customer.getWallet().setBalance(temp);
			customer.setWallet(customer.getWallet());
			repo.save(customer);
			return customer;
	} 
	 
	 
	 
	public Customer withDraw(String mobileNumber, float withDrawAmount) {
			Customer customer=repo.findOne(mobileNumber);
			if(customer.getWallet().getBalance() > withDrawAmount)
			{
				float temp = customer.getWallet().getBalance() - withDrawAmount;
				customer.getWallet().setBalance(temp);
				customer.setWallet(customer.getWallet());
				repo.save(customer);
			}
			else
			{
				System.out.println("Withdrawl cannot be done");
			}
			return customer;
			} 
	 
	 
	}

	


