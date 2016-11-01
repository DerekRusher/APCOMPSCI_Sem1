import java.util.Scanner;
public class quirk
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please write a sentance");
		String word = in.nextLine();
		while(word.indexOf("a")>0)
		{
			word = word.substring(0, word.indexOf("a")) + "@" + word.substring(word.indexOf("a") + 1);
		}
		System.out.println(word);
	}
}