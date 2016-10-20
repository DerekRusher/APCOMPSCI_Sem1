import java.util.Scanner;
public class table
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num1 = in.nextInt();
		System.out.println("how long is the table?: ");
		int num2 = in.nextInt();
		//System.out.println(" x | y ")
		System.out.println("_x_|_y_");
		for(int i = 1; i <= num2; i++)
		{
			System.out.printf(" %d | %d \n", i, i*num1);
		}
		System.out.printf(" x | x%d", num1);
	}
}