import java.util.Scanner;

public class rectPrismVolCalc 
{
	public static void main(String[]args)
	{
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Welcome to the Rectangular Prism Volume Calculator!");
		System.out.println("Please insert the length of one of your Rectangular Prism's sides: ");
		float sideOne = imput.nextFloat();
		System.out.println("Please insert the length of another one of your Rectangular Prism's sides: ");
		float sideTwo = imput.nextFloat();
		System.out.println("Please insert the length of the last side of your Rectangular Prism: ");
		float sideThree = imput.nextFloat();
		System.out.println("The Volume of your Rectangular Prisom is " + sideOne * sideTwo * sideThree);
	}
}