import java.io.*;
import java.util.*;


public class TeamsList2
{
   public static void main(String[] args)
   {
      SoccerTeam teams[] = new SoccerTeam[30];
      int numberOfTeams = 0;
      Scanner input;

      String inLine;
      String teamNumber;
      String teamName;
      int goalsScored;
      int goalsConceded;
      int gamesWon;
      int gamesLost;
      int gamesDrawn;
      char type;
      
      try
      {
         input = new Scanner(new File("soccerdata.txt"));
// The delimiter is changed using the next instruction. Then the Scanner methods next() and nextInt() can be used to read the different fields.
         input.useDelimiter("[#\\n\\r]");
      
   
         while (input.hasNext())
         {
            teamNumber = input.next();
            teamName = input.next();
            type = teamNumber.charAt(0);
            
               if (type == 'A') // AmTeam
               {
                  goalsScored = input.nextInt();
                  goalsConceded = input.nextInt();
                  teams[numberOfTeams] = new AmSoccerTeam(teamNumber,teamName,goalsScored,goalsConceded);
                  numberOfTeams++;
               }
               else if (type == 'P') // ProTeam
               {
                  gamesWon = input.nextInt();
                  gamesDrawn = input.nextInt();
                  gamesLost = input.nextInt();
                  teams[numberOfTeams] = new ProSoccerTeam(teamNumber,teamName,gamesWon,gamesDrawn,gamesLost);
                  numberOfTeams++;
               }            
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Problem opening input file: "+e);
         System.exit(1);
      }
	  
	  Arrays.sort(teams, 0, numberOfTeams);
   
      
      System.out.println("\nList of teams:");
      for (int i=0;i<numberOfTeams;i++)
         System.out.println(teams[i]);

      System.out.printf("\nRanking of teams:\n%-8s %-20s %-8s\n","Number","Team name","Ranking");
      for (int i=0;i<numberOfTeams;i++) 
      System.out.printf("%-8s %-20s %3d\n",teams[i].getTeamNumber(),teams[i].getTeamName(),teams[i].getRankingScore());

// The next piece of code first casts teams[i] to AmSoccerTeam and then invokes getGoalsScored
      System.out.printf("\nAmateur teams goal difference:\n%-8s %-15s %-10s\n","Number","Team name","Difference");
      for (int i=0; i<numberOfTeams; i++)
         if (teams[i] instanceof AmSoccerTeam)
            System.out.printf("%-8s %-15s %7d\n",teams[i].getTeamNumber(),teams[i].getTeamName(),((AmSoccerTeam)teams[i]).getGoalsScored() - ((AmSoccerTeam)teams[i]).getGoalsConceded());

// The next piece of code casts teams[i] to a temp AmSoccerTeam object and the uses that to invoke getGoalsScored
      System.out.printf("\nAmateur teams goal difference:\n%-8s %-15s %-10s\n","Number","Team name","Difference");
      for (int i=0; i<numberOfTeams; i++)
         if (teams[i] instanceof AmSoccerTeam)
         {
            AmSoccerTeam temp = (AmSoccerTeam)teams[i];
            System.out.printf("%-8s %-15s %7d\n",teams[i].getTeamNumber(),teams[i].getTeamName(),temp.getGoalsScored() - temp.getGoalsConceded());
         }
   }

}