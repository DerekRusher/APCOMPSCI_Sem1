import java.util.Scanner;

public class crashTestDummy
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please insert your paint color, interior type, engine type, and tire type");
		String pc = kb.nextLine();
		String it = kb.nextLine();
		String et = kb.nextLine();
		String tt = kb.nextLine();
		FixOrRepairDaily obj = new FixOrRepairDaily(pc, it, et, tt);
		System.out.println("Here are the specs of your new car: \nPaint: \t " + obj.getPaint() + "\nInterior: \t " + obj.getInterior() + "\nEngine: \t " + obj.getEngine() + "\nTires: \t " + obj.getTires());
	}
}