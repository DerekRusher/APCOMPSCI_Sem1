import java.util.Scanner;

public class returnMethodAttemptTwo_043
{
	static double s;
	
	public static void main(String[]args)
	{
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Oi bruv, throw me a facta");
		double first = input.nextDouble();
		System.out.println("Ay matey, 'it me wif sometin' tah multiplya by");
		double second = input.nextDouble();
		newMethod(first, second);
		System.out.println("Ya sum is " + s);
	}
	
	public static void newMethod(double prima, double secunda)
	{
		s = (prima*secunda);
	}
}