// get input from user
import java.util.Scanner; //import the Scanner class

public class Pro20250212A
{
  public static void main(String args[])
  {
	  //create an new object for the class
    Scanner input = new Scanner(System.in);// like System.out.println,but we want input hence System.in
	System.out.print("Please enter your name: "); // print put cursor on the same line, println gives new line 
	//nextLine reads line until where enter is pressed
	String name = input.nextLine();
	System.out.println("Welcme to CMPG 211 "+ name);
	//format the string \n%s\n for the next line
	//\n new line
	//%s ask for a string
	//%f float
	//%d double
	System.out.printf("I hope you are going to enjoy this... \n%s\n" , name);
  }
}