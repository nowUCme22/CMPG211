public class AmSoccerTeam extends SoccerTeam 
{
	private int goalsScored;
	private int goalsConceded;
	
	public AmSoccerTeam()
	{
		this("","",0,0);
	}
	
	public AmSoccerTeam(String teamName, String teamNumber, int goalsScored, int goalsConceded)
	{
		super(teamName, teamNumber);
		setGoalsScored(goalsScored);
		setGoalsConceded(goalsConceded);
	}
	
	public void setGoalsScored(int goalsScored)
	{
		this.goalsScored = goalsScored;
	}	
	
	public void setGoalsConceded(int goalsConceded)
	{
		this.goalsConceded = goalsConceded;
	}	

	public int getGoalsScored()
	{
		return goalsScored;
	}
	
	public int getGoalsConceded()
	{
		return goalsConceded;
	}
	
	public int getRankingScore()
	{
		return (int) ((getGoalsScored()*4-getGoalsConceded()*3)*200.0/(getGoalsScored()+getGoalsConceded()));
	}
	
	public String getTeamType()
	{
		return "A";
	}
	
	public String toString()
	{
		return String.format("%-41s Goals Scored:%3d Conceded:%3d",super.toString(), getGoalsScored(), getGoalsConceded());
	}
	
	public static void main(String[] args) 
	{
		AmSoccerTeam ast1 = new AmSoccerTeam("A123","Makwasi Sunrise",39,8);
		System.out.println(ast1);
		System.out.println(ast1.getTeamName()+" has ranking "+ast1.getRankingScore());
		
	}
}