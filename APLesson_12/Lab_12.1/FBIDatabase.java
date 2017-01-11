public class FBIDatabase
{
	private String hair, eyes, skin;
	
	public FBIDatabase()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public FBIDatabase(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setDatabase(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}