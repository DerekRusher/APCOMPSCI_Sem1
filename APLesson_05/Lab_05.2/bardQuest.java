import java.util.Scanner;
public class bardQuest
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
		System.out.println("You are but a poor beggar on the outide of a castle. " +
							"\n There are stables nearby. " +
							"\n You think you wanted to talk to think King about something." +
							"\n You also remember feeling it was hopeless." +
							"\n Do you want to: " +
							"\n A: Go into the castle? or " +
							"\n B: Go into the horse stables outside?");
		a = in.next();					
		if(a.equals("A"))
		{
			System.out.println("You walk into the castle, and a guard ask who you are. " + 
								"\n Do you want to: " +
								"\n A: Claim you are a noble knight who asks only for counsil with the King? or " +
								"\n B: Stab him in the chest with the sword you have sheathed by your side");
			b = in.next();
			if(b.equals("A"))
			{
				System.out.println("You make your claim. " + 
									"\n He looks at your poor beggars clothes and says \"No you aren't. Get outta here\"" +
									"\n He takes out his sword " +
									"\n Do you want to: " +
									"\n A: Run away? or " +
									"\n B: Stab him in the chest with the sword you have sheathed by your side");
				c = in.next();
					if(c.equals("A"))
					{
					System.out.println("As you turn your around to sprint, he stabs you in the back. " + 
									"\n You have died!");
					}
					if(c.equals("B"))
					{
						System.out.println("You try to stab him, but your unsheathed sword simply clangs off his body armour. " + 
									"\n His sword was propely taken out of the sheath, and thus he stabs you" +
									"\n You have died!");
					}
				}
			if(b.equals("B"))
			{
				System.out.println("You try to stab him, but your unsheathed sword simply clangs off his body armour. " + 
									"\n He unsheaths his sword" +
									"\n Do you want to: " +
									"\n A: Run away? or " +
									"\n B: unsheath your sword and stab him?");
				d = in.next();
					if(d.equals("A"))
					{
					System.out.println("As you turn your around to sprint, he stabs you in the back. " + 
									"\n You have died!");
					}
					if(d.equals("B"))
					{
						System.out.println("You unsheath your sword, but in the time it takes to do that, he has already stabbed you. " + 
									"\n You have died!");
					}
				}
			}
		if(a.equals("B"))
		{
			System.out.println("You walk into the stables, and the manager asks who you are. " + 
								"\n Do you want to: " +
								"\n A: Claim you are a noble knight who asks only for a noble steed? or " +
								"\n B: Stab him in the chest with the sword you have sheathed by your side?");
			e = in.next();
			if(e.equals("A"))
			{
				
				System.out.println("You make your claim. " + 
									"\n He is too stupid to look at your poor beggars clothes and says \"Well, you got a Letter from the King for that?\"" +
									"\n He grabs his sword " +
									"\n Do you want to: " +
									"\n A: Run away with a horse? or " +
									"\n B: Stab him in the chest with the sword you have sheathed by your side?");
				f = in.next();
					if(f.equals("A"))
					{
					System.out.println("As you turn your around to sprint, he tries to stab you in the back, but misses. " + 
									"\n You hurdle the gate into the horse pen and saddle up." +
									"\n He is so fat that he can only see you riding into the sunset by the time he gets around to the pen.");
					}
					if(f.equals("B"))
					{
						System.out.println("You try to stab him, but your unsheathed sword simply clangs against his raised sword. " + 
									"\n His sword was propely taken out of the sheath, and thus he stabs you" +
									"\n You have died!");
					}
			}
			if(e.equals("B"))
			{
				System.out.println("You try to stab him, but your unsheathed sword barely scratches you. " + 
									"\n He picks up his (unsheathed) sword" +
									"\n Do you want to: " +
									"\n A: Run away? or " +
									"\n B: unsheath your sword and stab him?");
				g = in.next();
					if(g.equals("A"))
					{
					System.out.println("As you turn your around to sprint, he tries to stab you in the back, but misses. " + 
									"\n You return to the front of the castle, to walk home with nothing but your own shame!");
					}
					if(g.equals("B"))
					{
						System.out.println("You unsheath your sword, but in the time it takes to do that, he has already stabbed you. " + 
									"\n You have died!");
					}
			}
		}
	}
}
