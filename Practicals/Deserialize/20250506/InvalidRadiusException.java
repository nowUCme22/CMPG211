//unchecked exception
public class InvalidRadiusException extends RuntimeException
{
	//why use this here and super there? 
	//answer: this refers to this class/object || super refers to the super class (RuntimeException)
	public InvalidRadiusException()
	{
		//this will invoke the constructor under to get a string parameter
		this("Invalid Radius");
	}
	
	public InvalidRadiusException(String m)
	{
		super(m);
	}
}