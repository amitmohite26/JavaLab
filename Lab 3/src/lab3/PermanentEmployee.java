package lab3;
public class PermanentEmployee extends Employee{
	protected static int count;
	private String name;
	private double salary;
	
	public PermanentEmployee(String name,double salary){
		super(name,salary);
		count++;	
	}
	
}
