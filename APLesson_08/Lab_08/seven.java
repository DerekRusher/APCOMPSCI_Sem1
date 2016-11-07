import java.util.Scanner;

public class seven
{
	static int num;
	
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
				num++;
				luck(z/10);
				return num;
			}
			else
			{
				luck(z/10);
				return num;
			}
		}
		else
			return num;
	}
}