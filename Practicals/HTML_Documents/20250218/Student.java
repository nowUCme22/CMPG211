/**
This class is to manage info on students
@author M. Vermaak
@version 20250219
*/

public class Student //class
{
	//variables
  private String name;
  private String studentNumber;
  
  //constructor
 /**
Constructor sets name equal to "" and student number to "00000000"
 */
  public Student()
  {
	this("00000000","");
  }
  
  /**
	Constructor receives parameters for instance variables
	@param sNo : University ID om students
	@param nm : the name of the students
  */
  public Student(String sNo, String nm)
  {
	  setName(nm);
	  setStudentNumber(sNo);
  }
  
  // set methods
  public void setName(String nm)
  {
	  name = nm;
  }
  
  public void setStudentNumber(String sNo)
  {
	  studentNumber = sNo;
  }
  
  //get methods
  /**
		Returns the value of the instance variable name
		@return Value of the name
  */
  public String getName()
  {
	  return name;
  }
  public String getStudentNumber()
  {
	  return studentNumber;
  }
  
  //override toString methods
  public String toString()
  {
	return "Student "+ getName() + " has number " + getStudentNumber();  
  }
  
  
}