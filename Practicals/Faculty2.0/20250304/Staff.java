/** 
This program is to manage Staff
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class Staff extends Person //extends Employee
{
	private String title;
	
	public Staff()
	{
		this("00000000","","");
	}
	
	public Staff(String id, String name, String email)
	{
		super(id,name,email);
		//setTitle(title);
	}
	
	public void setTitle(String sTitle)
	{
		title = sTitle;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String toString()
	{
		return super.toString() + " Title: " + getTitle();
	}
}