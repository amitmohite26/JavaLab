package demo.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import demo.beans.Customer;
import demo.beans.Wallet;

public class WalletRepoImp implements WalletRepo 
{

	HashMap<String,Customer> data= new HashMap<String, Customer>();
	
	
	
	public WalletRepoImp() {
		super();
		
	}

	public boolean save(Customer c)
	{
//		data.put(c.getMobileNumber(),c);
		Wallet wallet;
		String name=c.getName();
		String mobileNumber=c.getMobileNumber();
		wallet=c.getWallet();
		float balance=wallet.getBalance();
		int custid=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");  
			Statement stmt=con.createStatement();  
			
			stmt.executeUpdate("insert into Customer(name,mobilenumber) values('"+name+"','"+mobileNumber+"')");
			
			ResultSet rs=stmt.executeQuery("select cust_id from Customer where mobilenumber='"+mobileNumber+"'");
			while(rs.next())
		    custid=rs.getInt("cust_id");
		    
			
			stmt.executeUpdate("insert into Wallet(balance,cust_id) values("+balance+","+custid+")");
/*			w1.setBalance(balance);
			customer.setName(name);
			customer.setMobileNumber(mobileNumber);
			customer.setWallet(w1);
			repo.save(customer);
*/			System.out.println("Customer is created");
			
			con.close(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	public Customer findOne(String mobileNumber)
	{
		//return( data.get(mobileNumber));
		int custid=0;
		float balance=0;
		
		Customer customer = new Customer();
		Wallet wallet=new Wallet();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select cust_id from Customer where mobilenumber='"+mobileNumber+"'");
			while(rs.next())
		    custid=rs.getInt("cust_id");
			ResultSet rs1=stmt.executeQuery("select balance from  Wallet cust_id="+custid+"");
			while(rs1.next())
		    balance=rs1.getInt("balance");
			con.close();
			wallet.setBalance(balance);
			customer.setWallet(wallet);
			//return customer;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return customer;
		}
		
		
		
	}
	

}
