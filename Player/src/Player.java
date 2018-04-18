
public class Player {
	private String name;
	private Game game[];
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(Game[] game)
	{
		this.game=game;
	}
	public Game[] getGame()
	{
		return game;
	}
}
