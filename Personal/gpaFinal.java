import java.util.Scanner;

public class gpaFinal
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
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your current grade in AP Physics 1?");
		ph = in.nextDouble();
		System.out.println("What is your current grade in ESD?");
		es = in.nextDouble();
		System.out.println("What is your current grade in Spanish 2?");
		sp = in.nextDouble();
		System.out.println("What is your current grade in AP Comp Sci?");
		cs = in.nextDouble();
		System.out.println("What is your current grade in IM3H?");
		im = in.nextDouble();
		System.out.println("What is your current grade in AP Eng Lang?");
		el = in.nextDouble();
		System.out.println("What is your current grade in APUSH?");
		us = in.nextDouble();
		print("Do you want to see your current GPA?", b1);
		print("Do you want to see your 10th-11th grade GPA?", b2);
		print("Do you want to see your 9th-11th grade GPA?", b3);
		print("Do you want to see your 7th-11th grade GPA?", b4);
		print("Do you want to see unweighted GPA?", b5);
		print("Do you want to see weighted GPA?", b6);
		print("Do you want to see semesters averaged(v1)?", b7);
		print("Do you want to see semesters unaveraged(v2)?", b8);
		double w = 5;
		double pGPA = calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
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
		double ninerGPA = nineGPA();
			double nguw = ninerGPA/19;
				System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", nguw, nguw);
			double ngw = (ninerGPA+w+1)/19;
				System.out.printf("Your wieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", ngw, ngw);
		double ninerGPAVersion2 = nineGPAVersion2();
			double nguwv2 = ninerGPAVersion2/19;
				System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", nguwv2, nguwv2);
			double ngwv2 = (ninerGPAVersion2+w+1)/19;
				System.out.printf("Your wieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", ngwv2, ngwv2);
		double sevenerGPA = sevenGPA();
			double sguw = sevenerGPA/22;
				System.out.printf("Your unwieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", sguw, sguw);
			double sgw = (sevenerGPA+w+1)/22;
				System.out.printf("Your wieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", sgw, sgw);
		double sevenerGPAVersion2 = sevenGPAVersion2();
			double sguwv2 = sevenerGPAVersion2/22;
				System.out.printf("Your unwieghted GPA for 7th-11th grade (semesters not averaged) is %.1f or %f\n", sguwv2, sguwv2);
			double sgwv2 = (sevenerGPA+w+1)/22;
				System.out.printf("Your wieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", sgwv2, sgwv2);
		if(b5 == false && b6 == false && b7 == false && b8 == false)
		{
			System.out.println("You have selected to print nothing");
		}
		}
		else
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
	
	public static double sevenGPA()
	{
		return 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3 + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double sevenGPAVersion2()
	{
		return 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3 + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double nineGPA()
	{
		return 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3 + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double nineGPAVersion2()
	{
		return 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3 + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double tenGPA()
	{
		return 4 + 4 + 4 + 4 + 3.5 + 3 + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double tenGPAVersion2()
	{
		return 4 + 4 + 4 + 4 + 3 + 3 + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static void print(String first, boolean second)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(first + "\"a\" for yes and \"b\" for no");
		String a = in.next();
		if(a.equals(a))
		{
			second = true;
		}
		else
		{
			second = false;
		}
	}
}