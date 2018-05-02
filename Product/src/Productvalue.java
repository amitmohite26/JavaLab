
public class Productvalue {
	private int id;
	private String name;
	private Double price;
	public Productvalue(int id, String name, Double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "/" + name+ "/" + price;
	}
}
