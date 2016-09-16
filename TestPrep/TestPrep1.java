import java.util.Scanner;

public class TestPrep1
{
	public static void main(String[]args)
	{
		System.out.println("1)");
		int num = 45;
		System.out.println("IronMan has " + num + " kinds of weapons in his suit.");
		
		System.out.println("2)");
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println(pres + " once said, \"" + quote + "\"");
		
		System.out.println("3)");
		int h = 45;
		int w = 64;
		System.out.println("the area of your rectangle is..." + h*w);
		
		System.out.println("4)");
		System.out.println("it would cause an error becuase \"seven\" is a string and int slices = kb.nextInt(); onl accepts numbers becuase it is an int.");
		
		System.out.println("5)");
		System.out.println("C. Is there a Mr. or Mrs. Buster?");
		
		System.out.println("6)");
		System.out.println("a.");
		System.out.println("How many siblings do you have?");
		System.out.println(">> 3");
		System.out.println("What are their names?");
		System.out.println("OK, which one is your favorite?");
		System.out.println(">>  Carl");
		System.out.println("Awe! Carl is your favorite.");
		
		System.out.println("7)");
		System.out.println("The escape characters for \" need to be added.");
		System.out.println("The new code will look like: System.out.println(\"R. Kelly said \\\"I believe I can fly!\\\"\");");
 
		System.out.println("8)");
		System.out.println("This one goes on top" + "\n" + "This one goes on bottom");
		
		System.out.println("9)");
		System.out.println("a\tb\tc\nd\te\tf\ng\th\ti");
		
		System.out.println("10)");
		double four = 4;
		double three = 3;
		double two = 2;
		double one = 1;
		double zero = 0;
		boolean lol = true;
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
		
		double preGpa = (math + science + english + history + compsci);
		System.out.println("The sum of all the Grades is: " + preGpa);
		double gpa = preGpa/500;
		System.out.println("The 'gpa' is: " + gpa);
		double averageGrade = gpa*100;
		System.out.println("The Average of the Grades is: " + averageGrade);
		
		if (lol = true){
		if(math > 89.999){
			double maths = four;
			System.out.println(four);
		}
		else if(math > 79.999){
			double maths = three;
			System.out.println(maths);
		}
		else if(math > 69.999){
			double maths = two;
			System.out.println(maths);
		}
		else if(math > 59.999){
			double maths = one;
			System.out.println(maths);
		}
		else {
			double maths = zero;
			System.out.println(maths);
		}	
		
		if(science > 89.999){
			double sciences = four;
			System.out.println(sciences);
		}
		else if(science > 79.999){
			double sciences = three;
			System.out.println(sciences);
		}
		else if(science > 69.999){
			double sciences = two;
			System.out.println(sciences);
		}
		else if(science > 59.999){
			double sciences = one;
			System.out.println(sciences);
		}
		else {
			double sciences = zero;
			System.out.println(sciences);
		}	
		
		
		if(history > 89.999){
			double histories = four;
			System.out.println(histories);
		}
		else if(history > 79.999){
			double histories = three;
			System.out.println(histories);
		}
		else if(history > 69.999){
			double histories = two;
			System.out.println(histories);
		}
		else if(history > 59.999){
			double histories = one;
			System.out.println(histories);
		}
		else {
			double histories = zero;
			System.out.println(histories);
		}	
		
		
		if(english > 89.999){
			double englishes = four;
			System.out.println(englishes);
		}
		else if(english > 79.999){
			double englishes = three;
			System.out.println(englishes);
		}
		else if(english > 69.999){
			double englishes = two;
			System.out.println(englishes);
		}
		else if(english > 59.999){
			double englishes = one;
			System.out.println(englishes);
		}
		else {
			double englishes = zero;
			System.out.println(englishes);
		}	
		
		
		if(compsci > 89.999){
			double compscis = four;
			System.out.println(compscis);	
		}
		else if(compsci > 79.999){
			double compscis = three;
			System.out.println(compscis);
		}
		else if(compsci > 69.999){
			double compscis = two;
			System.out.println(compscis);
		}
		else if(compsci > 59.999){
			double compscis = one;
			System.out.println(compscis);
		}
		else {
			double compscis = zero;
			System.out.println(compscis);
		}
		
		//if (System.out.println(four) = true){
		//System.out.println(four);
		//}
		
		System.out.println("Using ints with decimals will round down a number. Thus, doubles needed to be used for all ints.");
		
	}
}
}



//if (lol = true){
	//	if(math > 89.999){
		//	double maths = four;
			//System.out.println(four);
//			if(science > 89.999){
	//			double sciences = four;
		//		System.out.println(sciences);
			//}
//			else if(science > 79.999){
	//			double sciences = three;
		//		System.out.println(sciences);
			//}
//			else if(science > 69.999){
	//			double sciences = two;
		//		System.out.println(sciences);
//		}
	//	else if(science > 59.999){
		//	double sciences = one;
			//System.out.println(sciences);
//		}
	//	else {
		//	double sciences = zero;
			//System.out.println(sciences);
//		}
	//			
		//}
//		else if(math > 79.999){
	//		double maths = three;
		//	System.out.println(maths);
//		}
	//	else if(math > 69.999){
		//	double maths = two;
			//System.out.println(maths);
//		}
	//	else if(math > 59.999){
		//	double maths = one;
			//System.out.println(maths);
//		}
	//	else {
		//	double maths = zero;
			//System.out.println(maths);
//		}	
	//	
		//if(science > 89.999){
			//double sciences = four;
//			System.out.println(sciences);
	//	}
		//else if(science > 79.999){
			//double sciences = three;
//			System.out.println(sciences);
	//	}
		//else if(science > 69.999){
			//double sciences = two;
//			System.out.println(sciences);
	//	}
		//else if(science > 59.999){
			//double sciences = one;
//			System.out.println(sciences);
	//	}
		//else {
			//double sciences = zero;
//			System.out.println(sciences);
	//	}	
		//
			//
//		if(history > 89.999){
	//		double histories = four;
		//	System.out.println(histories);
//		}
	//	else if(history > 79.999){
		//	double histories = three;
			//System.out.println(histories);
//		}
	//	else if(history > 69.999){
		//	double histories = two;
			//System.out.println(histories);
//		}
	//	else if(history > 59.999){
		//	double histories = one;
			//System.out.println(histories);
//		}
	//	else {
		//	double histories = zero;
			//System.out.println(histories);
//		}	
	//	
		//
//		if(english > 89.999){
	//		double englishes = four;
		//	System.out.println(englishes);
//		}
	//	else if(english > 79.999){
		//	double englishes = three;
			//System.out.println(englishes);
//		}
	//	else if(english > 69.999){
		//	double englishes = two;
			//System.out.println(englishes);
//		}
	//	else if(english > 59.999){
		//	double englishes = one;
			//System.out.println(englishes);
//		}
	//	else {
		//	double englishes = zero;
			//System.out.println(englishes);
//		}	
	//	
		//
//		if(compsci > 89.999){
	//		double compscis = four;
		//	System.out.println(compscis);	
//		}
	//	else if(compsci > 79.999){
		//	double compscis = three;
			//System.out.println(compscis);
//		}
	//	else if(compsci > 69.999){
		//	double compscis = two;
			//System.out.println(compscis);
//		}
	//	else if(compsci > 59.999){
		//	double compscis = one;
			//System.out.println(compscis);
//		}
	//	else {
		//	double compscis = zero;
			//System.out.println(compscis);
//		}