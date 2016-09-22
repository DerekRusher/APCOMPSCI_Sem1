public class RetMethod
{
	public static void main(String[]args)
	{
		//RetMethod volCube = new RetMethod();
		//int side1 = 3;
		//System.out.println(volCube.cube(side1));
		
		RetMethod average = new RetMethod();
		int n1 = 3;
		int n2 = 8;
		int n3 = 15;
		double avg = average.calcAvg(n1, n2, n3);
		System.out.printf("The Volume of your Rectangular Prism is %10.2f\n", avg);
	}
	
	//public int cube(int side)
	//{
		//return side*side*side;
	//}
	
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
}