import java.lang.Math.*;
public class burnVictim
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public burnVictim()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public burnVictim(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0;
	}
	
	public void setValues()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}