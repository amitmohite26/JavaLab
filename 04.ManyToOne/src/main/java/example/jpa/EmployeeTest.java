package example.jpa;


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
		Employee emp3= service.createEmployee(50952, "Rahul", 70000,address2,dept2);
		Employee emp4= service.createEmployee(50960, "Amit", 100000,address2,dept2);
		Employee emp5= service.createEmployee(50660, "Vikas", 200000,address2,dept1);
		Employee emp6= service.createEmployee(50897, "Ganesh", 500000,address2,dept2);
		
		
		em.getTransaction().commit();
		System.out.println("Persisted "+emp);
		System.out.println("Persisted "+emp2);
		System.out.println("Persisted "+emp3);
		System.out.println("Persisted "+emp4);
		System.out.println("Persisted "+emp5);
		System.out.println("Persisted "+emp6);
		
		
		em.close();
		emf.close();
	}

}
