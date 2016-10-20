import java.util.Scanner;
public class box
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = in.next();
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}