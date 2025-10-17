import java.util.Scanner;
public class Pro20250212B
{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
	 System.out.print("Please enter a integer: ");
	 //convert string to int
	 int val = Integer.parseInt(input.next()); // next read upto first whitespace
	 System.out.println("The value is " + val);
	 System.out.println("Two times "+ val +" is: " + val*2);
	 //use the Math class for calculations
	 System.out.println("The square root is: "+ Math.pow(val,0.5));
	 System.out.println("The square is: "+ Math.pow(val,2));
	 System.out.println("The square rot is also: "+ Math.sqrt(val));
   }
}