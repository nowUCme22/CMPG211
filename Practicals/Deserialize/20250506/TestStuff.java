import java.util.*;
public class TestStuff
{
	public static final int MAX_NO_OBJECTS = 10;
	public static void main(String[] args)
	{
		int noOfThings = 0; 
// I added this counter to count the actual number of Things. Why does it work?
		Thing stuff[] = new Thing[MAX_NO_OBJECTS];
		stuff[noOfThings++]=new RoundThing("Blue",11);
		stuff[noOfThings++]=new SquareThing("Red",5);
		stuff[noOfThings++]=new RectangularThing("Yellow",10,5);
		stuff[noOfThings++]=new SquareThing("Purple",8);
		stuff[noOfThings++]=new RoundThing("Grey",6);
		stuff[noOfThings++]=new SquareThing("Orange",9);
		stuff[noOfThings++] = new RoundThing("Indigo",10);
		for (int i = 0; i < MAX_NO_OBJECTS; i++)
			System.out.println(stuff[i]);	
		System.out.println();
		for (int i = 0; i < noOfThings; i++)
		System.out.printf("%s and my area is %2.1f \n",stuff[i],stuff[i].getArea());	
		System.out.println();	
		for (int i = 0; i < noOfThings; i++)
			System.out.println(stuff[i].tellAbout());
		System.out.println("\nAfter sort");
// metode 1
		Arrays.sort(stuff,0,noOfThings);
		for (int i = 0; i < MAX_NO_OBJECTS; i++)
			System.out.println(stuff[i]);	
// metode 2
		Thing tempstuff[] = Arrays.copyOf(stuff,noOfThings);
		Arrays.sort(tempstuff);
		for (int i = 0; i < tempstuff.length; i++)
			System.out.println(tempstuff[i]);	
		
	}
}









Explain