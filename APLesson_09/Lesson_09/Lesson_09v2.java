public class Lesson_09v2
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int number : numbers)
		{
			System.out.println(number);
		}
		
		System.out.println("\nThe sum of the numbers above is: " + sumArray(numbers));
		System.out.println("The average of the numbers above is: " + sumArray(numbers)/numbers.length);
	}
	
	public static int sumArray(int[] n)
	{
		int sum = 0;
		for(int number : n)
		{
			sum += number;
		}
		return sum;
	}
}