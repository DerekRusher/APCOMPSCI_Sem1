import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Welcome to the BMI Calculator!");
		System.out.println("Please insert your height in inches: ");
		double height = imput.nextDouble();
		System.out.println("Please insert your weight in pounds: ");
		double weight = imput.nextDouble();
		double metricW = (weight * .45);
		double metricH = (height * .025);
		double hTwo = (metricH * metricH);
		double BMI = (metricW / hTwo);
		System.out.println("Your BMI is " + BMI);
	}
}