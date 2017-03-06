public class Toyota extends Car
{
	private double[] loc;
	private int ID;
	public Toyota(String a)
	{
		super();
		loc = new double[2];
		String[] loc1 = (a.split(", "));
		loc[0] = Double.parseDouble(loc1[0]);
		loc[1] = Double.parseDouble(loc1[1]);
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