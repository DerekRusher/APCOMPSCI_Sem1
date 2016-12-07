import java.util.Scanner;
public class destiny
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int nums[][] = new int [4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random()*100) + 1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Please enter a number: ");
		
		int divide = kb.nextInt();
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divide == 0)
					count++;
			}
		}
		
		System.out.println("There are " + count + " numbers divisible by " + divide + " in the Array");
	}
}