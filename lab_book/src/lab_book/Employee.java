package lab_book;

public class Employee {
	static private int id;
	private String fname;
	private String lname;
	private double salary;
	
	private String doj;
	
	Employee(String fname, String lname, double salary, String doj)
	{
		this.fname=fname;
		this.lname=lname;
		this.salary=salary;
		//this.grade=grade;
		this.doj=doj;
		id++;
	}
	public void Display()
	{
		
		System.out.println("ID: "+id+" First name: "+fname+" Last name: "+lname+" Salary: "+salary+" DOJ: "+doj);
		
	}

}
