import java.util.Scanner;

public class spaceShooter
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your target: ");
		int target = in.nextInt();
		int enemy = (int)(Math.random()*3 + 1);
		
		if (target == enemy)
			System.out.println("It's a hit!");
		else
			System.out.println("Keep Trying");
	}
}