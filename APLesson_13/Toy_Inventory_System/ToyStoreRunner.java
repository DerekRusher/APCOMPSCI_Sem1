public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store);
		System.out.println("The most frequently found Toy in the store is " + store.getMostFrequentToy());
		System.out.println("The most frequently found Type in the store is " + store.getMostFrequentType());
		//print getmost frequent toy
		//print getmost frequent type
	}
}