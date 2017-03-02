public class Toyota implements Location
{
	private double[] loc;

	public Toyota(String a)
	{
		loc = new double[2];
		String[] loc1 = (a.split(", "));
		loc[0] = Double.parseDouble(loc1[0]);
		loc[1] = Double.parseDouble(loc1[1]);
	}
	
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
	
	public void move(int xm, int ym)
	{
		loc[0] += xm;
		loc[1] += ym;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
	
	
	
}