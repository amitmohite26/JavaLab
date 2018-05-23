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
		
		
		Address address1= new Address("Talwade Gaon");
		Department dept1= new Department(1, "IT");
		Employee emp = service.createEmployee(50948, "Sagar", 60000 , address1 ,dept1);
 
		Department dept2= new Department(2, "L&D");
		Address address2 = new Address("Bhel Chowk");
		Employee emp2= service.createEmployee(50950, "Ben Stokes", 100000,address2,dept2);
		
		
		
		em.getTransaction().commit();
		System.out.println("Persisted "+emp);
		System.out.println("Persisted "+emp2);
		
		
		em.close();
		emf.close();
	}

}
