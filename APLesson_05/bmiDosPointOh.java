import java.util.Scanner;

public class bmiDosPointOh
{
	public static void main(String[]args)
	{
		double BMI = 0;
		String c = "";
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Please insert your height in inches: ");
		double h = imput.nextDouble();
		System.out.println("Please insert your weight in pounds: ");
		double w = imput.nextDouble();
		double mW = (w * .45);
		double mH = (h * .025);
		double hTwo = (mH * mH);
		BMI = (mW / hTwo);
		System.out.println("Your BMI is " + BMI);
		
		if(BMI > 39.9)
			c = "Morbidly Obese";
		else if(BMI >= 35)
			c = "Very Obese";
		else if(BMI >= 29.9)
			c = "Obese";
		else if(BMI >= 25)
			c = "Overweight";
		else if(BMI >= 18.5)
			c = "Normal";
		else
			c = "Underweight";
			
		System.out.println("You are " + c);
	}
}