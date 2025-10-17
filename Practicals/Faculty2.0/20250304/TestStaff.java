/** 
This program is to test Staff
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class TestStaff
{
	public static void main(String[] args)
	{
        Staff s1 = new Staff();
		System.out.print("Staff 1: " + s1);
		
		Staff s2 = new Staff("12345678","John Doe","john.doe@gmail.com");
		s2.setTitle("Mr");
		System.out.print("\nStaff 2: " + s2);
	}
	
}