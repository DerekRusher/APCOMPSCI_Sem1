import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please insert a number: ");
		int f = in.nextInt();
		for(int i = 1; i <= f; i++)
		{
			System.out.println(i*f);
		}
	}
}