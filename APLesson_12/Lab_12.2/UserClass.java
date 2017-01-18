import java.util.Scanner;
public class UserClass
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String AVATAR = "Undefined";
		System.out.println("Please enter a First and Last Name: ");
		String fName = kb.next();
		String lName = kb.next();
		System.out.println("Would you like to use a public avatar? (y for yes, anything else for no)");
		String select = kb.next();
		if(select.equals("y"))
		{
			System.out.println("Please enter your Avatar: ");
			AVATAR = kb.next();
		}
		else
		{
			System.out.print("");
		}
		User pH = new User(fName, lName);
		System.out.println(pH);
		System.out.println();
		User pH2 = new User(fName, lName, AVATAR);
		System.out.println(pH2);
	}
}