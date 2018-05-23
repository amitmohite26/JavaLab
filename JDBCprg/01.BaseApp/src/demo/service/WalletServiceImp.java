package demo.service;

import java.sql.*;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.*;

public class WalletServiceImp implements WalletService {
private WalletRepoImp repo;

public WalletServiceImp(WalletRepo repo) {
	//super();
	this.repo = (WalletRepoImp) repo;
}
	public Customer createAccount(String name, String mobileNumber, float balance)  
	{
		Customer customer=new Customer();
		Wallet wallet=new Wallet();
		customer.setName(name);
		customer.setMobileNumber(mobileNumber);
		wallet.setBalance(balance);
		customer.setWallet(wallet);
		repo.save(customer);
		return customer;
		 
		
		
		
	}

	public Customer showBalance(String mobileNumber)
	{
		
		Customer customer=repo.findOne(mobileNumber);
		//Wallet wallet1=new Wallet();
				float temp = customer.getWallet().getBalance() + depositAmount;
				customer.getWallet().setBalance(temp);
				customer.setWallet(customer.getWallet());
				repo.save(customer);
				return customer;
		
		
		/*return  repo.findOne(mobileNumber);*/
		//return Customer;
		
		
	}
	/*public float deposit(String mobileNumber, float depositAmount) {
		//repo.findOne(mobileNumber);
				Customer customer=repo.findOne(mobileNumber);
		//Wallet wallet1=new Wallet();
				float temp = customer.getWallet().getBalance() + depositAmount;
				customer.getWallet().setBalance(temp);
				customer.setWallet(customer.getWallet());
				repo.save(customer);
				
				//	return customer;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select cust_id from Customer where mobilenumber='"+mobileNumber+"'");
			while(rs.next())
		    custid=rs.getInt("cust_id");
			ResultSet rs1=stmt.executeQuery("select Wallet.balance from Customer inner join Wallet on Wallet.cust_id="+custid+"");
			while(rs1.next())
		    balance=rs1.getInt("balance");
			con.close();
			return balance;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		return ;
		} */
		 
		 
		 
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

	


