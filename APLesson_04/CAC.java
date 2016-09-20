import java.util.Scanner;

public class CAC
{
	public static void main(String[]args)
	{
		Scanner imput = new Scanner(System.in);
		CAC formatting = new CAC();
		
		System.out.println("What is your first name?");
		String word1 = imput.nextLine();
		System.out.println("What is your last name?");
		String word2 = imput.nextLine();
		System.out.println("What is your occupation?");
		String word3 = imput.nextLine();
		System.out.println("What is your place of work?");
		String word4 = imput.nextLine();
		System.out.println("What is the current year of your work?");
		String word5 = imput.nextLine();
		System.out.println("What is your subject of work?");
		String word6 = imput.nextLine();
		System.out.println("***********************************");
		formatting.format2(word4, word5);
		formatting.format(word1, word2);
		formatting.format(word3, word6);
		System.out.println("\n***********************************");
		
	}
	
	public void format(String word, String worddos)
	{
		System.out.printf("\n*%14s%18s *", word, worddos);
	}
	public void format2(String word, String worddos)
	{
		System.out.printf("*%14s%18s *", word, worddos);
	}
}