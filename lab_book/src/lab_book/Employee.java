package lab_book;

public class Employee {
	static private int id=1;
	private String fname,lname,cname;
	
	private double salary;
	private int day,month,year,wpd;
	private String jt;
	
	Employee(String fname, String lname, double salary,int day, int month, int year)
	{
		this.fname=fname;
		this.lname=lname;
		
		this.salary=salary;
		//this.grade=grade;
		this.day=day;
		this.month=month;
		this.year=year;
		id++;
	}
	Employee(String fname,String lname,int day,int month,int year,double salary,int wpd,String cname)
	{
		this.fname=fname;
		this.lname=lname;
		this.day=day;
		this.month=month;
		this.year=year;
		
		this.salary=salary;
		this.wpd=wpd;
		this.cname=cname;
		id++;
	}
	public void Display()
	{
		
		System.out.println("ID: "+id+" First name: "+fname+" Last name: "+lname+"Job Type: "+jt+" Salary: "+salary+" DOJ: "+day+"/"+month+"/"+year);
		
	}
	public void displayContract()
	{
		System.out.println("ID: "+id+"\nFirst name: "+fname+"\nLast name: " +lname+"\nDOJ: "+day+"/"+month+"/"+year+"\nJob Type: Contract-Based \n Salary: "+salary+"\nDaily working hours: "+wpd+"\nContractor name: "+cname);
	}

}
