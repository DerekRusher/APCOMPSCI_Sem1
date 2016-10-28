public class song
{
	public static void main(String[]args)
	{
		sing("Na ", 4);
		sing("Na ", 4);
		sing("Hey ", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String a, int b)
	{
		for(int i = 1; i <= b; i++)
		{
			System.out.print(a);
			if(i == b)
			{
				System.out.print("\n");
			}
		}
	}
}