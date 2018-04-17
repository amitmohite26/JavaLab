package lab3;
public class PermanentEmployee extends Employee{
	public static int count;
	public String name;
	public double salary;
	
	public PermanentEmployee(String name,double salary){
		super(name,salary);
	count=count+1;	
	}
	
	/*public double getSalary(){
		
		return salary;	
	}*/
	
}
