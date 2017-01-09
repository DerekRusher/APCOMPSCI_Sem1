import static java.lang.Math.*;
public class tailsTheFox
{
	private double distance, hours, minutes;
	private double mph;
	
	public tailsTheFox()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public tailsTheFox(double d, double h, double m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public void setValues(double d, double h, double m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}

	public double getDistance()
	{
		return distance;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public double getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60));
		return mph;
	}
	
}