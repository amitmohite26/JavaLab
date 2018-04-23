import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.NetworkFailureException;

public class Entry {

	
	public static void main(String[] args) throws SQLException, NetworkFailureException {
		
/*		int ans;
		
		int a = 89, b =0;
		
		ans = 0;
		
		if(b != 0)
			ans = a/b;
		
		System.out.println("Answer: "+ ans);
*/		

		FileInputStream fIn;
		
		String fileName = "test.txt";
		
		try{
			fIn = new FileInputStream(fileName);
			
			while(true){
				int b = fIn.read();
				if(b == -1)
					break;
				
				System.out.print((char)b);
			}
		}catch(FileNotFoundException e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		Connection dbConnection = null;

		try{
			dbConnection = m1();
			System.out.println(dbConnection);
		}/*catch(SQLException e){
			e.printStackTrace();
		}*/finally{
			try {
				dbConnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		System.out.println("end of main()....");
		
	}
	
	
	public static Connection m1() throws SQLException, NetworkFailureException{
		
//		Obtain db connection
		
		Connection dbConnection;
		
		dbConnection = DriverManager.getConnection("connection url");
		
		if(true){
			throw new NetworkFailureException();
		}
		
		return dbConnection;
		
		
	}
	
	
	
	
	
	
	
	
	
}
