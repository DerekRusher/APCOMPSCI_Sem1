//import java.util.Random;
import java.util.Scanner;

public class Lesson_05
{
	public static void main(String[]args)
	{
		//int num = 5;
		
		//if(num == 3)
		//{
		//	System.out.println("num equals 3!");
		//}
		
		//if(num == 5)
		//{
		//	System.out.println("num equals 5!");
		//}

		
		//boolean tOrF = false;
		
		//if(tOrF())
		//{
		//	System.out.println("It is true!");
		//}
		
		//if(!tOrF())
		//{
		//	System.out.println("It is false!");
		//}
		
		
		//Random rand = new Random();
		//int num =  rand.nextInt(3)+1;
		//int num = (int)(Math.random()*4);
		//System.out.println(num);
		

		//int num = 8 % 6;
		//System.out.println(num);
		
		
		//int two = in.nextInt();
		//int num = 8;
		//if (num % 4 == 0)
		//	System.out.println(num + " is a multiple of 4!");
	
	
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int one = in.nextInt();
		System.out.println("Please enter number 2: ");
		int two = in.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		
		if(even)
			System.out.println("Your number " + (one + two) + " is even");
		
		if(!even)
			System.out.println("Your number " + (one + two) + " is odd");
	}
	
	//public static boolean tOrF()
	//{
	//	return 8 >= 5;

	//}
}
