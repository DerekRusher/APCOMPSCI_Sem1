import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class completeEquation_this_one{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression (with spaces): ");
		String a = kb.nextLine();
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(a.split(" ")));
		run(equation);
		run2(equation);
		System.out.println(equation);
	}
		
	public static void run(ArrayList<String> equation){
		int i = 0;
		while(i < equation.size()){
			if(equation.get(i).equals("*") || equation.get(i).equals("/")){
				if(equation.get(i).equals("*"))
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * (Integer.parseInt(equation.get(i+1)))));
				else
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / (Integer.parseInt(equation.get(i+1)))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
	}
	public static void run2(ArrayList<String> equation){
		int i = 0;
		while(i < equation.size()){
			if(equation.get(i).equals("+") || equation.get(i).equals("-")){
				if(equation.get(i).equals("+"))
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + (Integer.parseInt(equation.get(i+1)))));
				else
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - (Integer.parseInt(equation.get(i+1)))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
	}
}