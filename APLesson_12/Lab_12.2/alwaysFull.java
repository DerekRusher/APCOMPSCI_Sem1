public class alwaysFull
{
	private String Manufacturer;
	private String name;
	private String category;
	private int UPC;
	private int price;
	
	public alwaysFull(String m, String n)
	{
		Manufacturer = m;
		name = n;
		category = "TBA";
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = 0;
	}
	
	public alwaysFull(String m, String n, String c, int p)
	{
		Manufacturer = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	
	public String toString()
	{
		return "Manufacturer: " + Manufacturer + "\nName: " + name + "\nCategory: " + category + "\nUPC#: " + UPC + "\nPrice: " + price;
	}
}