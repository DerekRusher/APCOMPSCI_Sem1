public class girls{
	static int[] numbers;
	public static void main(String[]args){
		numbers = new int[10];
		fill();
		System.out.print("For the numbers ");
		print();
		System.out.print("\n" + odds() + " are odd numbers");
	}
	public static void fill(){
		for(int i = 0; i < numbers.length; i++)
			numbers[i]= (int)(Math.random()*100)+1;
	}
	public static void print(){
		for(int number : numbers)
			System.out.print(number + " ");
	}
	public static String odds(){
		String odd = "";
		for(int number : numbers){
			if(!(number%2==0))
				odd = odd + " " + number;
		}
		return odd;
	}
}