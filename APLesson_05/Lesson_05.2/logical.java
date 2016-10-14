import java.util.Scanner;
public class logical
{
	static Scanner in;
	public static void main(String[]args)
	{
		in = new Scanner(System.in);
		checkNum();
		
		//boolean a = false;
		//boolean b = false;
		
		//System.out.println(a && b);
		//System.out.println(a || b);
		//System.out.println(!(a && b));
	}
	public static void checkNum()
	{
		System.out.println("Pick a number between 1 and 10: ");
		int guess = in.nextInt();
		int num = (int)(Math.random()*10)+1;
		System.out.println("The number is " + num);
		if(guess >= 1 && guess <=10)
		{
			if(guess == num)
				System.out.println("The guess is right!");
			else
				System.out.println("Nope, guess again!");
		}
		else
		{
			System.out.println("Please go back to first grade, thanks.");
			checkNum();
		}
	}
}