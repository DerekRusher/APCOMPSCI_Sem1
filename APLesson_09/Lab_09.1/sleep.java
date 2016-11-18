import java.util.Scanner;
public class sleep{
	static String[] words;
	public static void main(String[]args){		
		words = new String[5];
		fill();
		System.out.print("Of ");
		print();
		System.out.print("\nOnly " + z() + "contain(s) the letter z");
	}
	public static void fill(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words");
		for(int i = 0; i < words.length; i++)
			words[i] = kb.next();
	}
	public static void print(){
		for(String word : words)
			System.out.print(word + " ");
	}
	public static String z(){
		String z = "";
		for(int i = 0; i < words.length; i++){
			if(!(words[i].indexOf("z") == -1))
				z = z + words[i] + " ";
		}
		return z;
	}
}