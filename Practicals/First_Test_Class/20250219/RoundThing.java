public class RoundThing
{
	//variables
	private String color;
	private int radius;
	
	//constructor
	public RoundThing()
	{
		this("",0);
	}
	
	public RoundThing(String color, int radius)
	{
		setColor(color);
		setRadius(radius);
	}
	
	//set methods
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	//get methods
	public String getColor(String color)
	{
		return color;
	}
	
	public int getRadius(int radius)
	{
		return radius;
	}
	
	//toString methods
	public String toString()
    {
	   return "Color: "+ getColor() +" Radius: " + getRadius();  
    }
	
}