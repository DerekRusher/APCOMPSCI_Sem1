import java.util.Scanner;

public class Stalker
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hair, eyes, and skin of the individual: ");
		String hc = kb.nextLine();
		String ec = kb.nextLine();
		String sc = kb.nextLine();		
		FBIDatabase obj = new FBIDatabase(hc, ec, sc);
		System.out.println("My info: \nHair: \t " + obj.getHair() + "\nEyes: \t " + obj.getEyes() + "\nSkin: \t " + obj.getSkin());
		System.out.println("Please enter the hair, eyes, and skin of the individual: ");
		hc = kb.nextLine();
		ec = kb.nextLine();
		sc = kb.nextLine();
		obj.setDatabase(hc, ec, sc);
		System.out.println("My Friend's info: \nHair: \t " + obj.getHair() + "\nEyes: \t " + obj.getEyes() + "\nSkin: \t " + obj.getSkin());
	}
}