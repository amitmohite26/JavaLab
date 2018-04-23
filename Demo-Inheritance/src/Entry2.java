import com.cg.Animal;
import com.cg.Dog;
import com.cg.Pet;

public class Entry2 {

	public static void main(String[] args) {
		Pet petRef;
		
//		petRef = new Pet();
		
		petRef = new Dog();
		
		System.out.println(petRef.beFriendly());;
		petRef.play();
		
		Animal animalRef=null;
		
		petRef = (Pet)animalRef;
		
		String message = new String();
		
//		petRef = (Pet)message;
		System.out.println(petRef.MAX);
		System.out.println(Pet.MAX);
	}
	
	
}
