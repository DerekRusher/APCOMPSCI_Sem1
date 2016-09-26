import java.util.Scanner;

public class interest
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
	
		interest classThree = new interest();
		
		System.out.println("What is the interest rate?");
		double interestNonClass = input.nextDouble();
		System.out.println("What is the amount wished to be borrowed?");
		double principle = input.nextDouble();
		System.out.println("How many times is the loan compounded per year?");
		double number = input.nextDouble();
		System.out.println("How many years is the length of the loan?");
		double time = input.nextDouble();
		
		double finalOutcome = classThree.classTwo(interestNonClass, principle, number, time);
		System.out.printf("Your total monthly payment is %5.2f\n", finalOutcome);
	}
	
	public double classTwo(double interestNonClass, double principle, double number, double time)
	{
		double fraction = interestNonClass/number;
		double inside = fraction + 1;
		double exponent = number*time;
		double withoutPrinciple = Math.pow(inside, exponent);
		double yearly = withoutPrinciple*principle;
		double base = yearly/(time*12);
		
		return base;
	}
}
	//public void exponent()