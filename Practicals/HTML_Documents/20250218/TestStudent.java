public class TestStudent
{
  public static void main(String[] args)
  {
    Student s1 = new Student();
	System.out.println(s1);
	
	Student s2 = new Student("12345678", "John Doe");
	System.out.println(s2);
	
	s1.setName("Piet Pompies");
	System.out.println("The name of s1 is " + s1.getName());
	
  }
}