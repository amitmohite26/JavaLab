package lab3;

public class Contractor {
	private String name;
	public double rate;
	
	public Contractor(){
		
	}
	public Contractor(String name,double rate){
		this.name=name;
		this.rate=rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
