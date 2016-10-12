import java.util.Scanner;

public class gpa
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your current letter grade in Science?");
		String sc = in.next();
		System.out.println("What is your current letter grade in ESD?");
		String es = in.next();
		System.out.println("What is your current letter grade in Spanish?");
		String sp = in.next();
		System.out.println("What is your current letter grade in Comp Sci?");
		String cs = in.next();
		System.out.println("What is your current letter grade in Math?");
		String ma = in.next();
		System.out.println("What is your current letter grade in English?");
		String en = in.next();
		System.out.println("What is your current letter grade in History?");
		String hi = in.next();
		
		double pGPA = calcPoints(sc) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(ma) + calcPoints(en) + calcPoints(hi);
		//System.out.println(pGPA);
		double gpa = pGPA/7;
		System.out.println("Your [unwieghted] GPA is " + gpa);
		
	}
	
	public static double calcPoints(String a)
	{
		double one = 0.0;
		
		if (a.equals("A")){
		one = 4.0;}
		else if (a.equals("B")){
		one = 3.0;}
		else if (a.equals("C")){
		one = 2.0;}
		else if (a.equals("D")){
		one = 1.0;}
		else
			one = 0.0;
		
		return one;
	}
}