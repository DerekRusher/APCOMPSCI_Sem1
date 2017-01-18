import java.util.Scanner;

public class E
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		alwaysFull c1;
		System.out.println("Are you a manager? (y for yes, anything else for no)");
		String select = kb.next();
		if(select.equals("y"))
		{
			System.out.println("Please enter a Manufacturer, name, category and price: ");
			String ma = kb.next();
			String na = kb.next();
			String ca = kb.next();
			int pr = kb.nextInt();
			c1 = new alwaysFull(ma, na, ca, pr);
		}
		else
		{
			System.out.println("Please enter a Manufacturer and name: ");
			String ma = kb.next();
			String na = kb.next();
			c1 = new alwaysFull(ma, na);
		}
		System.out.println(c1);
	}
}