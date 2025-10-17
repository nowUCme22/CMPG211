/** 
This program is to manage Employee
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class Employee extends Person 
{
	private String office;
	
	public Employee()
	{
		this("00000000","","");
	}
	
	public Employee(String id, String name, String email)
	{
		super(id,name,email);
		//setOffice(office);
	}
	
	public void setOffice(String sOffice)
	{
		office = sOffice;
	}
    
	public String getOffice()
	{
		return office;
	}
	
	public String toString()
	{
		return super.toString() + " Office: " + getOffice();
	}
}