public class Pro20250212C
{
  public static void main(String[] stuff)
  {
    char c1 = 'A';
	char c2 = 'z';
	if (c1>c2)
		System.out.println(c1+ " is greater than "+ c2);
	else
		System.out.println(c1+ " is smaller than "+ c2 + " Why...?");
	
	int i3 = c1+10;
	char c3 = (char)(c1+10);//want the character at that int
	System.out.println("As an int c1 + 10 = " + i3);
	System.out.println("As a char c1 + 10 = "+c3);
  }
}