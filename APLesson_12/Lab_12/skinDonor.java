import java.util.Scanner;
public class skinDonor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x and y values for two points: ");
		int xO = kb.nextInt();
		int yO = kb.nextInt();
		int xT = kb.nextInt();
		int yT = kb.nextInt();
		
		burnVictim obj = new burnVictim(xO, yO, xT, yT);
		
		System.out.println("distance = " + obj.getDist());
		
		obj.setValues();
		
		System.out.println("distance = " + obj.getDist());
	}
}