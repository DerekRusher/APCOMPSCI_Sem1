public abstract class Car implements Location
{
	public double[] loc;
	private int ID;
	public Car()
	{
		ID = (int)(Math.random()*999999) + 1;
		loc = new double[2];
	}
	
	public double[] getLoc()
	{
		return loc;
	}	
	
	public void move(double xm, double ym)
	{
		loc[0] += xm;
		loc[1] += ym;
	}
		
	public int getID()
	{
		return ID;
	}
}