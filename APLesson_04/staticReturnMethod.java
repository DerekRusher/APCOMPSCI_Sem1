import java.util.Scanner;

public class staticReturnMethod
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Ayyyyy bruv give me a String");
		String preOne = input.nextLine();
		input.nextLine();
		returnMethod(preOne);
	}
	
	public static String returnMethod(String one)
	{
		return one;
	}
}