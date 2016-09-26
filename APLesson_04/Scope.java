import java.util.Scanner;

public class Scope 
{
	static String var1 = "your numbers are... ";
	static int var2;
	static double var3 ;
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		//int var2 = 47;
		//System.out.println(var3);
		System.out.println("Please enter an integer:");
		var2 = input.nextInt();
		System.out.println("Please enter a double:");
		var3 = input.nextDouble();
		method1();
	}
	
	public static void method1()
	{
		//double var3 = 89.1;
		System.out.println(var1 + var2 + " and " + var3 + ".");
	}
}