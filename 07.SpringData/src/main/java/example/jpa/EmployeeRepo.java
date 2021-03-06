package example.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
@Query(value="select e from Employee e join fetch e.dept where e.id=?1")
	
	public Employee findById(int id);
}
