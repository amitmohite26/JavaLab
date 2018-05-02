import java.util.TreeMap;



import java.util.Comparator;
import java.util.Set;
public class Entry {
	public static void main(String[] args) {
		

		TreeMap<Product, Productvalue> entries = new TreeMap<>(new ProductComperator());
		
		Productvalue pv1=new Productvalue(1,"Pen",10.0);
		Product p1=new Product(pv1.getId(),pv1.getName());
		
		entries.put(p1, pv1);
		
		
		Productvalue pv2=new Productvalue(2,"Pencil",5.0);
		Product p2=new Product(pv2.getId(),pv2.getName());
		
		entries.put(p2, pv2);
		
		
		Productvalue pv3=new Productvalue(3,"Erasor",5.0);
		Product p3=new Product(pv3.getId(),pv3.getName());
		
		entries.put(p3, pv3);
		
		
		Productvalue pv4=new Productvalue(4,"Shapner",7.0);
		Product p4=new Product(pv4.getId(),pv4.getName());
		
		entries.put(p4, pv4);
		System.out.println("Map entries: "+entries.size());
		
		Set<Product> keys =  entries.keySet();
		
		
		for(Product key :  keys)
			System.out.println(key);
		
		
	}

	
}	
	class ProductComperator implements Comparator<Product>
	{
		@Override
		public int compare(Product o1, Product o2) {
			
			int diff = o1.getId() - o2.getId(); 
					
			
			
			if(diff != 0)
				return diff;
			else{
				diff = o1.getName().compareTo(o2.getName());;
				return diff;
			}
		}
	}


