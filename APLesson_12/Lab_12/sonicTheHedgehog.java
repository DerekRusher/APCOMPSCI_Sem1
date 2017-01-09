import java.util.Scanner;
public class sonicTheHedgehog
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter how many hours you travelled: ");
		double hr = kb.nextDouble();
		System.out.println("Please enter how many minutes you travelled: ");
		double min = kb.nextDouble();
		System.out.println("Please enter how many miles you travelled: ");
		double mi = kb.nextDouble();
		
		tailsTheFox obj = new tailsTheFox(mi, hr, min);
		
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
	
		obj.setValues(mi, hr, min);
	
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
	}
}