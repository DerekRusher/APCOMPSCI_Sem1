import java.util.Scanner;

public class subwoofer
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		subwoofer mathmatics = new subwoofer();
		
		System.out.println("What is the height of the subwoofer? (in inches)");
		double h = input.nextDouble();
		System.out.println("What is the length of the subwoofer? (in inches)");
		double l = input.nextDouble();
		System.out.println("What is the width of the subwoofer? (in inches");
		double w = input.nextDouble();
		
		mathmatics.calcVol(h, l, w);
	}
	
	public void calcVol(double H, double L, double W){
		System.out.println("The volume of your subwoofer is " + H*L*W/1728 + " cubic inches");
	}
}