package example.jpa;


import javax.persistence.*;
@Entity
public class Employee {

	


	@Id private int id;
	private String name;
	private int salary;
    @Embedded
	private Address address;
    @ManyToOne(cascade=CascadeType.ALL)
    private Department dept;

   
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Employee(){}

	public Employee(int id){
		this.id=id;	
	}

	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public int getId() {
		return id;
	}

	public Employee(int id, String name, int salary, Address address, Department dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" +address.getLine() + ", dept="
				+ dept.getName() + "]";
	}

	
	
}
