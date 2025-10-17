public class ProSoccerTeam extends SoccerTeam 
{
	private int gamesWon;
	private int gamesDrawn;
	private int gamesLost;
	
	public ProSoccerTeam()
	{
		this("","",0,0,0);
	}
	
	public ProSoccerTeam(String teamName, String teamNumber, int gamesWon, int gamesDrawn, int gamesLost)
	{
		super(teamName, teamNumber);
		setGamesWon(gamesWon);
		setGamesDrawn(gamesDrawn);
		setGamesLost(gamesLost);
	}
	
	public void setGamesWon(int gamesWon)
	{
		this.gamesWon = gamesWon;
	}	
	
	public void setGamesDrawn(int gamesDrawn)
	{
		this.gamesDrawn = gamesDrawn;
	}	
	
	public void setGamesLost(int gamesLost)
	{
		this.gamesLost = gamesLost;
	}	
	
	public int getGamesWon()
	{
		return gamesWon;
	}	

	public int getGamesDrawn()
	{
		return gamesDrawn;
	}
	
	public int getGamesLost()
	{
		return gamesLost;
	}
	
	public int getRankingScore()
	{
		return (int)((getGamesWon()*3+getGamesDrawn()-getGamesLost()*2)*200.0/(getGamesWon()+getGamesDrawn()+getGamesLost()));
	}
	
	public String getTeamType()
	{
		return "P";
	}

	public String toString()
	{
		return String.format("%-41s Games Won:%2d Drawn:%2d Lost:%2d", super.toString() ,getGamesWon(), getGamesDrawn(), getGamesLost());
	}

	public static void main(String[] args) 
	{
		ProSoccerTeam pst1 = new ProSoccerTeam("A123","Makwassi Sunrise",17,5,0);
		System.out.println(pst1);
		System.out.println(pst1.getTeamName()+" has ranking "+pst1.getRankingScore());
		
	}
}
