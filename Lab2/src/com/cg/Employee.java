package com.cg;

import com.cg.util.Date;

public class Employee {
	private int id;
	private String firstName;
	private static int count;
	
	public static int getCount() {
		return count;
	}
	
	private Date joiningDate;
	
	public Employee(String firstName, Date joiningDate) {
		this.firstName = firstName;
		this.joiningDate = joiningDate;
		++count;
		id = count;
	}
	
	public void display(){
//		++count;
		System.out.print("firstName"+ firstName+ "\t");
//		System.out.println("Joining Date"+ joiningDate.getFormattedDate());
//		System.out.println("Joining Date"+ joiningDate.toString());
		System.out.println("Joining Date"+ joiningDate);
	}
	
	
	
	
	
	
	
	
	
}
