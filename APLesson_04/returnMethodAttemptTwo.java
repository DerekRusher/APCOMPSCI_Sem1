import java.util.Scanner;

public class returnMethodAttemptTwo
{
	public static void main(String[]args)
	{
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ay bruv, give me a facta");
		double first = input.nextDouble();
		System.out.println("Yo matey, throw me somethin' tah multiply it by");
		double second = input.nextDouble();
		double sum = newMethod(first, second);
		System.out.println("Ya sum is " + sum);
	}
	
	public static double newMethod(double prima, double secunda)
	{
		return (prima*secunda);
	}
}