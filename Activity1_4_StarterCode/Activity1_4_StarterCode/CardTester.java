/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card Card1 = new Card("Jack", "Diamonds", 11);
		Card Card2 = new Card("Ace", "Spades", 14);
		Card Card3 = new Card("Jack", "Diamonds", 11);
		
		System.out.println(Card1.rank());
		System.out.println(Card1.suit());
		System.out.println(Card1.pointValue());
		System.out.println(Card1);
		System.out.println(Card1.matches(Card2));
		
		System.out.println(Card2.rank());
		System.out.println(Card2.suit());
		System.out.println(Card2.pointValue());
		System.out.println(Card2);
		System.out.println(Card2.matches(Card3));
		
		System.out.println(Card3.rank());
		System.out.println(Card3.suit());
		System.out.println(Card3.pointValue());
		System.out.println(Card3);
		System.out.println(Card3.matches(Card1));		
	}
}
