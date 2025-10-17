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
         radius=r;
   }
   
   public double getArea()
   {
      return (Math.PI*Math.pow(getRadius(),2));
   }
   
   public String tellAbout()
   {
	   return "I am a " + getColor() +" round thing and I can roll WHEE!!!";
   }
      
   public String toString()
   {
      return "I am a "+getColor()+" round thing with radius "+getRadius()+" and area "+getArea(); 
   }
  
   public static void main(String[] args) 
   {
      RoundThing rt1 = new RoundThing("Blue",10);
      System.out.println(rt1);
   }
}