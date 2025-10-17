/**
@author Marne Vermaak 48073253
@version 20250311
*/
public class SquareThing extends Thing
{
	private int length;
	
	public SquareThing()
	{
		this("",0);
	}
	
	public SquareThing(String color, int length)
	{
		super(color);
		setLength(length);
	}
	
	public void setLength(int iLength)
	{
		length = iLength;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public double calculateArea()
	{
		return getLength()*getLength();
	}
	
	public String toString()
	{
		return super.toString() + " Length: " + getLength() + " Area: "+ calculateArea();
	}
}