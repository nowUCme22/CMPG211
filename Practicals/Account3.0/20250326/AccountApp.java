import java.util.Arrays;

/**
@author Marne Vermaak
@version 20250325
*/
public class AccountApp
{
	public static final int MAX_NO_OBJECTS = 4;
	public static void main(String[] args)
	{
		//create an array of account objects
		Account[] accounts = new Account[MAX_NO_OBJECTS];
		
		int noOfAccounts = 0;
		//populate the array
		accounts[noOfAccounts++] = new SavingsAccount("104", 5000, 1000);
		accounts[noOfAccounts++] = new CreditAccount("102", -2000, 5000);
		accounts[noOfAccounts++] = new SavingsAccount("103", 3000, 2000);
		accounts[noOfAccounts++] = new CreditAccount("101", 1000, 3000);
		
		//display all the account objects with interests
		System.out.println("Accounts with Interest:");
		
        for (int i = 0; i< noOfAccounts; i++) 
		{
            System.out.println(accounts[i].toString() + " | Interest: R" + accounts[i].calculateInterest(5));
        }
		
		System.out.println("\nAfter Sort:");
		//sort the account objects by accNumber
		Arrays.sort(accounts,0,noOfAccounts);
		//Arrays.sort(accounts);
		
		for (int i = 0; i< MAX_NO_OBJECTS; i++) 
		{
            System.out.println(accounts[i]);
        }
		
	}
}
