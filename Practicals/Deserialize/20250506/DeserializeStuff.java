import java.io.*;
public class DeserializeStuff
{
	public static final int MAX = 30;
	private static OutputInputStream input;
	private static Thing[] = new Thing[MAX];
	private static int noOfObjects = 0;
	
	public static void main (String[] args)
	{
		try
		{
			input = new ObjectInputStream(new FileInputStream("stuff.ser"));
		}
		catch (IOException ioe)
		{
			System.out.println("Error: " + ioe);
		}
	}
}