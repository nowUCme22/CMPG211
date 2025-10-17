import java.io.*;
/**
@author Marne Vermaak
@version 20250311
*/
public abstract class Account implements Interest
{
	private String accNumber;
	private int balance;
	
	//abstract class
	public abstract int calculateInterest(int rate);
	
	public Account()
	{
		this("00000000",0);
	}
	
	public Account(String accNo, int bal)
	{
		setAccNumber(accNo);
		setBalance(bal);
	}
	
	public void setAccNumber(String accNo)
	{
		accNumber = accNo;
	}
	
	public void setBalance(int bal)
	{
		balance = bal;
	}
	
	public String getAccNumber()
	{
		return accNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account number: " + getAccNumber() + " has balance of R" + getBalance();
	}
	
	public static void main(String[] args) 
	{
		/*Account ac1 = new Account();
		System.out.println("Account ac1: "+ac1);
		Account ac2 = new Account("12345678",500);
		System.out.println("Account ac2: "+ac2);*/
	}
}