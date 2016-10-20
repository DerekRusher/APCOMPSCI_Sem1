import java.util.Scanner;
public class reverseTriangle
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String w = in.next();
		for(int i = w.length(); i > 0; i--)
		{
			System.out.println(w.substring(0, i));
		}
	}
}