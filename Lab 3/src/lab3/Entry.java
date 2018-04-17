package lab3;

public class Entry {
public static void main(String[] args) {
	Employee e = new Employee("Amit",14000.00);
	System.out.println("Employee name: "+e.getName()+ " Salary: "+e.getSalary());
	
	PermanentEmployee pe = new PermanentEmployee("Vinayak",150000.00);
	PermanentEmployee pe1 = new PermanentEmployee("Nikhil",250000.00);
	System.out.println(" Name: "+pe.getName()+" Salary:  "+pe.getSalary());
	System.out.println(" Name: "+pe1.getName()+" Salary:  "+pe1.getSalary() );
	System.out.println("Total Permanent employee records: "+PermanentEmployee.count);
	
	Contractor con = new Contractor("Aditya",100.00);
	ContractEmployee c = new ContractEmployee(9);
	c.setContractor(con);
	c.getContractor();
	System.out.println(" Contractor Name: "+con.getName()+"  Salary per day: "+c.getSalary());
	System.out.println("Total Contract Based records: "+ContractEmployee.count);
	
	
}
}
