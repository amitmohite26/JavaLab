package lab_book;

import java.util.Scanner;


public class Employee_Main {
	public static void main(String[] args) {
		
		char choice;
		int percount = 1,contcount=1,day,month,year,salary;
	

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = s.next();
		System.out.println("Enter last name");
		String lname = s.next();
		System.out.println("Enter day");
		day=s.nextInt();
		System.out.println("Enter month");
		month=s.nextInt();
		System.out.println("Enter year");	
		year=s.nextInt();
		System.out.println("Enter Job type:");
		char jt=s.next().charAt(0);
		if (jt=='C' || jt== 'c')
		{
			System.out.println("Enter salary");
			salary=s.nextInt();
			System.out.println("Enter daily working hours");
			int wpd=s.nextInt();
			System.out.println("Enter Contractor name: ");
			String cname=s.next();
			Employee e1=new Employee(fname,lname,day,month,year,salary,wpd,cname);
			e1.displayContract();
		}
		else if (jt=='P' || jt=='p')
		{
			System.out.println("Enter salary");
			salary = s.nextInt();
			Employee e2 = new Employee(fname, lname,  salary, day, month, year);
			e2.Display();
		}
		
			
			System.out.println("Want to add employee details?(Y/N)");
			choice = s.next().charAt(0);
			while (choice == 'Y' || choice == 'y') 
			{
				System.out.println("Enter first name");
				fname = s.next();
				System.out.println("Enter last name");
				lname = s.next();
				System.out.println("Enter Job type:");
				jt=s.next().charAt(0);
				if (jt=='C' || jt== 'c')
				{
					System.out.println("Enter salary");
					salary=s.nextInt();
					System.out.println("Enter daily working hours");
					int wpd=s.nextInt();
					System.out.println("Enter Contractor name: ");
					String cname=s.next();
					Employee e1=new Employee(fname,lname,day,month,year,salary,wpd,cname);
					e1.displayContract();
					contcount++;
				}
				else if (jt=='P' || jt=='p')
				{
					System.out.println("Enter salary");
					salary = s.nextInt();
					Employee e2 = new Employee(fname, lname,  salary, day, month, year);
					e2.Display();
					percount++;
				}
				
				System.out.println("Enter salary");
				salary = s.nextInt();
				System.out.println("Enter day");
				day=s.nextInt();
				System.out.println("Enter month");
				month=s.nextInt();
				System.out.println("Enter year");
				year=s.nextInt();
				
				
				System.out.println("Want to add employee details?(Y/N)");
				choice = s.next().charAt(0);
			}
			if (choice == 'N' || choice == 'n') {
				System.out.println("No. of Permanent Emnployee records: " +percount);
				System.out.println("No. of Contract Based Emnployee records: " +contcount);
			}
		
		s.close();
	}
}
