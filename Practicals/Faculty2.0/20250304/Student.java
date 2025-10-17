/** 
This program is to manage Students
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class Student extends Person
{
	private String status;
	
	public Student()
	{
		this("00000000","","");
	}
	
	public Student(String id, String name, String email)
	{
		super(id,name,email);
		//setStatus(status);
	}
	
	public void setStatus(String sStatus)
	{
		status = sStatus;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String toString()
	{
		return super.toString() + " Status: " + getStatus();
	}
	
	
}