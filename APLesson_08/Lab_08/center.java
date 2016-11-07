import java.util.Scanner;

public class center
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 3 words: ");
		String a = in.next();
		String b = in.next();
		String c = in.next();
		System.out.println(centering(a));
		System.out.println(centering(b));
		System.out.println(centering(c));		
	}
	
	public static String centering(String z)
	{
		while(z.length()<20)
		{
			z = (" " + z + " ");
			centering(z);
		}
		return z;
	}
}