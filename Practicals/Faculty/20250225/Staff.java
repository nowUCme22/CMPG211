/**
This class is to manage info on staff
@author M. Vermaak
@version 20250225
*/
public class Staff
{
	//variables
	private String id,name,title,office,email;
	
	//constructor
	/**
	Constructor sets faculty Id to "00000000", name to "", email to "", title to ""
	*/
	public Staff()
	{
		this("00000000","","","");
	}
	
	/**
		Constructor receives parameters for instance variables
		@param sId : Staff ID
		@param sName : the name of the staff
		@param sEmail : the email of the staff
		@param sTitle : the title of the staff
    */
	public Staff(String sId, String sName, String sEmail, String sTitle)
	{
		setId(sId);
		setName(sName);
		setEmail(sEmail);
		setTitle(sTitle);
	}
	
	//set methods
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
	
	public void setTitle(String sTitle)
	{
		title = sTitle;
	}
	
	public void setOffice(String sOffice)
	{
		office = sOffice;
	}
	
	//get methods
	/**
		Returns the value of the instance variable id
		@return Value of the id
    */
	public String getId()
	{
		return id;
	}
	
	/**
		Returns the value of the instance variable name
		@return Value of the name
    */
	public String getName()
	{
		return name;
	}
	
	/**
		Returns the value of the instance variable title
		@return Value of the title
    */
	public String getTitle()
	{
		return title;
	}
	
	/**
		Returns the value of the instance variable email
		@return Value of the email
    */
	public String getEmail()
	{
		return email;
	}
	
	/**
		Returns the value of the instance variable office
		@return Value of the office
    */
	public String getOffice()
	{
		return office;
	}
	
	public String toString()
	{
		return "Staff Id: " + getId() + " Staff name: " + getName() + " Staff title: " + getTitle() + " Staff email: " +getEmail()+ " Staff office: " +getOffice();
	}
}