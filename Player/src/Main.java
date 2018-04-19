
public class Main {
	
		   public static void main(String[] args) {
		    
		    String [] pname= {"Amit","Vinayak","Nikhil", "Saurabh" , "Aditya"};
			String [] gname= {"Cricket","Hockey"};
			String [] gname1= {"Foot", "Football" , "Basketball" };
			String [] gname2= {"Carram" , "Vollyball"};
			String [] gname3= {"Chess" , "cricket" };
			String [] gname4= {"Football" , "Vollyball"};
			Player[] p=new Player[5];
			
	     	//Game g=new Game();	
			Game[] ga=new Game[2];
			
			for (int i=0;i<p.length;i++)
			{
				p[i]=new Player();
				p[i].setName(pname[i]);
				System.out.println("Player name :"+p[i].getName());
				
				for (int j=0;j<5;j++)
				{
					switch(j)
					{
					case 0:
	            ga[j]=new Game();
	            ga[j].setName(gname[j]);
	            System.out.println("Game name :"+ga[j].getName());
	            break;
					case 1:
	            ga[j]=new Game();
	            ga[j].setName(gname1[j]);
	            System.out.println("Game name :"+ga[j].getName());
	            break;
					case 2:
	            ga[j]=new Game();
	            ga[j].setName(gname2[j]);
	            System.out.println("Game name :"+ga[j].getName());
	            break;
					case 3:
	            ga[j]=new Game();
	            ga[j].setName(gname3[j]);
	            System.out.println("Game name :"+ga[j].getName());
	            break;
					case 4:
	            ga[j]=new Game();
	            ga[j].setName(gname4[j]);
	            System.out.println("Game name :"+ga[j].getName());
	            default:
	            	System.out.println("end case");
	            
				}
				}
				}
			
		}
		}


