import java.util.Scanner;
public class pW
{
	public static void main(String[]args)
	{
		String user = "Mark Thomas";
		String pw = "HS413";
		
		check(user, pw);
	}
	
	public static void check(String one, String two)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your username");
		String a = in.nextLine();
		System.out.println("Please enter your password");
		String b = in.nextLine();
		
		if(a.equals(one) && b.equals(two))
		{
			System.out.println("You're in!");
		}
		else if(a.equals(one))
		{
			System.out.println("Incorrect password, please try again");
			check(one, two);
		}
		else if(b.equals(two))
		{
			System.out.println("Incorrect username, please try again");
			check(one, two);
		}
		else
		{
			System.out.println("Incorrect username and password, please try again");
			check(one, two);
		}
		
	}
}