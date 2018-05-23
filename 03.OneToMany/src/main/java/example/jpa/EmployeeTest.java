package example.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);
		em.getTransaction().begin();
		/*Address address = new Address();
		address.setId(1);
		address.setLine("Worli");
		Employee emp = service.createEmployee(50948, "Sagar", 60000 , address);
		em.getTransaction().commit();
		System.out.println("Persisted "+emp);
		*/
		
		Address address = new Address(1,"Talwade Gaon");
		Employee emp= new Employee(50948, "Sagar", 60000,address);
		Address address2 = new Address(2,"NIgdi");
		Employee emp2= new Employee(50949, "Abhishek", 50000,address2);
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(emp);                                    
		employees.add(emp2);
		Department dept = service.createDepartment(1, "Sid", employees);

		
		Address address3 = new Address(3,"Bhel Chowk");
		Employee emp3= new Employee(50950, "Ben Stokes", 100000,address3);
		Address address4 = new Address(4,"Triveni nagar");
		Employee emp4= new Employee(50951, "Anshul", 450000,address4);
		List<Employee> employees2=new ArrayList<Employee>();
		employees2.add(emp3);
		employees2.add(emp4);
		Department dept2= service.createDepartment(2,"L&D",employees2);
		
		
		em.getTransaction().commit();
		System.out.println("Persisted "+dept);
		System.out.println("Persisted "+dept2);
		
		/*emp= service.findEmployee(50948);
		System.out.println("Found "+emp);
		
		em.getTransaction().begin();
		emp =service.raiseEmployeeSalary(50948, 20000);
		em.getTransaction().commit();
		System.out.println("Updated "+emp);*/
		em.close();
		emf.close();
	}

}
