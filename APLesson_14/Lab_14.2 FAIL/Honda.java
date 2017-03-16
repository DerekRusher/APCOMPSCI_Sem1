public class Honda extends Car
{
	private double[] loc;
	private int ID;
	public Honda(double[] l)
	{
		super();
		loc = l;
	}
	
	public int getID()
	{
		return super.ID;
	}
	
	public void move(double xm, double ym)
	{
		loc[0] += xm;
		loc[1] += ym;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}