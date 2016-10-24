import java.util.Scanner;

public class rightTraingle
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word to manipulate: ");
		String a = in.next();
		for(int i = a.length() - 1; i >= 1; i--)
		{
			System.out.println(a.substring(i));
		}
	}
}