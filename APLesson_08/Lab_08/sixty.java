import java.util.Scanner;

public class sixty
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert a word: ");
		String one = in.next();
		int two = one.length();
		tree(one, 0, two); 
	}
	
	public static String tree(String a, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%20s\n", a.substring(0, start));
			return tree(a, start+1, stop);
		}
		return a;
	}
}