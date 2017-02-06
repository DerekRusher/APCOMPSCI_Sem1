import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String n)
	{
		loadToys(n);
	}
	
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<>(ts.split(", "));
		
		for(int i = 0; i < ts.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getThatToy(name);
			
			if(t == null)//not on the list
			{
				if(t.getType().equals("Car"))
				{
					toyList.add(new Car(name));  //add it to the list
				}
				else
					toyList.add(new AFigure(name));
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
			
		}
	}
	
	public static void getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
}