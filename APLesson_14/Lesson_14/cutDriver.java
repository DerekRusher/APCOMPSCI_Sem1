import java.util.ArrayList;
public class cutDriver
{
	public static void main(String[]args)
	{
		ArrayList<cutShapes> cuts = new ArrayList<>();
		cuts.add(new Square(9));
		cuts.add(new Rectangle(10, 12));
		cuts.add(new Circle(5));
		
		double totalArea = 0;
		
		 for(cutShapes sh : cuts)
		 {
			 System.out.println(sh.getArea());
			 totalArea += sh.getArea();
		 }
		 
		 System.out.println("Total Wood Needed: " + totalArea + " sq ft");
	}
}