package example.jpa;


import org.springframework.context.support.GenericXmlApplicationContext;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);*/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("BeanConfig.xml");
		EmployeeService service = ctx.getBean("service",EmployeeService.class);
		Address a=new Address("nigdi");
		Department dept=new Department(1,"IT");
		
		Employee e=new Employee(1,"Amit",124444,a,dept);
		
		service.createEmployee(e);
		service.findEmployee(1);
System.out.println(e);
		
		
	}

}
