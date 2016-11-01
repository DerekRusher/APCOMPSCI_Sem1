import java.util.Scanner;
public class average
{
	static int digits = 0;
	static int average = 0;
	static int num;
	static int val;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to average the digits of: ");
		num = in.nextInt();	
		val = num;
		while(num > 0)
		{
			average = average + (num % 10);
			num /= 10;
			digits++;
		}
		average = average / digits;
		
		System.out.println("The average of the digits in " + val + " is " + average);
	}
}