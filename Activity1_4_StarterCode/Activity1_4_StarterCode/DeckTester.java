/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"two", "three", "four"};
		String[] rank = {"TWO", "THREE", "FOUR"};
		String[] suits = {"diamonds", "spades", "clubs"};
		int[] vals = {2, 3, 4};
		Deck Deck1 = new Deck(ranks, suits, vals);
		Deck Deck2 = new Deck(suits, ranks, vals);
		Deck Deck3 = new Deck(suits, rank, vals);
		System.out.println(Deck1.deal());
		System.out.println(Deck2.deal());
		System.out.println(Deck3.deal());
		System.out.println(Deck1.isEmpty());
		System.out.println(Deck2.isEmpty());
		System.out.println(Deck3.isEmpty());
		System.out.println(Deck1.size());
		System.out.println(Deck2.size());
		System.out.println(Deck3.size());
		System.out.println(Deck1);
	}
}
