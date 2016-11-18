public class bigNum{
	static int[] numbers;
	public static void main(String[]args){
		numbers = new int[10];
		fill();
		System.out.print("Of ");
		print();
		System.out.print("\nThe largest number is " + big());
	}
	public static void fill(){
		for(int i = 0; i < numbers.length; i++)
			numbers[i]= (int)(Math.random()*100)+1;
	}
	public static void print(){
		for(int number : numbers)
			System.out.print(number + " ");
	}
	public static int big(){
		int max = 0;
		for(int number : numbers){
			if(number>max)
				max = number;
		}
		return max;
	}
}