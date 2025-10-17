import java.util.*;
/**
@author M Vermaak
@version 20250319
*/
public class TestStuff
{
	public static final int MAX_NO_OBJECTS = 30;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int noOfThings = 0;
		
		//read character, string and then number
		char type;
		String color;
		int radius;
		int lenght;
		int width;
		
		//declare array
		Thing stuff[] = new Thing[MAX_NO_OBJECTS];
		
		//while
		while(input.hasNext()) //hasNext return true if there is index
		{
			type = input.next().charAt(0);//want character at position 0
			color = input.next();
			
			//what type
			if (type == 'C')//round thing
			{
				radius = input.nextInt();
				stuff[noOfThings++] = new RoundThing(color,radius); 
			}
			else if (type == 'R')//rectangle
			{
				lenght = input.nextInt();
				width = input.nextInt();
				stuff[noOfThings++] = new RectangularThing(color,length,width);
			}
			else if (type == 'S')//square
			{
				lenght = Integer.ParseInt(input.nextInt());
				stuff[noOfThings++] = new SquareThing(color,length);
			}
			else
			{
				System.out.println("Invalid input");
			}
		}
		
		//output
		for (int i = 0; i < noOfThings; i++)
		{
			System.out.println(stuff[i]);
		}
	}
}