package example.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import  java.util.List;

@Entity
public class Department {
@Id private int id;
    private String name;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="DEPT_ID")
    private List<Employee> employee;
    
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public List<Employee> getEmployees() {
		return employee;
	}


	public void setEmployees(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
