public class GMC implements Location
{
	private int ID, x, y;
	public GMC(int xc, int yc)
	{
		x = xc;
		y = yc;
		ID = (int)(Math.random() * 999999) + 1;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(int xm, int ym)
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