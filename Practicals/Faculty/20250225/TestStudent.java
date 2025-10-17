public class TestStudent
{
  public static void main(String[] args)
  {
    Student s1 = new Student();
    System.out.println("s1: "+s1);    
    
    Student s2 = new Student("12345678","Clever Clive","clever.clive@gmail.com");
    System.out.println("s2: "+s2);
    s2.setStatus("Senior");
    System.out.println("s2: "+s2);
  }
}