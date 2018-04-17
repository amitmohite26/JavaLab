package lab3;

import java.sql.Date;

public class Employee{
	private String name;
	private Date joiningDate;
	public double salary;
	public static int count;
	
	public Employee(String name,double salary) {
		this.name = name;
		//this.joiningDate = joiningDate;
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Employee(){
		count++;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
}