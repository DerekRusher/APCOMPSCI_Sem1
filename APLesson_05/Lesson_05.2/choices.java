import java.util.Scanner;
public class choices
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Do a Math Problem" +
							"\n 2. Answer a question");
		int mathOrWords = in.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("What is 2 X 2");
			int mathAnswer = in.nextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct!");
			}
			else
				System.out.println("Nope!");
		}
		else if(mathOrWords == 2)
		{
			System.out.println("Who said the phrase \"Whatever you are, be a good one.\"?");
			in.nextLine();
			String wordAnswer = in.nextLine();
			if(wordAnswer.equals("Abraham Lincoln"))
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Nope!");
			}
		}
		else
		{
			System.out.println("You're a cheater!!!!!!");
		}
		//int num = 3;
		
		//if(num > 4)
		//{
		//	System.out.println("It meets one of the conditions.");
		//	if(num <= 10)
		//	{
		//		System.out.println("It meets the two conditions.");
		//	}
		//}
		//else
		//{
		//	System.out.println("It meets none of the conditions.");
		//}
	}
}
