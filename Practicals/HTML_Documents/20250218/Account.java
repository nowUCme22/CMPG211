public class Account
{
  //variable
  private String accNumber;
  private int balance;
  
  //constructor
  public Account()
  {
	  setAccNumber("00000");
	  setBalance(0);
  }
  
  public Account(String aNo, int bal)
  {
	  setAccNumber(aNo);
	  setBalance(bal);
  }
  
  //set methods
  public void setAccNumber(String aNo)
  {
	  accNumber = aNo;
  }
  
  public void setBalance(int bal)
  {
	  balance = bal;
  }
  
  //get methods
  public String getAccNumber()
  {
	  return accNumber;
  }
  
  public int getBalance()
  {
	  return balance;
  }
  
  //toString methods
  public String toString()
  {
	  return "Account number: " + getAccNumber() + " Balance: " + getBalance();
  }
}