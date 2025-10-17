/**
@author Marne Vermaak 48073253
@version 20250311
*/
public class Roundthing extends Thing
{
	private int radius;
	
	public Roundthing()
	{
		this("",0);
	}
	
	public Roundthing(String color, int radius)
	{
		super(color);
		setRadius(radius);
	}
	
	public void setRadius(int iRadius)
	{
		radius = iRadius;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public double calculateArea()
	{
		return (Math.PI * getRadius()*getRadius());
	}
	
	public String toString()
	{
		return super.toString() + " Radius: " + getRadius() + " Area: " + calculateArea() ;
	}
}