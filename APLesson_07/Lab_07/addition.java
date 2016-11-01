import java.util.Scanner;
public class Addition
{
	static int sum = 0;
	static int num;
	static int val;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to add the digits of: ");
		num = in.nextInt();	
		val = num;
		while(num > 0)
		{
			sum = sum + (num % 10);
			num /= 10;
		}
		System.out.println("The sum of the digits in " + val + " is " + sum);
	}
}