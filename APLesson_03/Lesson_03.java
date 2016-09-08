import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user imput
		//System.out.println("How old are you? ");
		
		//search for the next integet that the user enters
		//int num = keyboard.nextInt();
		
		//print the results
		//System.out.println("Wow! " + num + " is a great age! I bet you have tons of fun!");
		
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("I also think that " + teacher + " is a great teacher!");
	}
}