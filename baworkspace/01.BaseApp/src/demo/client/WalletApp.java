package demo.client;
import demo.repo.WalletRepo;
import demo.service.*;
public class WalletApp
{
	public static void main(String[] args) 
	{	
		WalletServiceImp account= new WalletServiceImp();
		account.createAccount("Amit","9649658180",20000);
		account.createAccount("Vinayak","7702508656",90000);
		System.out.println(account.showBalance("9649658180"));
		System.out.println(account.showBalance("7702508656"));
		
		
		
		
	
	}
}
