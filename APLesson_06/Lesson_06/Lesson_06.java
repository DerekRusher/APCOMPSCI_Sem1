import java.util.Scanner;
public class Lesson_06
{
	public static void main(String[]args)
	{
		//for(int i = 2; i <= 10; i+=2)
		//{
		//	System.out.print(i + " ");
		//}
		
		Scanner kb = new Scanner(System.in);
		
		//System.out.println("Please enter the amount of cookies: ");
		//int cookies = kb.nextInt();
		//int batch = 1;
		//for(int needed = cookies; needed > 0; needed-=25)
		//{
		//	System.out.println("Cookies Needed: " + needed);
		//	System.out.println("Batch #: " + batch);
		//	batch++;
		//}
		//System.out.println("Order Up!");
		
		//String word = "COMPSCI";
		//System.out.println(word.length());
		//System.out.println(word.indexOf("OMPS"/*-1*/));
		//System.out.println(word.substring(1, 4));
		//System.out.println(word.substring(2));
		//System.out.println(word.charAt(2-1));
		
		System.out.println("Please enter a word: ");
		String word = kb.next();
		
		//for(int i = 0; i < word.length(); i++)
		//{
		//	System.out.println(word.charAt(i));
		//}
		
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(0, i));
		}
	}
}