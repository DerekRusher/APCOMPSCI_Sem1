import static java.lang.math.*;
public class tailsTheFox
{
	private int distance, hours, minutes;
	private double mph;
	
	public tailsTheFox
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public tailsTheFox(int d, int h, int m, double mphP)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = mphP;
	}
	
	public void setDistance(int d)
	{
		distance = d;
	}
	
	public void setHours(int h)
	{
		hours = h;
	}
	
	public void setMinutes(int m)
	{
		minutes = m;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60));
	}
	
}