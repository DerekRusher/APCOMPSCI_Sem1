import java.util.Scanner;

public class leftTriangle
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word to manipulate: ");
		String a = in.next();
		for(int i = a.length(); i >= 1; i--)
		{
			System.out.println(a.substring(0, i));
		}
	}
}