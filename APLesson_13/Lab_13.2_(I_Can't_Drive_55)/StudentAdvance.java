public class StudentAdvance extends Advance
{
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: \t" + getSerialNo() + "\nPrice: \t" + getPrice() + "\n(STUDENT ID REQUIRED)";
	}
}