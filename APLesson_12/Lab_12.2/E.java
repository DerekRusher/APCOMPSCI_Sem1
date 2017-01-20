import java.util.Scanner;

public class E
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		alwaysFull c1;
		System.out.println("Are you a manager? (y for yes, anything else for no)");
		String select = kb.next();
		kb.nextLine();
		if(select.equals("y"))
		{
			System.out.println("Please enter a Manufacturer, name, category and price: ");
			String ma = kb.nextLine();
			String na = kb.nextLine();
			String ca = kb.nextLine();
			double pr = kb.nextDouble();
			c1 = new alwaysFull(ma, na, ca, pr);
		}
		else
		{
			System.out.println("Please enter a Manufacturer and name: ");
			String ma = kb.nextLine();
			String na = kb.nextLine();
			c1 = new alwaysFull(ma, na);
		}
		System.out.println(c1);
	}
}