
public class Employee_main {
   public static void main(String[] args) {
	String [] ename= {"Amit","Vinayak","Nikhil", "Saurabh" , "Aditya"};
	String [] address= {"Devi Indrayani","Om Sai PG","Om Sai PG", "Nigdi" , "Chakan"};
	String [] country= {"India", "France", "USA", "China" , "Japan"};
	String [] city= {"Mumbai","Pune","Chennai","Delhi" , "Bangalore"};
	Employee e=new Employee();
	Address a=new Address();
	Country c=new Country();
	City cc=new City();
	
	for(int i=0;i<5;i++)
	{
		c.setCity(cc);
		cc.setName(city[i]);
		a.setCountry(c);
		c.setCountry(country[i]);
		e.setAddress(a);
		a.setLine(address[i]);
		e.setName(ename[i]);
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress().getLine());
		System.out.println("Country: "+e.getAddress().getCountry().getCountry());
		System.out.println("City: "+e.getAddress().getCountry().getCity().getName());
		System.out.println("--------------------------------------");
	}
		
}
}
