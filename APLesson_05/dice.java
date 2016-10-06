public class dice
{
	static String winner;
	
	public static void main(String[]args)
	{
		int p = (int)(Math.random()*6 + 1);
		int c = (int)(Math.random()*6 + 1);
		
		rollDice(p,c);
		
		System.out.println("You rolled a " + p);
		System.out.println("The Computer rolled a " + c);
		System.out.println("The winner is " + winner);
	}
	
	public static void rollDice(int a, int b)
	{
		if(a > b)
			winner = "you!";
		if(a < b)
			winner = "the Computer...";
		if(a == b)
			winner = "no one, it was a tie...";
	}
}