public abstract class Car implements Location
{
	double[] loc;
	public int ID;
	public Car()
	{
		ID = (int)(Math.random()*999999) + 1;
	}
	
	public abstract void move(double xm, double ym);
}