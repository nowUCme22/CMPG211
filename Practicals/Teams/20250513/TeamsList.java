import java.io.*;
import java.util.*;

public class TeamsList
{
   
   
   
   
   private Scanner input;
   private SoccerTeam teams[];
   private int numberOfTeams;
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
   }
   catch (FileNotFoundException e)
   {
      System.out.println("Problem opening input file: "+e);
      System.exit(1);
   }

   while (input.hasNext())
   {
      inLine = input.nextLine();
      String[] fields = inLine.split("#");
      teamNumber = fields[0];
      teamName = fields[1];
      type = teamNumber.charAt(0);
      //try
      //{
         if (type == 'A') // AmTeam
         {
            goalsScored = Integer.parseInt(fields[2]);
            goalsConceded = Integer.parseInt(fields[3]);
            teams[numberOfTeams++] = new AmSoccerTeam(teamNumber,teamName,goalsScored,goalsConceded);
         }
         else if (type == 'P') // ProTeam
         {
			goalsScored = Integer.parseInt(fields[2]);
            goalsConceded = Integer.parseInt(fields[3]);
            teams[numberOfTeams++] = new ProSoccerTeam(teamNumber,teamName,goalsScored,goalsConceded);
			
		 }
	}