public class TestAccounts
{
	public static void main(String[] args) 
	{
		Account c1 = new CreditAccount("1111111111",-1000,-500000);
		Account c2 = new CreditAccount("2222222222",-1250000,-500000);
		Account c3 = new CreditAccount("3333333333",1000,-500000);
		Account s1 = new SavingsAccount("4444444444", 10000,500);
		Account s2 = new SavingsAccount("5555555555", 100,500);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(s1 + " Interest: "+ s1.calculateInterest(10));
		System.out.println(s2 + " Interest: "+ s1.calculateInterest(15));		
	}
}