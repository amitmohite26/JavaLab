package com.cg;

public class Entry {
public static void main(String[] args) {
	Employee e = new Employee("mahi",20000.00);
	System.out.println("Employee name is "+e.getName()+ " salary is "+e.getSalary());
	
	ContractEmployee c = new ContractEmployee(8);
	
	PermanentEmployee p = new PermanentEmployee("sau",100.00);
	PermanentEmployee p1 = new PermanentEmployee("sau",100.00);
	
	System.out.println("permanent employee count is "+PermanentEmployee.count);
	System.out.println( " permanent salary is "+p.getSalary()+ " name of permanent employee is "+p.getName());
	System.out.println( " permanent salary is "+p1.getSalary()+ " name of permanent employee is "+p1.getName());
	
	Contractor con = new Contractor("amit",100.00);
	c.setContractor(con);
	c.getContractor();
	System.out.println("contract employee count is "+ContractEmployee.count);
			System.out.println(" contractEmployee salary is "+c.getSalary()+" contractor name is "+con.getName());
	
	
}
}
