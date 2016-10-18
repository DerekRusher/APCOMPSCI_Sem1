import java.util.Scanner;
public class bardQuestTwo
{
	static String a;
	static String b;
	static String c;
	static String d;
	static String e;
	static String f;
	static String g;
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("You are but a poor beggar on the outide of a castle.");
		a = in.next();					
		if(a.equals("A"))
		{
			System.out.println("You walk into the castle, and a guard ask who you are.");
			b = in.next();
			if(b.equals("A"))
			{
				System.out.println("You make your claim.");
				c = in.next();
					if(c.equals("A"))
					{
					System.out.println("You have died!");
					}
					if(c.equals("B"))
					{
						System.out.println("You have died!");
					}
					else
					{
						System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
					}
				}
			if(b.equals("B"))
			{
				System.out.println("You try to stab him, but your unsheathed sword simply clangs off his body armour. ");
				d = in.next();
					if(d.equals("A"))
					{
					System.out.println("You have died!");
					}
					if(d.equals("B"))
					{
						System.out.println("You have died!");
					}
					else
					{
						System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
					}
				}
			}
			else
			{
				System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
			}
		}
		if(a.equals("B"))
		{
			System.out.println("You walk into the stables, and the manager asks who you are.");
			e = in.next();
			if(e.equals("A"))
			{
				System.out.println("You make your claim.");
				f = in.next();
					if(f.equals("A"))
					{
					System.out.println("As you turn your around to sprint, he tries to stab you in the back, but misses. ");
					}
					if(f.equals("B"))
					{
						System.out.println("You try to stab him, but your unsheathed sword simply clangs against his raised sword. ");
					}
					else
					{
						System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
					}
				}
			if(e.equals("B"))
			{
				System.out.println("You try to stab him, but your unsheathed sword barely scratches you.");
				g = in.next();
					if(g.equals("A"))
					{
					System.out.println("You return to the front of the castle, to walk home with nothing but your own shame!");
					}
					if(g.equals("B"))
					{
						System.out.println("You have died!");
					}
					else
					{
						System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
					}
				}
			}
			else
			{
				System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
			}
		}
		else
		{
			System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
		}
	}
}