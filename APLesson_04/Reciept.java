import java.util.Scanner;

public class Reciept
{
	public static void main(String[]args)
	{
		Scanner imput = new Scanner(System.in);
		
		System.out.println("What was the first item you ordered?");
		
		Reciept formatting = new Reciept();
		
		String item1 = imput.nextLine();
		System.out.println("How much was it?");
		double price1 = imput.nextDouble();
		imput.nextLine();
		
		System.out.println("What was the second item you ordered?");
		String item2 = imput.nextLine();
		System.out.println("How much was it?");
		double price2 = imput.nextDouble();
		imput.nextLine();
		
		System.out.println("What was the third item you ordered?");
		String item3 = imput.nextLine();
		System.out.println("How much was it?");
		double price3 = imput.nextDouble();
		imput.nextLine();
		
		String item4 = ("Subtotal");
		double price4 = (price1 + price2 + price3);
		
		String item5 = ("Tax");
		double price5 = (price4*.08);	
		
		String item6 = ("Total");
		double price6 = (price4+price5);		
		
		System.out.println("<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		formatting.format(item1, price1);
		formatting.format(item2, price2);
		formatting.format(item3, price3);
		
		formatting.format2(item4, price4);
		formatting.format(item5, price5);
		formatting.format(item6, price6);
		System.out.println("\n__________________________________________");
		System.out.println("     * Thank you for your support *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*%17s ........%10.2f", item, price);
	}
	
	public void format2(String items, double prices)
	{
		System.out.printf("\n\n*%17s ........%10.2f", items, prices);
	}
}