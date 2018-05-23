package demo.BaseApp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.WalletRepoClass;
import demo.service.WalletService;
import demo.service.WalletServiceClass;

public class App {
	public static void main(String[] args) {
		/*Map<String,Customer> data=new HashMap<String, Customer>();
		WalletRepo repo=new WalletRepoClass(data);
		WalletService service=new WalletServiceClass(repo);*/
//		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("demo/BaseApp/beanconfig.xml");
		 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
			ctx.scan("demo");
			ctx.refresh();
		WalletServiceClass service=ctx.getBean("service",WalletServiceClass.class);
		service.createAccount("vinayak", "62291455476", 50000);
		service.createAccount("amit", "6234567890", 65000);
		service.createAccount("nikhil", "6244567890", 85000);
		service.createAccount("AKHILESH", "6534577890", 15000);
		service.createAccount("NIKHIL CHAVA", "62347899890", 16500);
		System.out.println(service.showBalance("62291455476"));
		    service.deposit("62291455476", 10000);
		System.out.println(service.showBalance("62291455476"));
		System.out.println();
		System.out.println();
		System.out.println(service.showBalance("6534577890"));
		service.withDraw("6534577890", 2000);
		System.out.println(service.showBalance("6534577890"));
		service.withDraw("6534577890", 14000);
		
	}

}
