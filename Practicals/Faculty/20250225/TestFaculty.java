public class TestFaculty
{
  public static void main(String[] args)
  {
    Faculty f1 = new Faculty();
    System.out.println("f1: "+f1);
    
    Faculty f2 = new Faculty("12345678","Clever Clive","clever.clive@gmail.com","Lecturer");
    System.out.println("f2: "+f2);
    f2.setOffice("G3-G16");
    System.out.println("f2 after setting office: "+f2);
  }
}