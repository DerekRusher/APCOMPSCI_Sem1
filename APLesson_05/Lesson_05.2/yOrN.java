import java.util.Scanner;
public class yOrN
{
	static Scanner in;
	public static void main(String[]args)
	{
		in = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Would you like to do some recursion? ");
		String choice = in.next();
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
				System.out.println("Yay! Let's do some recursion!!!!");
			else
				System.out.println("Ya spoiled the fun, ya old geezer");
		}
		else
		{
			System.out.println("Please enter Y or N");
		recursion();
		}
	}
}