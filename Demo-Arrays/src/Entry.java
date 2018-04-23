
public class Entry {

	public static void main(String[] args) {
		
		
		int values[], value;
		
		value = 10;
		
		System.out.println(value);
		
		values = new int[4];
		
		for(int pos = 0; pos < values.length; pos++){
			System.out.print(values[pos]+ "\t");
		}
		
		System.out.println();
		
//		FOR-EACH loop
		
		for(int v : values)
			System.out.print(v+ "\t");

		
		int[][] mat;
		
//		mat = new int[2][3];
		mat = new int[4][];
		
		mat[0] = new int[3];
		mat[1] = new int[0];
		mat[2] = new int[8];
		mat[3] = new int[4];
		
		
		System.out.println();
		
		for(int row = 0; row < mat.length;row++){
			for(int col = 0; col < mat[row].length; col++){
				
				System.out.print(mat[row][col]+ "\t");
				
			}
			System.out.println();
		}
		
		
		Customer[] customers;
		
		customers = new Customer[4];
		
		for(int pos =0; pos < customers.length; pos++)
			customers[pos] = new Customer();
		
		System.out.println();
		for(Customer customer: customers){
			System.out.print(customer+ "\t");
		}
		
		
		
		
		
		
	}
	
	
}
