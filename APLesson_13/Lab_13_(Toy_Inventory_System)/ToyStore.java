import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private static ArrayList<Toy> toyList;
	
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
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getThatToy(name);
			
			if(t == null)//not on the list
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));  //add it to the list
				}
				if(type.equals("AF"))
					toyList.add(new AFigure(name));
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
			
		}
	}
	
	public static Toy getThatToy(String nm)
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
	
	public static String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public static String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t : toyList)
		{
			if(t.getType().equals("Car"))
			{
				cars++;
			}
			if(t.getType().equals("AF"))
			{
				figures++;
			}
		}
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of Cars and Action Figures!";
	}
	
	public String toString()
	{
		String a = "";
		for(Toy t : toyList)
		{
			a += t;
		}
		return a;
	}
}