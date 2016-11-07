import java.util.Scanner;
public class countDigits
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		System.out.println(countDigits(in.nextInt()));
	}
	
	public static int countDigits(int num)
	{
		while(num > 0)
		{
			return 1 + (countDigits(num/10));
		}
		return 0;
	}
}