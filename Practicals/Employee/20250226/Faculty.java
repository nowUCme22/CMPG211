public class Faculty extends Employee // to use the employee class in the faculty class
{
	private String rank;
	
	//default constructor
	public Faculty()
	{
		this("00000000","","");
	}
	
	//constructor
	public Faculty(String id, String name, String rank)//id and name is in the class employee 
	{
		super(id,name); //from employee class  super beteken net hy kry dit but die employee class... en jy hoef nie heeltyd te se setId en setName nie
		setRank(rank);
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String toString()
	{
		return super.toString() + " Rank: " + getRank();//use the toString from thSe super class (employees)
	}
	
}