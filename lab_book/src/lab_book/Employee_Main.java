package lab_book;
import java.util.Scanner;

public class Employee_Main {
public static void main(String[] args) {
	/*Employee e1= new Employee("Amit","Mohite",25425,"A3","23-05-1997");
	e1.Display();
	Employee e2= new Employee("VInayak","Gajam",85425,"A4","13-07-1997");
	e2.Display();
	Employee e3= new Employee("Nikhil","Panvilkar",95425,"A5","07-10-1997");
	e3.Display();
	Employee e4= new Employee("Saurabh","Karal",7725425,"A6","30-07-1997");
	e4.Display();
	e1.Display();*/
	char choice;
	int counter=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first name");
	String fname=s.next();
	System.out.println("Enter last name");
	String lname=s.next();
	System.out.println("Enter salary");
	int salary=s.nextInt();
	System.out.println("Enter doj");
	String doj=s.next();
	
	Employee e=new Employee(fname,lname,salary,doj);
	e.Display();
	System.out.println("Want to add employee details?(Y/N)");
	choice=s.next().charAt(0);
	while (choice=='Y'|| choice=='y')
	{
			 System.out.println("Enter first name");
		     fname=s.next();
		     System.out.println("Enter last name");
		     lname=s.next();
		     System.out.println("Enter salary");
		     salary=s.nextInt();
		     System.out.println("Enter doj");
		     doj=s.next();
			 e=new Employee(fname,lname,salary,doj);
			 e.Display();
			 counter++;
			 System.out.println("Want to add employee details?(Y/N)");
			 choice=s.next().charAt(0);
    }
	if (choice=='N'|| choice=='n')
	{
		System.out.println("No. of records: "+counter);
	}
	
	s.close();
}
}
