import java.util.Scanner;

public class average_043
{
	static double num1;
	static double num2;
	static double num3;
	static double a;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the first number to be averaged");
		num1 = in.nextDouble();
		System.out.println("Insert the second number to be averaged");
		num2 = in.nextDouble();
		System.out.println("Insert the third number to be averaged");
		num3 = in.nextDouble();
		average(num1, num2, num3);
		print(num1, num2, num3, a);
	}
	
	public static double average(double one, double two, double three)
	{
		return a = (one + two + three)/3.0;
	}
	
	public static void print(double first, double second, double third, double fourth)
	{
		System.out.printf("The average of %f, %f, and %f is %.5f", first, second, third, fourth);
	}
}