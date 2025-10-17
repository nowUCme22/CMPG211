public class RectangularThing extends SquareThing 
{
	private int width;
	
	public RectangularThing() 
	{}
	
	public RectangularThing(String color, int length, int width)
	{
		super(color, length);
		setWidth(width);
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public double getArea() // Fixed this error! Also in toString
	{
		return getWidth() * getLength();
	}

	public String toString()
	{
		return "I am a "+getColor()+" Rectangular thing with length "+getLength()+", width "+getWidth()+" and area "+getArea(); 
	}
	
	public String tellAbout()
	{
		return "I am a long flat "+getColor()+" rectangle";
	}
	
	public static void main(String[] args) 
	{
		RectangularThing rectangle1 = new RectangularThing("Green",10,5);
		System.out.println(rectangle1);
	}
}