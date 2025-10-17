import java.io.*;
public abstract class Thing implements Talk, Comparable<Thing>, Serializable
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
   
/* Using the compareTo method of the STring class
   public int compareTo(Thing other)
   {
      return String.format("%5.1f",getArea()).compareTo(String.format("%5.1f",other.getArea()));
   }
*/

//Doing our own comparison - check the API documentation gor compareTo in Comparable.
   public int compareTo(Thing other)
   {
      if (getArea() < other.getArea())
         return -1;
      if (getArea() > other.getArea())
         return 1;
      return 0;
   }
   
   public String toString()
   {
      return "I am a "+getColor()+" thing";
   }
   
   public abstract double getArea();
   
}
