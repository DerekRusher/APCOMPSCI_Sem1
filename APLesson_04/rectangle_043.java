import java.util.Scanner;

public class rectangle_043
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of your rectangle?");
		l = input.nextDouble();
		System.out.println("What is the width of your rectangle?");
		w = input.nextDouble();
		calcPerim(l, w);
		print(p);
	}
	
	public static double calcPerim(double num1, double num2)
	{
		return p = num1 + num1 + num2 + num2;
	}
	
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}