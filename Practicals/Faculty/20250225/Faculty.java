/**
This class is to manage info on faculty
@author M. Vermaak
@version 20250225
*/
public class Faculty
{
	//variables
	private String id,name,rank,office,email;
	
	//constructor
	/**
	Constructor sets faculty Id to "00000000", name to "", rank to "", email to ""
	*/
	public Faculty()
	{
		this("00000000","","","");
	}
	
	/**
		Constructor receives parameters for instance variables
		@param fId : Faculty ID
		@param fName : the name of the faculty
		@param fEmail : the email of the faculty
		@param fRank : the status of the faculty
    */
	public Faculty(String fId, String fName, String fEmail, String fRank)
	{
		setId(fId);
		setName(fName);
		setRank(fRank);
		setEmail(fEmail);
	}
	
	//set methods
	public void setId(String fId)
	{
		id = fId;
	}
	
	public void setName(String fName)
	{
		name = fName;
	}
	
	public void setRank(String fRank)
	{
		rank = fRank;
	}
	
	public void setEmail(String fEmail)
	{
		email = fEmail;
	}
	
	public void setOffice(String fOffice)
	{
		office = fOffice;
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
		Returns the value of the instance variable rank
		@return Value of the rank
    */
	public String getRank()
	{
		return rank;
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
		return "Faculty Id: " + getId() + " Faculty name: " + getName() + " Faculty rank: " + getRank() + " Faculty email: " +getEmail()+ " Faculty office: " +getOffice();
	}
	
	
	
	
}