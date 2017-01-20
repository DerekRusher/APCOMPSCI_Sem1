public class alwaysFull
{
	private String Manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	public alwaysFull(String m, String n)
	{
		Manufacturer = m;
		name = n;
		category = "TBA";
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = 0;
	}
	
	public alwaysFull(String m, String n, String c, double p)
	{
		Manufacturer = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	
	public String toString()
	{
		return "Manufacturer: " + Manufacturer + "\nName: " + name + "\nCategory: " + category + "\nUPC#: " + UPC + "\nPrice: " + price + "0 Dollars";
	}
}