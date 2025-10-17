/**
@author Marne Vermaak 48073253
@version 20250311
*/
//abstract class
public abstract class Thing
{
	private String color;
	
	//abstract method
	public abstract double calculateArea();
	
	public Thing()
	{
		this("");
	}
	
	public Thing(String color)
	{
		this.setColor(color);
	}
	
	public void setColor(String sColor)
	{
		color = sColor;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String toString()
	{
		return "Color: " + getColor();
	}
}