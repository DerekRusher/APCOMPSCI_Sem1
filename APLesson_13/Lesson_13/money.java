public abstract class money
{
	private String name;
	private double value;
	private int total;
	
	public money()
	{
		this.name = "";
		this.value = 0;
		this.total = 0;
	}
	
	public money(String n, double v)
	{
		this.name = n;
		this.value = v;
		this.total = 0;
	}
	
	public abstract String scan();
	
	public void setTotal(int c)
	{
		this.total = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getValue();
	{
		return value;
	}
	
	public int getTotal();
	{
		return total;
	}
	
	public String toString()
	{
		return "Your " + name + " is worth $" + value + ".\n";
	}
}