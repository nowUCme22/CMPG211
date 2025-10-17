public class TestStaff
{
  public static void main(String[] args)
  {
    Staff f1 = new Staff();
    System.out.println("f1: "+f1);
    
    Staff f2 = new Staff("12345678","Plez","plez@gmail.com","Mrs");
    System.out.println("f2: "+f2);
    f2.setOffice("G3-G16");
    System.out.println("f2 after setting office: "+f2);
  }
}