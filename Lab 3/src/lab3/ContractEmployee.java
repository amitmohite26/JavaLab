package lab3;

public class ContractEmployee extends Employee {
	
	public static int count;
	private Contractor con;
	public int noOfHours;
	public ContractEmployee(int noOfHours){
		count=count+1;
		this.noOfHours=noOfHours;
	}
	public double getSalary(){
		salary =  con.rate * noOfHours;
		return salary;
		
	}
	


	public Contractor getContractor() {
		return con;
	}
	public void setContractor(Contractor contractor) {
		this.con = contractor;
	}
}
