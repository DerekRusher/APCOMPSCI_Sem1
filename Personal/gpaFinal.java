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
		/*System.one.println("How many classes are weighted?");*/
		double w = /*in.nextDouble()*/5;
		//remove seven if you Scan for w
		double pGPA = calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
		//System.out.println(pGPA);
		double gpa = pGPA/7;
				//System.out.println("Your unwieghted GPA for this year is " + gpa);
				System.out.printf("Your unwieghted GPA for this year is %.1f or %f\n", gpa, gpa);
		double trueGPA = (pGPA + w)/7;
				//System.out.println("Your wieghted GPA is for this year is " + trueGPA);
				System.out.printf("Your wieghted GPA is for this year is %.1f or %f\n", trueGPA, trueGPA);
		double tenerGPA = tenGPA();
			double tguw = tenerGPA/13;
				//System.out.println("Your unwieghted GPA for 10th-11th grade (semesters averaged) is " + tguw);
				System.out.printf("Your unwieghted GPA for 10th-11th grade (semesters averaged) is %.1f or %f\n", tguw, tguw);
			double tgw = (tenerGPA+w+1)/13;
				//System.out.println("Your wieghted GPA for 10th-11th grade (semesters averaged) is " + tgw);
				System.out.printf("Your wieghted GPA for 10th-11th grade (semesters averaged) is %.1f or %f\n", tgw, tgw);
		double tenerGPAVersion2 = tenGPAVersion2();
			double tguwv2 = tenerGPAVersion2/13;
				//System.out.println("Your unwieghted GPA for 10th-11th grade (semesters not averaged) is " + tguwv2);
				System.out.printf("Your unwieghted GPA for 10th-11th grade (semesters not averaged) is %.1f or %f\n", tguwv2, tguwv2);
			double tgwv2 = (tenerGPAVersion2+w+1)/13;
				//System.out.println("Your wieghted GPA for 10th-11th grade (semesters not averaged) is " + tgwv2);
				System.out.printf("Your wieghted GPA for 10th-11th grade (semesters not averaged) is %.1f or %f\n", tgwv2, tgwv2);
		double ninerGPA = nineGPA();
			double nguw = ninerGPA/19;
				//System.out.println("Your unwieghted GPA for 9th-11th grade (semesters averaged) is " + nguw);
				System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", nguw, nguw);
			double ngw = (ninerGPA+w+1)/19;
				//System.out.println("Your wieghted GPA for 9th-11th grade (semesters averaged) is " + ngw);
				System.out.printf("Your wieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", ngw, ngw);
		double ninerGPAVersion2 = nineGPAVersion2();
			double nguwv2 = ninerGPAVersion2/19;
				//System.out.println("Your unwieghted GPA for 9th-11th grade (semesters not averaged) is " + nguwv2);
				System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", nguwv2, nguwv2);
			double ngwv2 = (ninerGPAVersion2+w+1)/19;
				//System.out.println("Your wieghted GPA for 9th-11th grade (semesters not averaged) is " + ngwv2);
				System.out.printf("Your wieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", ngwv2, ngwv2);
		double sevenerGPA = sevenGPA();
		double sevenerGPAVersion2 = sevenGPAVersion2();
	}
	
	public static double calcPoints(double a)
	{
		double one = 0.0;
		
		if (a >= 90){
		one = 4.0;}
		else if (a >= 80){
		one = 3.0;}
		else if (a >= 70){
		one = 2.0;}
		else if (a >= 60){
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
	
	
}