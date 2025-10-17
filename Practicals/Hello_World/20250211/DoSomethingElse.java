public class DoSomethingElse
{
  public static void main(String args[])
  {
    int i1=32;
    int	i2 =11;
	int i3=7;
	double fp1= i1/10.0;
	double fp2 = i2/10.0;
	double fp3 = i3/10.0;
	double sum = fp1+fp2+fp3;
	
	if ((5-sum)!= 0.0)
	{
	  System.out.println("Something is wonky...");
      System.out.println("i1="+i1+" i2="+i2+" i3="+i3+" fp1="+fp1+" fp2="+fp2+" fp3="+fp3+" sum="+sum);	
	}
	else
	{
	  System.out.println("All is fine");
	}
  }
  
}