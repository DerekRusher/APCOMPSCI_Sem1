import java.util.Scanner;

public class seven
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		System.out.println("There are " + luck(in.nextInt()) + " occurences of 7");
		
	}
	
	public static int luck(int z)
	{
		if(z > 0)
		{
			if((z+3) % 10 == 0)
			{
				luck(z/10);
				System.out.println("hi");
				return 1;
			}
			else
			{
				luck(z/10);
				System.out.println("sup");
				return 0;
			}
		}
		else
			return 0;
	}
}