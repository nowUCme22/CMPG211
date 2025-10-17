import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
@author GRD
@version 20250507
*/

public class TestStuffSer
{
	public static final int MAX_NO_OBJECTS = 30;
	
	public static ObjectOutputStream output;
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int noOfThings = 0;
		char type;
		String color;
		int radius;
		int length;
		int width;
		Thing stuff[] = new Thing[MAX_NO_OBJECTS];
		while(input.hasNext())
		{
			type = input.next().charAt(0);
			color = input.next();
			if (type == 'C') // round thing
			{
				radius = input.nextInt();
				stuff[noOfThings++] = new RoundThing(color,radius);
			}
			else if (type == 'R') // rectangle
			{
				length = input.nextInt();
				width = input.nextInt();
				stuff[noOfThings++] = new RectangularThing(color, length, width);
			}
			else if (type == 'S') // square
			{
				length = Integer.parseInt(input.next());
				stuff[noOfThings++] = new SquareThing(color,length);
			}
			else
			{
				System.out.println("Invalid input");
			}
		}
		
		for (int i = 0; i < noOfThings; i++)
		{
			System.out.println(String.format("%s %f",stuff[i].getColor(),stuff[i].getArea()));
		}
		
		try
		{
			output = new ObjectOutputStream(new FileOutputStream("stuff.ser"));
			System.out.println("File is open");
		}
		catch(IOException ioe)
		{
			System.out.println("Error opening file: " + ioe);
			System.exit(1);
		}
		
		for (int i=0; i<noOfThings; i++)
		{
			try
			{
				output.writeObject(stuff[i]);
			}
			catch(IOException ioe)
			{
				System.out.println("Problem writing object: " + ioe);
				System.exit(-1);
			}
		}
		
		try
		{
			output.close();
			System.out.println("Output file was closed");
		}
		catch(IOException ioe)
		{
			System.out.println("Could not close output file" + ioe);
			System.exit(1);
		}
		
	}
}








