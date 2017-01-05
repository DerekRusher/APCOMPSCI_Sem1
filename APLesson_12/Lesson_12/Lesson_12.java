public class Lesson_12
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public Lesson_12()
	{
		//default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with Parameters
	public Lesson_12(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}