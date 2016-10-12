import java.util.Scanner;

public class gpaFinal
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your current grade in AP Physics 1?");
		double ph = in.nextDouble();
		System.out.println("What is your current grade in ESD?");
		double es = in.nextDouble();
		System.out.println("What is your current grade in Spanish 2?");
		double sp = in.nextDouble();
		System.out.println("What is your current grade in AP Comp Sci?");
		double cs = in.nextDouble();
		System.out.println("What is your current grade in IM3H?");
		double im = in.nextDouble();
		System.out.println("What is your current grade in AP Eng Lang?");
		double el = in.nextDouble();
		System.out.println("What is your current grade in APUSH?");
		double us = in.nextDouble();
		/*System.one.println("How many classes are weighted?");*/
		double w = /*in.nextDouble()*/7;
		//remove seven if you Scan for w
		double pGPA = calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
		//System.out.println(pGPA);
		double gpa = pGPA/w;
		System.out.println("Your unwieghted GPA is " + gpa);
		double trueGPA = (pGPA + 5)/7;
		System.out.println("Your wieghted GPA is " + trueGPA);
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
	
	public static double nineGPA()
	{
		return 4 + 4 + 4 + 4 + 4 + 4;
	}
	
	public static double tenGPA()
	{
		return 4 + 4 + 4 + 4 + 4 + 3
		//4 + 4 +4 + 4 +3 +3
	}
}