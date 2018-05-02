

public class Product {
	private int id;
	private String name;
	
	public Product(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag;
		
		System.out.println("inside equals");
		
		flag = ((this.id == ((Product)obj).id) && (this.name.equals(((Product)obj).name)));
		
		return flag;
	}
	
	@Override
	public String toString() {
		return id + "/" + name;
	}
	
	
	
}
