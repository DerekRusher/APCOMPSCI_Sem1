import java.util.Scanner;
public class reverse
{
	static int rev = 0;
	static int num;
	static int val;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to be reversed: ");
		num = in.nextInt();	
		val = num;
		getReverse();
		System.out.println(num + " reversed is " + rev);
	}
	
	public static void getReverse()
	{
		while(val > 0)
		{
			rev *= 10;
			rev += (val % 10);
			val = val/10;
		}
	}
}