/**
@author Marne Vermaak 48073253
@version 20250311
*/
public class TestThing
{
	public static void main(String[] args) 
	{
		Roundthing r1 = new Roundthing("Red",2);
		Roundthing r2 = new Roundthing("Yellow",8);
		Roundthing r3 = new Roundthing("Blue",12);
		
		SquareThing s1 = new SquareThing("Green", 32);
		SquareThing s2 = new SquareThing("Pink", 9);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		System.out.println(s1);
		System.out.println(s2);		
		
		r1.setRadius(4);
		s1.setLength(16);
		
		System.out.println(r1);
		System.out.println(s1);	
		
	}
}