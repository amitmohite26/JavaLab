package demo.service;
import demo.beans.*;


public interface WalletService 
{
		Customer createAccount(String name,String mobileNumber,float balance);
		Customer showBalance(String mobileNumber);
}
