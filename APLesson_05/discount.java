import java.util.Scanner;

public class discount
{
	static double d;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);		
		System.out.println("What was the first item you purchased?");
		String first = in.nextLine();
		System.out.println("What was the price of the first item you purchased?");
		double pFirst = in.nextDouble();
		in.nextLine();
		System.out.println("What was the second item you purchased?");
		String second = in.nextLine();
		System.out.println("What was the price of the second item you purchased?");
		double pSecond = in.nextDouble();
		in.nextLine();
		System.out.println("What was the third item you purchased?");
		String third = in.nextLine();
		System.out.println("What was the price of the third item you purchased?");
		double pThird = in.nextDouble();
		in.nextLine();
		System.out.println("What was the fourth item you purchased?");
		String fourth = in.nextLine();
		System.out.println("What was the price of the fourth item you purchased?");
		double pFourth = in.nextDouble();
		String sTitle = "Subtotal";
		double sTotal = pFirst + pSecond + pThird + pFourth;
		String dTitle = "Discount";
		discount(sTotal);
		double tax = d*.08;
		double total = sTotal - d + tax;
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(first, pFirst);
		format(second, pSecond);
		format(third, pThird);
		format(fourth, pFourth);
		format(sTitle, sTotal);
		format(dTitle, d);
		System.out.println("__________________________________");
		System.out.println("  Thank you for your business!!!  ");	
	}
	
	public static void discount(double a)
	{
		if(a >= 2000)
			d = a*.85;
		if(a < 2000)
			d = a;
	}
	
	public static void format(String one, double two)
	{
		System.out.printf("%17S ....... %5.2f\n", one, two);
	}
}