public class arrayAverage{
	public static void main(String[]args){
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 100) + 1;
		System.out.print("The numbers are: ");
		for(int number : numbers)
			System.out.print(number + " ");
		System.out.print("\nThe average of the numbers are: " + average(numbers));
		
	}
	public static int average(int[] num){
		int sum = 0;
		for(int number : num)
			sum += number;
		return (sum/num.length);
	}
}