
public class Main {
	
		   public static void main(String[] args) {
			String [] pname= {"Amit","Vinayak","Nikhil", "Saurabh" , "Aditya"};
			String [] game= {"Cricket","Hockey","Football", "Basketball" , "Table Tenies"};
			Player p=new Player();
			Game g=new Game();	
			p.setGame(game);
			for(int i=0;i<5;i++)
			{
				
				
				p.setName(game[i]);
			    p.setName(pname[i]);
				System.out.println("Name: "+p.getName());
				System.out.println("Game: "+g.getName());
				System.out.println("--------------------------------------");
			}				
		}
		}


