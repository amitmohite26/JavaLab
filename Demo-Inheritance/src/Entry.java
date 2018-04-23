import com.cg.Animal;
import com.cg.Dog;

public class Entry {
	public static void main(String[] args) {
		
		Animal animalRef;
		
//		animalRef = new Animal("White",3);
		animalRef = new Dog();
		
		animalRef.eat();
		animalRef.roam();
	}
}
