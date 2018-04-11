package lab_book;

public class Employee {
	static private int id;
	private String fname;
	private String lname;
	private double salary;
	private int day,month,year;
	
	
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
	public void Display()
	{
		
		System.out.println("ID: "+id+" First name: "+fname+" Last name: "+lname+" Salary: "+salary+" DOJ: "+day+"/"+month+"/"+year);
		
	}

}
