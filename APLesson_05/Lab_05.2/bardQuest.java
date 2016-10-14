import java.util.Scanner;
public class bardQuest
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("You are but a poor beggar on the outide of a castle. " +
							"\nThere are stables nearby. " +
							"\nYou think you wanted to talk to think King about something." +
							"\nYou also remember feeling it was hopeless." +
							"\nDo you want to: " +
							"\nA: Go into the castle? or " +
							"\nB: Go into the horse stables outside?");
		String a = in.next();					
		if(a == "A")
		{
			System.out.println("You walk into the castle, and a guard ask who you are. " + 
								"\nDo you want to: " +
								"\nA: Claim you are a noble knight who asks only for counsil with the King? or " +
								"\nB: Stab him in the chest with the sword you have sheathed by your side");
			String b = in.next();
			if(b == "A")
			{
				System.out.println("You make your claim. " + 
									"\nHe looks at your poor beggars clothes and says \"No you aren't. Get outta here\"" +
									"\nHe takes out his sword " +
									"\nDo you want to: " +
									"\nA: Run away? or " +
									"\nB: Stab him in the chest with the sword you have sheathed by your side");
				String c = in.next();
					if(c == "A")
					{
					System.out.println("As you turn your around to sprint, he stabs you in the back. " + 
									"\nYou have died!");
					}
					if(c == "B")
					{
						System.out.println("You try to stab him, but your unsheathed sword simply clangs off his body armour. " + 
									"\nHis sword was propely taken out of the sheath, and thus he stabs you" +
									"\nYou have died!");
					}
					else
					{
						System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
					}
				}
			if(b == "B")
			{
				System.out.println("You try to stab him, but your unsheathed sword simply clangs off his body armour. " + 
									"\nHe unsheaths his sword" +
									"\nDo you want to: " +
									"\nA: Run away? or " +
									"\nB: unsheath your sword and stab him?");
				String d = in.next();
					if(d == "A")
					{
					System.out.println("As you turn your around to sprint, he stabs you in the back. " + 
									"\nYou have died!");
					}
					if(d == "B")
					{
						System.out.println("You unsheath your sword, but in the time it takes to do that, he has already stabbed you. " + 
									"\nYou have died!");
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
		if(a == "B")
		{
			System.out.println("You walk into the stables, and the manager asks who you are. " + 
								"\nDo you want to: " +
								"\nA: Claim you are a noble knight who asks only for a noble steed? or " +
								"\nB: Stab him in the chest with the sword you have sheathed by your side");
			String e = in.next();
			if(e == "A")
			{
				System.out.println("You make your claim. " + 
									"\nHe is too stupid to look at your poor beggars clothes and says \"Well, you got a Letter from the King for that?\"" +
									"\nHe grabs his sword " +
									"\nDo you want to: " +
									"\nA: Run away with a horse? or " +
									"\nB: Stab him in the chest with the sword you have sheathed by your side");
				String f = in.next();
					if(f == "A")
					{
					System.out.println("As you turn your around to sprint, he tries to stab you in the back, but misses. " + 
									"\nYou hurdle the gate into the horse pen and saddle up."
									"\nHe is so fat that he can only see you riding into the sunset by the time he gets around to the pen.");
					}
					if(f == "B")
					{
						System.out.println("You try to stab him, but your unsheathed sword simply clangs against his raised sword. " + 
									"\nHis sword was propely taken out of the sheath, and thus he stabs you" +
									"\nYou have died!");
					}
					else
					{
						System.out.println("Shoulda put \"A\" or \"B\" ya buzzkill....");
					}
				}
			if(e == "B")
			{
				System.out.println("You try to stab him, but your unsheathed sword barely scratches you. " + 
									"\nHe picks up his (unsheathed) sword" +
									"\nDo you want to: " +
									"\nA: Run away? or " +
									"\nB: unsheath your sword and stab him?");
				String g = in.next();
					if(g == "A")
					{
					System.out.println("As you turn your around to sprint, he tries to stab you in the back, but misses. " + 
									"\nYou return to the front of the castle, to walk home with nothing but your own shame!");
					}
					if(g == "B")
					{
						System.out.println("You unsheath your sword, but in the time it takes to do that, he has already stabbed you. " + 
									"\nYou have died!");
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