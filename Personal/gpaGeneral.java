import java.util.Scanner;
public class gpaGeneral
{
	static boolean b1, b2;
	static double[] classes;
	static int num1, num2;
	static double n1 = 0, n2 = 0;
	static String select1, select2;
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("How many classes do you currently have?");
		num1 = kb.nextInt();
		System.out.println("Please enter the grades of all your classes");
		classes = new double[num1];
		filler();
		
		for(int i = 0; i < num1; i++)
		{
			classes[i] = calcPoints(classes[i]);
		}
		
		System.out.println("For the following questions, \"a\" is yes and anything else is no");
		System.out.println("Do you want to see your grades as unwieghted?");
		select1 = kb.next();
		System.out.println("Do you want to see your grades as wieghted?");
		select2 = kb.next();
		if (select1.equals("a"))
		{
			for(int i = 0; i < num1; i++)
			{
				n1 += classes[i];
			}
		}
		if (select2.equals("a"))
		{
			System.out.println("Please enter the number of weighted classes you have: ");
			num2 = kb.nextInt();
			for(int i = 0; i < num1; i++)
			{
				n2 += classes[i];
			}
		}
		
		System.out.printf("Your current unwieghted GPA is %.1f or " + n1/num1, n1/num1);
		System.out.printf("\nYour current   wieghted GPA is %.1f or " + (n2+num2)/num1, (n2+num2)/num1);
	}
		
	public static double calcPoints(double m)
	{
		double one = 0.0;
		if (m >= 90)
			one = 4.0;
		else if (m >= 80)
			one = 3.0;
		else if (m >= 70)
			one = 2.0;
		else if (m >= 60)
			one = 1.0;
		else
			one = 0.0;
		return one;
	}
		
	public static void filler()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < num1; i++)
		{
			double qwerty = kb.nextDouble();
			classes [i] = qwerty;
		}
	}
	
	public static void printer()
	{
		for(int i = 0; i < num1; i++)
		{
			System.out.println(classes[i]);
		}
	}
}
		
		
		
		/*
		b1 = print("Do you want to see your current GPA?", b1);
		b2 = print("Do you want to see your 10th-11th grade GPA?", b2);
		b3 = print("Do you want to see your 9th-11th grade GPA?", b3);
		b4 = print("Do you want to see your 7th-11th grade GPA?", b4);
		b5 = print("Do you want to see unweighted GPA?", b5);
		b6 = print("Do you want to see weighted GPA?", b6);
		b7 = print("Do you want to see semesters averaged(v1)?", b7);
		b8 = print("Do you want to see semesters unaveraged(v2)?", b8);
		pGPA = calcTotal(0);
		tenerGPA = calcTotal(4 + 4 + 4 + 4 + 3.5 + 3);
		tenerGPAVersion2 = calcTotal(4 + 4 + 4 + 4 + 3 + 3);
		ninerGPA = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3);
		ninerGPAVersion2 = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3);
		sevenerGPA = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3);
		sevenerGPAVersion2 = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3);	
		if(b1 == true){
			if(b5 == true)
				System.out.printf("Your unwieghted GPA for this year is %.1f or %f\n", (pGPA/7), (pGPA/7));
			if(b6 == true)
				System.out.printf("Your wieghted GPA for this year is %.1f or %f\n", ((pGPA + 5)/7), ((pGPA + 5)/7));}
		con(b2, "10", (tenerGPA/13), ((tenerGPA+6)/13), (tenerGPAVersion2/13), ((tenerGPAVersion2+6)/13));
		con(b3, "9", (ninerGPA/19), ((ninerGPA+6)/19), (ninerGPAVersion2/19), ((ninerGPAVersion2+6)/19));
		con(b4, "7", (tenerGPA/22), ((tenerGPA+6)/22), (tenerGPAVersion2/22), ((tenerGPAVersion2+6)/22));
		if((b5 == false && b6 == false && b7 == false && b8 == false) || (b1 == false && b2 == false && b3 == false && b4 == false))
			System.out.println("You have selected to print nothing");*/
	
	/*
	public static void con(boolean ah, String a, double z, double y, double x, double w){
		if(ah == true){
			if(b5 == true && b7 == true)
				System.out.printf("Your unwieghted GPA for " + a + "th-11th grade (semesters averaged) is %.1f or %f\n", z, z);
			if(b6 == true && b7 == true)
				System.out.printf("Your wieghted GPA for " + a + "th-11th grade (semesters averaged) is %.1f or %f\n", y, y);
			if(b5 == true && b8 == true)
				System.out.printf("Your unwieghted GPA for " + a + "th-11th grade (semesters not averaged) is %.1f or %f\n", x, x);
			if(b6 == true && b8 == true)
				System.out.printf("Your wieghted GPA for " + a + "th-11th grade (semesters not averaged) is %.1f or %f\n", w, w);}}

	public static double calcTotal(double lol){
		return lol + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);}
*/