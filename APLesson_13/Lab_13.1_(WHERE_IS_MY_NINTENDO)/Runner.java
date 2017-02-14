public class Runner
{
	public static void main(String[]args)
	{
		GameSystem game1 = new XBox("Xbox 360");
		System.out.println(game1);
		GameSystem game2 = new XBox("Xbox One");
		System.out.println(game2);
		GameSystem game3 = new XBox("Origional Xbox");
		System.out.println(game3);
		GameSystem game4 = new PlayStation("PS3");
		System.out.println(game4);
		GameSystem game5 = new PlayStation("PS4");
		System.out.println(game5);
		GameSystem game6 = new PlayStation("PS1");
		System.out.println(game6);
		GameSystem game7 = new PC("AMD Build");
		System.out.println(game7);
		GameSystem game8 = new PC("NVidia Build");
		System.out.println(game8);
		GameSystem game9 = new PC("Toaster ASUS Laptop");
		System.out.println(game9);
		
	}
}