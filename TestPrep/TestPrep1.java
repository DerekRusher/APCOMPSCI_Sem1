import java.util.Scanner;

public class TestPrep1
{
	public static void main(String[]args)
	{
		//System.out.println("1)");
		//int num = 45;
		//System.out.println("IronMan has " + num + " kinds of weapons in his suit.");
		
		//System.out.println("2)");
		//String pres = "Abraham Lincoln";
		//String quote = "Whatever you are, be a good one.";
		//System.out.println(pres + " once said, \"" + quote + "\"");
		
		//System.out.println("3)");
		//int h = 45;
		//int w = 64;
		//System.out.println("the area of your rectangle is..." + h*w);
		
		//System.out.println("4)");
		//it would cause an error becuase "seven" is a string and int slices = kb.nextInt(); onl accepts numbers becuase it is an int.
		
		//System.out.println("5)");
		//C. Is there a Mr. or Mrs. Buster?
		
		//System.out.println("6)");
		//a. 
		//How many siblings do you have? 
		//>> 3
		//What are their names? 
		//OK, which one is your favorite?
		//>>  Carl
		//Awe! Carl is your favorite.
		
		//System.out.println("7)");
		//The escape characters for " need to be added.
		//The new code will look like: System.out.println("R. Kelly said \"I believe I can fly!\"");
 
		//System.out.println("8)");
		//System.out.println("This one goes on top" + "\n" + "This one goes on bottom");
		
		//System.out.println("9)");
		//System.out.println("a\tb\tc\nd\te\tf\ng\th\ti");
		
		//System.out.println("10)");
		double four = 4;
		double three = 3;
		double two = 2;
		double one = 1;
		double zero = 0;
		//double maths = 7;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Math grade: ");
		double math = kb.nextInt();
		System.out.println("Please enter your Science grade: ");
		double science = kb.nextInt();
		System.out.println("Please enter your English grade: ");
		double english = kb.nextInt();
		System.out.println("Please enter your History grade: ");
		double history = kb.nextInt();
		System.out.println("Please enter your COMPSCI grade: ");
		double compsci = kb.nextInt();
		
		if(math > 89.999){
			double maths = four;
		}
		else if(math > 79.999){
			double maths = three;
		}
		else if(math > 69.999){
			double maths = two;
		}
		else if(math > 59.999){
			double maths = one;
		}
		else {
			double maths = zero;
		}	
		
		double preGpa = (math + science + english + history + compsci);
		System.out.println(preGpa);
		double gpa = preGpa/500;
		System.out.println(gpa);	
		System.out.println(maths);
		
		//"Using ints with decimals will round down a number. Thus, doubles needed to be used for all ints."
		
	}
}

		//if(science > 89.999){
		//	double sciences = four;
		//}
		//else if(science > 79.999){
		//	double sciences = three;
		//}
		//else if(science > 69.999){
		//	double sciences = two;
		//}
		//else if(science > 59.999){
		//	double sciences = one;
		//}
		//else {
		//	double sciences = zero;
		//}	
		
		
		//if(history > 89.999){
		//	double histories = four;
		//}
		//else if(history > 79.999){
		//	double histories = three;
		//}
		//else if(history > 69.999){
		//	double histories = two;
		//}
		//else if(history > 59.999){
		//	double histories = one;
		//}
		//else {
		//	double histories = zero;
		//}	
		
		
		//if(english > 89.999){
		//	double englishes = four;
		//}
		//else if(english > 79.999){
		//	double englishes = three;
		//}
		//else if(english > 69.999){
		//	double englishes = two;
		//}
		//else if(english > 59.999){
		//	double englishes = one;
		//}
		//else {
		//	double englishes = zero;
		//}	
		
		
		//if(compsci > 89.999){
		//	double compscis = four;
		//}
		//else if(compsci > 79.999){
		//	double compscis = three;
		//}
		//else if(compsci > 69.999){
		//	double compscis = two;
		//}
		//else if(compsci > 59.999){
		//	double compscis = one;
		//}
		//else {
		//	double compscis = zero;
		//}	
