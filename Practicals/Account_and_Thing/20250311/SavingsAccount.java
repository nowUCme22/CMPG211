/**
@author Marne Vermaak
@version 20250311
*/
public class SavingsAccount extends Account
{
	private int minimumBalance;
	
	public SavingsAccount()
	{
		this("0000000000",0,0);
	}
	
	public SavingsAccount(String accountNumber, int balance, int minimumBalance)
	{
		super(accountNumber, balance);
		setMinimumBalance(minimumBalance);		
	}
	
	public void setMinimumBalance(int minimumBalance)
	{
		this.minimumBalance = minimumBalance;
	}
	
	public int getMinimumBalance()
	{
		return minimumBalance;
	}
	
	public int calculateInterest(int rate)
	{
		if (getBalance() >= getMinimumBalance())
			return getBalance() * rate / 100;
		
		else
			return 0;
	}
	
	public String toString()
	{
		return super.toString()+" and minimum balance "+getMinimumBalance();
	}
}