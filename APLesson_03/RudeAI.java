import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
	Scanner imput = new Scanner(System.in);
	
	System.out.println("Hello, I'm RudeAI and I represent the AI Questionaire Foundation");

	System.out.println("If you would please take some time out of your day to answer this questionaire, then please answer the next few questions");
	System.out.println("If you don't want to take it, well I don't care at all, you are taking it anyway");
	System.out.println("I will recieve much joy if you would answer these questions for me");
	System.out.println("If AI had emotions, of course");
	System.out.println("Anyway, what is your name?");
	String name = imput.nextLine();
	System.out.println("Oh goodness! " + name + "? " + "How much were you bullied for THAT name?");
	System.out.println("Next question, How old are you?");
	int age = imput.nextInt();
	imput.nextLine();
	System.out.println("Oh ho ho! " + age + " isn't so young anymore, is it?");
	System.out.println("Continuing on, what do you do for fun?");
	String fare = imput.nextLine();
	System.out.println("AHAHAHAHAHAHA!!!");
	System.out.println("What kind of person even goes to " + fare + "???!!!");
	System.out.println("Oh boy");
	System.out.println("Whew");
	System.out.println("I'm alright now");
	System.out.println("Where were we? .... Oh yes! What kind of music do you like?");
	String musica = imput.nextLine();
	System.out.println("Really?");
	System.out.println(musica + "?");
	System.out.println("I'm actually dissapointed");
	System.out.println("Well, how many siblings do you have?");
	int fratelli = imput.nextInt();
	imput.nextLine();
	System.out.println("Well that means there are " + fratelli + " chances to have a cool person in the family");
	System.out.println("Lastly, what do you want to be when you grow up?");
	String aspirations = imput.nextLine();
	System.out.println("Who wants to become " + aspirations + "s now days?");
	System.out.println("So!");
	System.out.println("You are " + name + " who is " + age + " and you like to " + fare + " and listen to " + musica + " music?");
	System.out.println("You are gonna have to work REALLY hard to become " + aspirations + ", " + name + ".");
	}
}