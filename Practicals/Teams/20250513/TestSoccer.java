import java.io.*;
import java.util.*;
public class TestSoccer 
{
	//constant variable
	public static final int MAX_NO_TEAMS = 25;
	
	public static void main(String[] args)
	{
		//create an array for 2 objects
		int noOfTeams = 0;
		SoccerTeam teams[] = new SoccerTeam[MAX_NO_TEAMS];
		
		//read out of textfile
		try (Scanner fileScanner = new Scanner(new File("soccerdata.txt")))
		{
			while (fileScanner.hasNextLine() && noOfTeams < MAX_NO_TEAMS)
			{
			  String inLine = fileScanner.nextLine();
			  String[] fields = inLine.split("#");
			  String teamNumber = fields[0];
			  String teamName = fields[1];
			  char type = teamNumber.charAt(0);
			  try
			  {
				 if (type == 'A') // AmTeam
				 {
					int goalsScored = Integer.parseInt(fields[2]);
					int goalsConceded = Integer.parseInt(fields[3]);
					teams[noOfTeams++] = new AmSoccerTeam(teamNumber,teamName,goalsScored,goalsConceded);
				 }
				 else if (type == 'P') // ProTeam
				 {
					int won = Integer.parseInt(fields[2]);
					int draw = Integer.parseInt(fields[3]);
					int lost = Integer.parseInt(fields[4]);
					teams[noOfTeams++] = new ProSoccerTeam(teamNumber,teamName,won,draw,lost);
					
				 }
				 else
				 {
					 System.out.println("INvalid team code in line: " + inLine);
				 }
				 
			  }catch (Exception e) //exceptions
			  {
				  System.out.println("Error processing line: " + inLine);
				  System.out.println("Reason: " + e.getMessage());
			  }
			}
		}catch (FileNotFoundException e)
		{
			System.out.println("soccerdata.txt file not found");
			System.exit(-1);
		}
		
		//Arrays.sort(teams, 0, noOfTeams);
		
		//list all teams  A- number- name- goals scored-goals conceded
		// P-number - name - won - draw - lost
		System.out.println("List of teams:");
		for (int i = 0 ; i < noOfTeams ; i++)
		{
			System.out.println(teams[i]);
		}
		
		System.out.println("");
		Arrays.sort(teams, 0, noOfTeams);
		
		
		System.out.println("List of teams after sort:");
		for (int i = 0; i < noOfTeams; i++) {
			if (teams[i] instanceof AmSoccerTeam) {
				AmSoccerTeam a = (AmSoccerTeam) teams[i];
				System.out.printf(" %s %s Goals Scored: %d Conceded: %d Rating:%d\n",
						a.getTeamNumber(), a.getTeamName(),
						a.getGoalsScored(), a.getGoalsConceded(), a.getRankingScore());
			} else if (teams[i] instanceof ProSoccerTeam) {
				ProSoccerTeam p = (ProSoccerTeam) teams[i];
				System.out.printf(" %s %s Games Won: %d Drawn: %d Lost: %d Rating: %d\n",
						p.getTeamNumber(), p.getTeamName(),
						p.getGamesWon(), p.getGamesDrawn(), p.getGamesLost(), p.getRankingScore());
			}
		}
		
		//rating of teams
		System.out.println("\nRating of teams:");
		System.out.println("Number Teamname Rating");
		for (int i = 0 ; i < noOfTeams ; i++)
		{
			System.out.printf("%s %s %d%n" , teams[i].getTeamNumber(), teams[i].getTeamName(), teams[i].getRankingScore());
		}
		
		//amateur goal difference
		System.out.println("\nAmateur teams goal difference:");
		System.out.println("Number Teamname Difference");
		for (int i = 0 ; i < noOfTeams ; i++)
		{
			if (teams[i] instanceof AmSoccerTeam)
			{
				AmSoccerTeam team = (AmSoccerTeam) teams[i];
			System.out.printf("%s %s %d%n" , team.getTeamNumber(), team.getTeamName(), team.getRankingScore());
			}
		}
		
		
		//most games won
		ProSoccerTeam topTeam = null;
		for (int i = 0 ; i < noOfTeams ; i++)
		{
			if (teams[i] instanceof ProSoccerTeam)
			{
				ProSoccerTeam team = (ProSoccerTeam) teams[i];
				if(topTeam == null || team.getGamesWon() > topTeam.getGamesWon())
				{
					topTeam = team;
				}
			
			}
		}
		
		//print top team
		if (topTeam != null)
		{
			System.out.printf("%nThe most team with the games won is: %s with %d wins%n" ,topTeam.getTeamName(),topTeam.getGamesWon());
		}
		
		
	}
}