public class Toyota extends Car
{
	public Toyota()
	{
		super();
	}
	public Toyota(String a)
	{
		String[] loc1 = a.split(", ");
		loc[0] = Double.parseDouble(loc1[0]);
		loc[1] = Double.parseDouble(loc1[1]);
	}	
	// public static void main(String[]args)
	// {
		// Toyota yota = new Toyota("1, 2");
		// System.out.println("loc[0]" + (yota.getLoc())[0]);
		// System.out.println("loc[1]" + (yota.getLoc())[1]);
	// }
}