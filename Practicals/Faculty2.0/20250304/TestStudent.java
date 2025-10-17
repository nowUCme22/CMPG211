/** 
This program is to test Student
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class TestStudent
{
	public static void main(String[] args)
	{
        Student s1 = new Student();
		System.out.print("Student 1: " + s1);
		
		Student s2 = new Student("12345678","John Doe","john.doe@gmail.com");
		s2.setStatus("Senior");
		System.out.print("\nStudent 2: " + s2);
	}
	
}