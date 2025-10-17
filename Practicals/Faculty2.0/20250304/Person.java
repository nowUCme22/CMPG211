/** 
This program is to manage Persons
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class Person
{
	private String id,name,email;
	
	public Person()
	{
		this("00000000","","");
	}
	
	public Person(String id, String name, String email)
	{
		setId(id);
		setName(name);
		setEmail(email);
		
	}
	
	public void setId(String sId)
	{
		id = sId;
	}
	
	public void setName(String sName)
	{
		name = sName;
	}
	
	public void setEmail(String sEmail)
	{
		email = sEmail;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String toString()
	{
		return "Is: " + getId() + " Name: " + getName() + " Email: " + getEmail();
	}
}