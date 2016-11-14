import java.util.Scanner;
public class fibonacci{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int num = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int[] seq = new int[kb.nextInt()];
		
		for(int i = 0; i < seq.length; i++){
			if(i == 0 || i == 1)
				seq[i] = num;
			else
				seq[i] = seq[i-1] + seq[i-2];
			System.out.println(seq[i]);			
		}
	}
}