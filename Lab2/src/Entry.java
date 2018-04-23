import com.cg.Employee;
import com.cg.util.Date;

public class Entry {

	public static void main(String[] args) {
		Date joiningDate = new Date(1, 1, 2000);
		Employee ref = new Employee("Vikas", joiningDate);
		Employee ref2 = new Employee("Vikas", joiningDate);
		
		ref.display();ref.display();ref.display();ref.display();ref.display();ref.display();ref.display();
		ref.display();ref.display();ref.display();ref.display();ref.display();ref.display();ref.display();
		
		System.out.println(Employee.getCount());
		System.out.println(Employee.getCount());
		
		System.out.println(Employee.getCount());
	}
	
}
