public class GMC extends Car
{
	private double x, y;
	private int ID;
	public GMC(double xc, double yc)
	{
		super();
		x = xc;
		y = yc;
	}
	
	public int getID()
	{
		return super.ID;
	}
	
	public void move(double xm, double ym)
	{
		x += xm;
		y += ym;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}	
}