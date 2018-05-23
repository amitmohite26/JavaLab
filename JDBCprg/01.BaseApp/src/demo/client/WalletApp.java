package demo.client;
import java.sql.*;  
import demo.repo.WalletRepo;
import demo.repo.WalletRepoImp;
import demo.service.*;
public class WalletApp
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{	
		
		/*Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();*/  
		
		WalletRepo repo= new WalletRepoImp();
		WalletService service= new WalletServiceImp(repo);
		service.createAccount("Amit","964965",20000);
		System.out.println(service.showBalance("9649658180"));

		/*account.createAccount("Vinayak","7702508656",90000);
				System.out.println(account.showBalance("7702508656"));*/
		
		
		
		
	
	}
}
