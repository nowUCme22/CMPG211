/** 
This program is to manage Faculty
@author Marne Vermaak 48073253
@version 2025/03/04
*/
public class Faculty extends Person //extends Employee
{
	private String rank;
	
	public Faculty()
	{
		this("00000000","","");
	}
	
	public Faculty(String id, String name, String email)
	{
		super(id,name,email);
		//setRank(rank);
	}
	
	public void setRank(String sRank)
	{
		rank = sRank;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String toString()
	{
		return super.toString() + " Rank: " + getRank();
	}
}