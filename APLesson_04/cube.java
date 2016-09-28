import java.util.Scanner;

public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is the length of the side of the cube you wish to determine the Surface Area of?");
		side = in.nextDouble();
		calcSurf(side);
		print(side, sa);
	}
	
	public static void calcSurf(double one)
	{
		sa = one*one*6;
	}
	
	public static void print(double first, double second)
	{
		System.out.printf("The surface area of a cube with %f sides is %.5f", first, second);
	}
}