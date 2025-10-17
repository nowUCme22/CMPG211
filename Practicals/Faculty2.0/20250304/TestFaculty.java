/** 
This program is to test Faculty
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class TestFaculty
{
	public static void main(String[] args)
	{
        Faculty f1 = new Faculty();
		System.out.print("Faculty 1: " + f1);
		
		Faculty f2 = new Faculty("12345678","John Doe","john.doe@gmail.com");
		f2.setRank("Professor");
		System.out.print("\nFaculty 2: " + f2);
	}
	
}