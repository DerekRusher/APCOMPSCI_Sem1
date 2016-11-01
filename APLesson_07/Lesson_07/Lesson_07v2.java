import java.util.Scanner;
public class Lesson_07v2
{
	static String sentence;
	//static int top = 0;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = in.nextLine();
		
		//while(top < sentence.length())
		//{
			//System.out.println(sentence.charAt(top));
			//top++;
		//}
		
		while(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + sentence.substring(sentence.indexOf(" ") +1);
		}
		
		System.out.println("Without spaces: " + sentence);
	}
}