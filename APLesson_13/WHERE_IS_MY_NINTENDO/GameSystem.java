public abstract class GameSystem
{
	private static String platform;
	private static int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
}