import java.util.Scanner;

public class count
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to count to: ");
		int a = in.nextInt();
		System.out.println("Please enter a number to count by: ");
		int b = in.nextInt();
		for(int i = b; i <= a; i+=b)
		{
			System.out.print(i + " ");
		}
	}
}