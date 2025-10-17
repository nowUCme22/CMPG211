import java.util.*;
import java.io.*;
/**
@author M Vermaak
@version 20250319
*/
public class TestStuff2
{
	public static final int MAX_NO_OBJECTS = 30;
	public static ObjectOutputStream output; //outside methods, global variable
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int noOfThings = 0;
		
		//read character, string and then number
		char type;
		String color;
		int radius;
		int length;
		int width;
		
		//declare array
		Thing[] stuff = new Thing[MAX_NO_OBJECTS];
		
		//while
		while (input.hasNext()) // hasNext() returns true if there is more input
		{
			type = input.next().charAt(0); // Get the first character
			color = input.next();

			if (type == 'C') // RoundThing
			{
				radius = input.nextInt();
				stuff[noOfThings++] = new RoundThing(color, radius);
			}
			else if (type == 'R') // RectangularThing
			{
				length = input.nextInt();
				width = input.nextInt();
				stuff[noOfThings++] = new RectangularThing(color, length, width);
			}
			else if (type == 'S') // SquareThing
			{
				length = input.nextInt();
				stuff[noOfThings++] = new SquareThing(color, length);
			}
			else
			{
				System.out.println("Invalid input");
				input.nextLine();
			}
		}
		
		//output
		for (int i = 0; i < noOfThings; i++)
		{
			System.out.println(stuff[i]);
		}
		
		try
		{
			output = new ObjectOutputStream(new FileOutputStream("stuff.ser"));
			System.out.println("File opened");
		}
		catch(IOException ioe)
		{
			System.out.println("Error opening file: "+ ioe);
			System.exit(1);
		}
		for(int i = 0; i < noOfThings; i++)
		{
			try
			{
				output.writeObject(stuff[i]);
			}
			catch(IOException ioe)
			{
				System.out.println("Problem writing object "+ioe);
				System.exit(1);
			}
		}
		
		try
		{
			output.close();
			System.out.println("File close");
		}
		catch(IOException ioe)
		{
			System.out.println("Problem writing object "+ioe);
			System.exit(1);
		}
		
	}
}