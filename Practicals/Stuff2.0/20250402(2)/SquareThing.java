public class SquareThing extends Thing
{
   private int length;
   
   public SquareThing(String color, int length)
   {
      super(color);
      setLength(length);
   }
   
   public SquareThing()
   {
      this("",1);
   }
   
   public void setLength(int length)
   {
      this.length=length;         
   }

   
   public double getArea()
   {
      return Math.pow(getLength(),2);
   }

         
   public int getLength()
   {
      return length;
   }
   
   public String tellAbout()
   {
	   return "I am a " + getColor() +" grumpy old square";
   }
      
   public String toString()
   {
      return "I am a "+getColor()+" Square thing with sides "+getLength()+" units long and area "+getArea(); 
   }
      
   public static void main(String[] args) 
   {
      SquareThing block = new SquareThing("Green",10);
      System.out.println(block);
   }
}