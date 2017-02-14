public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket a = new Walkup();
		Ticket b = new Advance(11);
		Ticket c = new StudentAdvance(5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}