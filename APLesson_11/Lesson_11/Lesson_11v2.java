public class Lesson_11v2
{
	public static void main(String[]args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String [][] randletters = new String [4][4];
		
		// randletters[0][0] = "a";
		// randletters[1][1] = "b";
		// randletters[2][2] = "c";
		// randletters[3][3] = "d";
		
		int spot = 0;
		for(int i = 0; i < randletters.length; i++)
		{
			for(int j = 0; j < randletters[i].length; j++)
			{
				randletters[j][i] = letters.substring(spot, spot + 1);
				spot++;
			}
		}
		
		for(int i = 0; i < randletters.length; i++)
		{
			for(int j = 0; j < randletters[i].length; j++)
			{
				System.out.print(randletters[i][j] + "\t");
			}
			System.out.println();
		}
	}
}