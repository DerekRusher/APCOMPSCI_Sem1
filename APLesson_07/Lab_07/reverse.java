import java.util.Scanner;
public class reverse
{
	static int rev = 0;
	static int num = 0;
	static int val;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to be reversed: ");
		num = in.nextInt();	
		val = num;
		getReverse();
		System.out.println(val + " reversed is " + rev);
	}
	
	public static void getReverse()
	{
		while(num > 0)
		{
			rev = rev*10;
			rev = rev + (num % 10);
			rev = rev/10;
		}
	}
}