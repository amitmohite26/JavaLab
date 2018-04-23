
public class Main {
	
		   public static void main(String[] args) {
		    
		    String [] pname= {"Amit","Vinayak","Nikhil", "Saurabh" , "Aditya"};
			String [] gname= {"Cricket" , "Hockey"};
			String [] gname1= {"Foot", "Football" , "Basketball" };
			String [] gname2= {"Carram" , "Vollyball"};
			String [] gname3= {"Chess" , "cricket" };
			String [] gname4= {"Football" , "Vollyball"};
			Player p=new Player();
			
	     	Game g[]=p.getGame();	
			//Game[] ga=new Game[2];
			
			for (int i=0;i<5;i++)
			{
				//p[i]=new Player();
				p.setName(pname[i]);
				//p[i].setName(pname[i]);
				System.out.println("Player name :"+p.getName());
				
				for (int j=0;j<g.length;j++)
				{
					switch(j)
					{
					case 0:
	           // g[j]=new Game();
	            //g[j].setName(gname[j]);
	            System.out.println("Game name :"+g[j].getName());
	            break;
					case 1:
	            g[j]=new Game();
	            g[j].setName(gname1[j]);
	            System.out.println("Game name :"+g[j].getName());
	            break;
					case 2:
	            g[j]=new Game();
	            g[j].setName(gname2[j]);
	            System.out.println("Game name :"+g[j].getName());
	            break;
					case 3:
	            g[j]=new Game();
	            g[j].setName(gname3[j]);
	            System.out.println("Game name :"+g[j].getName());
	            break;
					case 4:
	            g[j]=new Game();
	            g[j].setName(gname4[j]);
	            System.out.println("Game name :"+g[j].getName());
	            default:
	            	System.out.println("end case");
	            
				}
				}
				}
			
		}
		}


