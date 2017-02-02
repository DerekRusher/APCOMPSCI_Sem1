public class Coin extends money
{
	private String weight;
	
	public Coin()
	{
		super();
		this.weight = 0;
	}
	
	public Coin(String n, String w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String scan()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "\n" + super.toString();
	}
}