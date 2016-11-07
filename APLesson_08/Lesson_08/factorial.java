public class factorial
{
	public static void main(String[]args)
	{
		System.out.println(Factorial(8));
	}
	
	public static int Factorial(int n)
	{
		if(n == 1) return 1;
		return n*Factorial(n-1);
	}
}