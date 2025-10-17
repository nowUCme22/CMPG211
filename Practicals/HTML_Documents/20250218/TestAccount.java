public class TestAccount
{
  public static void main(String[] args)
  {
     Account a1 = new Account();
	 System.out.println(a1);
	 
	 Account a2 = new Account("1254",5000);
	 System.out.println(a2);
	 
	 a1.setAccNumber("0123456");
	System.out.println("The account number of a1 is " + a1.getAccNumber());
  }
  
}