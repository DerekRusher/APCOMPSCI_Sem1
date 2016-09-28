import java.util.Scanner;

public class staticReturnMethod
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		String First = "Ayyyyy bruv give me a String";
		String Second = input.nextLine();
		returnMethod(First, Second);
		//System.out.println("Ya String is " + )
	}
	
	public static String returnMethod(String one, String two)
	{
		System.out.println(one);
		return two;
	}
}