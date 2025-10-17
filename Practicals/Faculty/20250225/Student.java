/**
This class is to manage info on students
@author M. Vermaak
@version 20250225
*/
public class Student
{
	//variables
	private String id,name,status,email;
	
	//constructor
	/** 
	Constructor sets student id equal to "00000000" , name equal to "" , status equal to "" and email equal to ""
	*/
	public Student()
	{
		this("00000000","","");		
	}
	
	/**
		Constructor receives parameters for instance variables
		@param sId : Student's ID
		@param sName : the name of the students
		@param sEmail : the email of the students
		@param sStatus : the status of the students
    */
	public Student(String sId, String sName, String sEmail)
	{
		setId(sId);
		setName(sName);
		//setStatus(sStatus);
		setEmail(sEmail);
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
	
	public void setStatus(String sStatus)
	{
		status = sStatus;
	}
	
	public void setEmail(String sEmail)
	{
		email = sEmail;
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
		Returns the value of the instance variable status
		@return Value of the status
    */
	public String getStatus()
	{
		return status;
	}
	
	/**
		Returns the value of the instance variable email
		@return Value of the email
    */
	public String getEmail()
	{
		return email;
	}
	
	//toString
	public String toString()
	{
		return "Student Id: " + getId() + "\tStudent name: " + getName() + "\tStudent status: " + getStatus() + "\tStudent email: " +getEmail();
	}
	
}