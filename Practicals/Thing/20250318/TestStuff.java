import java.util.*;

public class TestStuff
{
	//constant
	public static final int MAX_NO_THINGS = 10;
	
	public static void main(String[] args)
	{
		//array of Thing objects
		Thing[] stuff = new Thing[MAX_NO_THINGS];
		
		stuff[0] = new RoundThing("Blue",10);
		stuff[1] = new SquareThing("Red",5);
		stuff[2] = new RectangularThing("Yellow",10,5);
		stuff[3] = new SquareThing("Purple",8);
		stuff[4] = new RoundThing("Grey",6);
		stuff[5] = new SquareThing("Orange",9);
		stuff[6] = new RoundThing("Indigo",10);
		
		//create copy of array, but only using thr first 7 element
		Thing[] tempStuff = Arrays.copyOf(stuff,7);
		Arrays.sort(tempStuff);
		
		for (int i = 0; i < tempStuff.length; i++)
			System.out.println(tempStuff[i]);
		
		//sort the arrays
		/*Arrays.sort(stuff,0,7);
		
		for (int i = 0; i < MAX_NO_THINGS; i++)
		{
			System.out.println(stuff[i]);
		}*/
		
		/*System.out.println("Size of stuff = " + stuff.length); //give length/size of array (instance variable)
	      String name = "John Doe";
		  System.out.println("Size of name = " +name.length()); //give length of string/name (method)
		*/
	}
}