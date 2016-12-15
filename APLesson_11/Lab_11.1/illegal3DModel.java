import java.util.Scanner;
public class illegal3DModel
{
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String clip [];
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String [clipSize];
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: (R for reload S for shoot)");
			String action = kb.next();
			if(action.equals("R"))
				reload();
			if(action.equals("S"))
				System.out.println(shoot());
			System.out.println(printClip());
		}
		System.out.println("Out of Bullets!!!");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
			clip [i] = "[]";
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "BOOM!!!";
		}
		else
			return "RELOAD!!!";
	}
	public static void reload()
	{
		if(bulletCount >= clipSize)
		{
			bulletCount -= clipSize;
			shotCount = clipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
			clip[i] = " * ";
	}
	public static String printClip()
	{
		String output = "";
		output += "Bullets: \t" + bulletCount + "\n Clip: \t ";
		for(int i = 0; i < clipSize; i++)
			output += clip[i];
		
		return output;
	}
}