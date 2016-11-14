import java.util.Scanner;
public class Lesson_09
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 5 names: ");
		//fill array
		for(int i = 0; i < names.length; i++)
		{
			names[i] = in.next();
		}
		//print array
		for(String name : names)
		{
			System.out.print("\"" + name.length() + "\", ");
		}
	}
}