import java.util.Scanner;
public class pw
{
	public static void main(String[]args)
	{
		String user = "Mark Thomas";
		String pw = "HS413";
		
		check(user, pw);
	}
	
	public static void check(String one, String two)
	{
		Scanner in = new Scanner;
		System.out.println("Please enter your username");
		String a = in.next();
		System.out.println("Please enter your password");
		String b = in.next();
		
		if(a.equals(one) && b.equals(two))
		{
			System.out.println("You're in!");
		}
		else if(a.equals(one))
		{
			System.out.println("IncorrectPW, please try again");
		}
	}
}