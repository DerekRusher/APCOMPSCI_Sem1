import java.util.Scanner;
public class youtubeCommentsSection
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
		
		for(String word : words)
			System.out.println(word.substring(0,1));
	}
}