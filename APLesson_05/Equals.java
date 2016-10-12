import java.util.Scanner;

public class Equals
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word1 = in.next();
		String word2 = in.next();
		if(word1.equals(word2))
			System.out.println("The words are equal!");
		else
			System.out.println("The words are not equal!");
	}
}