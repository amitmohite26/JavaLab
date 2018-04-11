package lab_book;

import java.util.Scanner;


public class Employee_Main {
	public static void main(String[] args) {
		
		char choice;
		int counter = 1,day,month,year;
	

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = s.next();
		System.out.println("Enter last name");
		String lname = s.next();
		System.out.println("Enter salary");
		int salary = s.nextInt();
		System.out.println("Enter day");
		day=s.nextInt();
		System.out.println("Enter month");
		month=s.nextInt();
		System.out.println("Enter year");	
		year=s.nextInt();
			Employee e = new Employee(fname, lname, salary, day, month, year);
			e.Display();
			System.out.println("Want to add employee details?(Y/N)");
			choice = s.next().charAt(0);
			while (choice == 'Y' || choice == 'y') 
			{
				System.out.println("Enter first name");
				fname = s.next();
				System.out.println("Enter last name");
				lname = s.next();
				System.out.println("Enter salary");
				salary = s.nextInt();
				System.out.println("Enter day");
				day=s.nextInt();
				System.out.println("Enter month");
				month=s.nextInt();
				System.out.println("Enter year");
				year=s.nextInt();
				
				e = new Employee(fname, lname, salary, day, month, year );
				e.Display();
				counter++;
				System.out.println("Want to add employee details?(Y/N)");
				choice = s.next().charAt(0);
			}
			if (choice == 'N' || choice == 'n') {
				System.out.println("No. of records: " + counter);
			}
		
		s.close();
	}
}
