import java.util.Scanner;

public class gpaFinalCondensed
{
	static double ph;
	static double es;
	static double sp;
	static double cs;
	static double im;
	static double el;
	static double us;
	static boolean b1;
	static boolean b2;
	static boolean b3;
	static boolean b4;
	static boolean b5;
	static boolean b6;
	static boolean b7;
	static boolean b8;
	static double count = 0;
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		printX("What is your current grade in AP Physics 1?", ph);
		printX("What is your current grade in ESD?", es);
		printX("What is your current grade in Spanish 2?", sp);
		printX("What is your current grade in AP Comp Sci?", cs);
		printX("What is your current grade in IM3H?", im);
		printX("What is your current grade in AP Eng Lang?", el);
		printX("What is your current grade in APUSH?", us);
		print("Do you want to see your current GPA?", b1);
		print("Do you want to see your 10th-11th grade GPA?", b2);
		print("Do you want to see your 9th-11th grade GPA?", b3);
		print("Do you want to see your 7th-11th grade GPA?", b4);
		print("Do you want to see unweighted GPA?", b5);
		print("Do you want to see weighted GPA?", b6);
		print("Do you want to see semesters averaged(v1)?", b7);
		print("Do you want to see semesters unaveraged(v2)?", b8);
		double w = 5;
		double pGPA = calcTotal();
		if(b1 == true)
		{
			if(b5 == true)
			{
				double gpa = pGPA/7;
					System.out.printf("Your unwieghted GPA for this year is %.1f or %f\n", gpa, gpa);
			}
			if(b6 == true)
			{
				double trueGPA = (pGPA + w)/7;
					System.out.printf("Your wieghted GPA is for this year is %.1f or %f\n", trueGPA, trueGPA);
			}
		}
		if(b2 == true)
		{
			double tenerGPA = tenGPA();
			double tenerGPAVersion2 = tenGPAVersion2();
			if(b5 == true && b7 == true)
			{
				double tguw = tenerGPA/13;
					System.out.printf("Your unwieghted GPA for 10th-11th grade (semesters averaged) is %.1f or %f\n", tguw, tguw);
			}
			if(b6 == true && b7 == true)
			{
				double tgw = (tenerGPA+w+1)/13;
					System.out.printf("Your wieghted GPA for 10th-11th grade (semesters averaged) is %.1f or %f\n", tgw, tgw);
			}
			if(b5 == true && b8 == true)
			{
				double tguwv2 = tenerGPAVersion2/13;
					System.out.printf("Your unwieghted GPA for 10th-11th grade (semesters not averaged) is %.1f or %f\n", tguwv2, tguwv2);
			}
			if(b6 == true && b8 == true)
			{
				double tgwv2 = (tenerGPAVersion2+w+1)/13;
					System.out.printf("Your wieghted GPA for 10th-11th grade (semesters not averaged) is %.1f or %f\n", tgwv2, tgwv2);
			}
		}
		if(b3 == true)
		{
			double ninerGPA = nineGPA();
			double ninerGPAVersion2 = nineGPAVersion2();
			if(b5 == true && b7 == true)
			{
				double nguw = ninerGPA/19;
					System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", nguw, nguw);
			}
			if(b6 == true && b7 == true)
			{
				double ngw = (ninerGPA+w+1)/19;
					System.out.printf("Your wieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", ngw, ngw);
			}
			if(b5 == true && b8 == true)
			{
				double nguwv2 = ninerGPAVersion2/19;
					System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", nguwv2, nguwv2);
			}
			if(b6 == true && b8 == true)
			{
				double ngwv2 = (ninerGPAVersion2+w+1)/19;
					System.out.printf("Your wieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", ngwv2, ngwv2);
			}
		}
		if(b4 == true)
		{
			double sevenerGPA = sevenGPA();
			double sevenerGPAVersion2 = sevenGPAVersion2();
			if(b5 == true && b7 == true)
			{
				double sguw = sevenerGPA/22;
					System.out.printf("Your unwieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", sguw, sguw);
			}
			if(b6 == true && b7 == true)
			{
				double sgw = (sevenerGPA+w+1)/22;
					System.out.printf("Your wieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", sgw, sgw);
			}
			if(b5 == true && b8 == true)
			{
				double sguwv2 = sevenerGPAVersion2/22;
					System.out.printf("Your unwieghted GPA for 7th-11th grade (semesters not averaged) is %.1f or %f\n", sguwv2, sguwv2);
			}
			if(b6 == true && b8 == true)
			{
			double sgwv2 = (sevenerGPA+w+1)/22;
				System.out.printf("Your wieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", sgwv2, sgwv2);
			}
		}
		if((b5 == false && b6 == false && b7 == false && b8 == false) || (b1 == false && b2 == false && b3 == false && b4 == false))
		{
			System.out.println("You have selected to print nothing");
		}
	}
	
	public static double calcPoints(double z)
	{
		double one = 0.0;
		
		if (z >= 90){
		one = 4.0;}
		else if (z >= 80){
		one = 3.0;}
		else if (z >= 70){
		one = 2.0;}
		else if (z >= 60){
		one = 1.0;}
		else
			one = 0.0;
		
		return one;
	}
	
	public static double calcTotal()
	{
		return calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double math(double ah)
	{
		return ah;
	}
	
	public static double sevenGPA()
	{
		return math(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3) + calcTotal();
	}
	
	public static double sevenGPAVersion2()
	{
		return math(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3) + calcTotal();
	}
	
	public static double nineGPA()
	{
		return math(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3) + calcTotal();
	}
	
	public static double nineGPAVersion2()
	{
		return math(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3) + calcTotal();
	}
	
	public static double tenGPA()
	{
		return math(4 + 4 + 4 + 4 + 3.5 + 3) + calcTotal();
	}
	
	public static double tenGPAVersion2()
	{
		return math(4 + 4 + 4 + 4 + 3 + 3) + calcTotal();
	}
	
	public static void printX(String primera, double secunda)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(primera);
		secunda = in.nextDouble();
	}
	
	public static void print(String first, boolean second)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(first + " \"a\" for yes and anything else for no.");
		String a = in.next();
		if(a.equals("a"))
		{
			second = true;
			count++;
			if(count == 1)
			{
				b1 = second;
			}
			if(count == 2)
			{
				b2 = second;
			}
			if(count == 3)
			{
				b3 = second;
			}
			if(count == 4)
			{
				b4 = second;
			}
			if(count == 5)
			{
				b5 = second;
			}
			if(count == 6)
			{
				b6 = second;
			}
			if(count == 7)
			{
				b7 = second;
			}
			if(count == 8)
			{
				b8 = second;
			}
		}
		else
		{
			second = false;
			count++;
			if(count == 1)
			{
				b1 = second;
			}
			if(count == 2)
			{
				b2 = second;
			}
			if(count == 3)
			{
				b3 = second;
			}
			if(count == 4)
			{
				b4 = second;
			}
			if(count == 5)
			{
				b5 = second;
			}
			if(count == 6)
			{
				b6 = second;
			}
			if(count == 7)
			{
				b7 = second;
			}
			if(count == 8)
			{
				b8 = second;
			}
		}
	}
}