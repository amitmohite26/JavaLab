package example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service(value="service")
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	private EmployeeRepo repo;
@Transactional
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		Employee e1 = repo.save(e);
		return e1;
	}
//@Transactional
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
