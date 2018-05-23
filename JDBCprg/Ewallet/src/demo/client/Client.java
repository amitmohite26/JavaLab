package demo.client;

import java.util.HashMap;
import java.util.Map;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.WalletRepoClass;
import demo.service.WalletService;
import demo.service.WalletServiceClass;

public class Client {
	public static void main(String[] args) {
	//	Map<String,Customer> data=new HashMap<>();
		WalletRepo repo=new WalletRepoClass();
		WalletService service=new WalletServiceClass(repo);
	
		
		service.createAccount("BHARATH", "1234567890", 50000);
		System.out.println(service.showBalance("1234567890"));
		 service.deposit("1234567890", 10000);
		 System.out.println(service.showBalance("1234567890"));
		 service.withDraw("1234567890",5000);
		 System.out.println(service.showBalance("1234567890"));
		/*service.createAccount("MAHIDHAR", "6234567890", 65000);
		service.createAccount("CHAITANYA", "6244567890", 85000);
		service.createAccount("AKHILESH", "6534577890", 15000);
		service.createAccount("NIKHIL CHAVA", "62347899890", 16500);
		System.out.println(service.showBalance("62291455476"));
		   
		System.out.println(service.showBalance("62291455476"));
		System.out.println();
		System.out.println();
		System.out.println(service.showBalance("6534577890"));
		service.withDraw("6534577890", 2000);
		System.out.println(service.showBalance("6534577890"));
		service.withDraw("6534577890", 14000);*/
		
	}

}
