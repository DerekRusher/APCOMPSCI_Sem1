public class Null_Pointer_Exception_Test_Class
{
	public static void main(String[]args)
	{
		String q = null;
		System.out.println(q);
		
		//
		
		if(getQ(q).equals(null))
		{
			System.out.println("It is null");
		}
	}
	
	public static String getQ(String q)
	{
		return null;
	}
}