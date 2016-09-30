import java.util.Scanner;

public class circle
{
	static double r;
	static double a;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("What's the radius of the circle you wish to determine the area of?");
		r = in.nextDouble();
		calcArea(r);
		print(r,a);	
	}
	
	public static void calcArea(double one)
	{
		a = one*4.13;
	}
	
	public static void print(double first, double second)
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f", first, second);
	}
}