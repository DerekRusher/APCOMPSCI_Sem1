import java.util.Scanner;
public class reverse
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
			words[i] = in.next();
		
		System.out.print("\nIn order the words are: ");
		for(String word : words)
			System.out.print(word + " ");
		
		System.out.print("\nReversed the words are: ");
		for(int i = words.length -1; i >= 0; i--)
			System.out.print(words[i] + " ");
	}
}