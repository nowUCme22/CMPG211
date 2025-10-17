public class RoundThing extends Thing
{
   private int radius;
   
   public RoundThing(String color, int radius)
   {
      super(color);
      setRadius(radius);
   }
   
   public RoundThing()
   {
      this("",1);
   }
   
   public int getRadius()
   {
      return radius;
   }
   
   public void setRadius(int r)
   {
	   //check if r is bigger than 0, else throw an exception
	   if (r > 0) 
	   {
         radius=r;
	   }
	   else
	   {
		   //throw an exception
		   throw new InvalidRadiusException("Radius must be greater than 0, Radius = " +r);
	   }
   }
   
   public double getArea()
   {
      return (Math.PI*Math.pow(getRadius(),2));
   }
      
   public String toString()
   {
      return "I am a "+ getColor()+" round thing with radius "+getRadius()+" and area "+getArea(); 
   }
   
   public String tellAbout()
   {
      return "I am a " + getColor() + " round thing and I can roll. Wheeeee!";
   }
   
   public static void main(String[] args) 
   {
	   //make new roundthing and throw exception
	   RoundThing rt1 = new RoundThing();
	   try
	   {
			rt1 = new RoundThing("Blue",10);
	   }
	   catch(InvalidRadiusException e)
	   {
		    System.out.println("Problem!!!!!"+ e);
			System.exit(-1);
	   }
      System.out.println(rt1);
   }
}