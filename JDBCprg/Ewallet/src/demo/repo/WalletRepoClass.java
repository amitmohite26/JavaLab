package demo.repo;
import java.sql.*;


import com.mysql.jdbc.PreparedStatement;

import demo.beans.Customer;
import demo.beans.Wallet;

public class WalletRepoClass implements WalletRepo{
	Connection con;
	Statement stmt;

	public WalletRepoClass() {
		// TODO Auto-generated constructor stub
	
	}
	private void connection() throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");  
	 stmt=con.createStatement(); 
	}
	@Override
	public boolean save(Customer c) {
		/*data.put(c.getMobileNumber(),c);
		
		return false;*/
		Wallet wallet;
		String name=c.getName();
		String mobileNumber=c.getMobileNumber();
		wallet=c.getWallet();
		float balance=wallet.getBalance();
		int custid=0;
		try {
			 connection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into Customer(name,mobilenumber) values(?,?)");
			ps.setString(1, name);
			ps.setString(2,mobileNumber);
			ps.executeUpdate();
			ResultSet rs=stmt.executeQuery("select cust_id from Customer where mobilenumber='"+mobileNumber+"'");
			while(rs.next())
		    custid=rs.getInt("cust_id");
		    
			PreparedStatement ps1=(PreparedStatement) con.prepareStatement("insert into Wallet(balance,cust_id) values(?,?)");
			ps1.setFloat(1, balance);
			ps1.setInt(2,custid);
			ps1.executeUpdate();
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
	
	public boolean update(Customer c)
	{
		Customer customer=c;
		float balance=customer.getWallet().getBalance();
		String mobilenumber=customer.getMobileNumber();
		int id=0;
		try {
			connection();  
			ResultSet rs=stmt.executeQuery("select cust_id from Customer where mobilenumber='"+mobilenumber+"'");
			while(rs.next())
			{
				id=rs.getInt("cust_id");
			}
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("update wallet set balance=? where cust_id=?");
			ps.setFloat(1, balance);
			ps.setInt(2, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	@Override
	public Customer findOne(String mobileNumber) {
		
		//return data.get(mobileNumber);
		int custid=0;
		String name=null,mobilenumber=null;
		float balance=0;
		
		Customer customer = new Customer();
		Wallet wallet=new Wallet();
		try {
			connection();
			ResultSet rs=stmt.executeQuery("select cust_id from Customer where mobilenumber='"+mobileNumber+"'");
			while(rs.next())
		    custid=rs.getInt("cust_id");
			ResultSet rs1=stmt.executeQuery("select name,mobilenumber,balance from Wallet,Customer where Wallet.cust_id="+custid+"");
			while(rs1.next())
			{
				name=rs1.getString("name");
				mobilenumber=rs1.getString("mobilenumber");
				balance=rs1.getInt("balance");
			}
			con.close();
			customer.setName(name);
			customer.setMobileNumber(mobilenumber);
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

	
	
	


