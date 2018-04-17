package lab3;

public class ContractEmployee extends Employee {
	
	public static int count;
	private Contractor contractor;
	public int noOfHours;
	public ContractEmployee(int noOfHours){
		this.noOfHours=noOfHours;
		count++;
	}
	
	public double getSalary(){
		salary =  contractor.rate * noOfHours;
		return salary;
		
	}
	
	public Contractor getContractor() {
		return contractor;
	}
	
	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}
}
