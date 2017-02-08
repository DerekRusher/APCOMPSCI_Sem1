public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String n)
	{
		super(n);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: \t" + super.getPlatform() + "\nSerial #: \t" + super.getSerialNo() + "\nSys In: \t" + systemInput();
	}
}