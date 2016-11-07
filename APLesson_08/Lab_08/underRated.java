import java.util.Scanner;

public class underRated
{
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert a sentence: ");
		System.out.println(replace(in.nextLine()));
		
	}
	
	public static String replace(String a)
	{
		while(a.indexOf(" ") >= 0)
		{
			a = (a.substring(0, a.indexOf(" ")) + "_" + a.substring(a.indexOf(" ") + 1));
			replace(a);
		}
		return a;
	}
}