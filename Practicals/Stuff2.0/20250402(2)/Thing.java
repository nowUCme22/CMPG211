public abstract class Thing implements Talk, Comparable<Thing> //abstract class
{
   private String color;
   
   public Thing(String color)
   {
      setColor(color);
   }
   
   public Thing()
   {
      this("");
   }
   
   public void setColor(String color)
   {
      this.color = color;
   }
   
   public String getColor()
   {
      return color;
   }
   
   
   public String toString()
   {
      return "I am a "+getColor()+" thing";
   }
   
   //abstract method
   public abstract double getArea();
   
   //comparable methods
   public int compareTo(Thing other) //thing is my datatype, other is the variable
   {
	   if (getArea() < other.getArea())
		   return -1;
	   if (getArea() > other.getArea())
		   return 1;
	   return 0;
	   
	   //convert getArea to string
	   //return String.format("%5.1f",getArea()).compareTo(String.format("%5.1f",other.getArea()));
	   //first string and compare to second string
   }
}