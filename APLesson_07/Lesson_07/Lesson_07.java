import java.util.Scanner;
public class Lesson_07
{
	static int number;
	static int digits = 0;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = in.nextInt();
		countDigits();
		System.out.println(number + " has " + digits + " digits.");
		//while(number > 0)
		//{
			//print the last digit on the right
			//System.out.println(number % 10);
			//dividing by 10 shaves off the last digit
			//number /= 10;
		//}
	}
	public static void countDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			num /=10;
		}
	}
}