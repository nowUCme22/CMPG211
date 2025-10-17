import java.io.*;
public class ReadStuff
{
	private static ObjectInputStream input;
	private static Thing[] stuff = new Thing[30];
	private static int numOfObjects = 0;
	
	public static void main(String[] args)
	{
		try
		{
			input = new ObjectInputStream(new FileInputStream("stuff.ser"));
		}
		catch(IOException ioe)
		{
			System.exit(1);
		}
		
		try
		{
			while(true)
			{
				stuff[numOfObjects++] = (Thing)input.readObject();
			}
		}
		catch(EOFException eofe)
		{
			System.out.println("End of file reached, continue with work");
		}
		catch(IOException ioe)
		{
			System.exit(1);
		}
		catch(ClassNotFoundException cnfe)
		{
			System.exit(1);
		}
		catch(Exception e)
		{
			System.exit(1);
		}
		
		try
		{
			input.close();
		}
		catch(IOException ioe)
		{
			System.exit(1);
		}
		
		for(int i = 0 ; i < numOfObjects ; i++)
		{
			System.out.println(stuff[i]);
		}
		System.out.println("Ration between length, width od rectangular things");
		
		for(int i = 0 ; i < numOfObjects ; i++)
		{
			if(stuff[i] instanceof RectangularThing)
			{
				RectangularTing temp = (RectangularThing)stuff[i];
				System.out.println(temp.getWidth()/temp.getLength());
			}
		}
	}
}