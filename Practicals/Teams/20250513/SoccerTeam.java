import java.io.*;
public abstract class SoccerTeam implements RankingCalculation, Comparable<SoccerTeam>
{
	private String teamName;
	private String teamNumber;
	
	public SoccerTeam()
	{
		this("","");
	}
	
	public SoccerTeam(String teamNumber, String teamName)
	{
		setTeamName(teamName);
		setTeamNumber(teamNumber);
	}
	
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	
	public void setTeamNumber(String teamNumber)
	{
		this.teamNumber = teamNumber;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	
	public String getTeamNumber()
	{
		return teamNumber;
	}
	
	public abstract String getTeamType();
	
	public int compareTo(SoccerTeam other)
	{
		String thisKey = String.format("%s%03d", getTeamType(), getRankingScore());
		String otherKey = String.format("%s%03d", other.getTeamType(), other.getRankingScore());
		return thisKey.compareTo(otherKey);
	}
	
	public String toString()
	{
		return "Team number: "+getTeamNumber()+ " Name: "+getTeamName() + "Rating: "+ getRankingScore()  ;
	}
}
