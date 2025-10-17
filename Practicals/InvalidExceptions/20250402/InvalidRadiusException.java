public class InvalidRadiusException extends RunTimeException
{
	public InvalidRadiusException()
	{
		this("Radius is invalid");
	}
	
	public InvalidRadiusException(String m)
	{
		super(m);
	}
}
