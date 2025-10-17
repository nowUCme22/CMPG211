/**
@author Marne Vermaak
@version 20250311
*/
public class CreditAccount extends Account
{
	private int overdraftLimit;
	
	public CreditAccount()
	{
		this("0000000000",0,0);
	}
	
	public CreditAccount(String accountNumber, int balance, int overdraftLimit)
	{
		super(accountNumber, balance);
		setOverdraftLimit(overdraftLimit);
	}
	
	public void setOverdraftLimit(int overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}
	
	public int getOverdraftLimit()
	{
		return overdraftLimit;
	}
	
	public int calculateInterest(int rate)
	{
		int interest = 0;
		if (getBalance() < getOverdraftLimit())
			interest = getBalance() * rate * 4/100;
		else if (getBalance() < 0 )
			interest = getBalance() * rate * 2/100;
		else
			interest = getBalance() * rate /100;
		return interest;
	}
		
	public String toString()
	{
		return super.toString() + " and overdraft limit "+getOverdraftLimit();
	}
}