public class Honda implements Location
{
	private double[] loc;
	
	public Honda(double[] l)
	{
		loc = l;
	}
	
	public int getID()
	{
		return (int)(Math.random()*999999) + 1;
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