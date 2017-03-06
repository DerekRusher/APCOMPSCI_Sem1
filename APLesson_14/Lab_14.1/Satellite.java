import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

	   double IDt;
	   int q = 0;

       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
	   
	   double h1 = ((int)(Math.random()*9999) + 1);
	   double h2 = ((int)(Math.random()*9999) + 1);
	   double t1 = ((int)(Math.random()*9999) + 1);
	   double t2 = ((int)(Math.random()*9999) + 1);
	   double g1 = ((int)(Math.random()*9999) + 1);
	   double g2 = ((int)(Math.random()*9999) + 1);
	   
	   h1 = h1/100;
	   h2 = h2/100;
	   t1 = t1/100;
	   t2 = t2/100;
	   g1 = g1/100;
	   g2 = g2/100;
	   
	   printout += "\n\n==========================";
	   
	   for (Location l : locate)
	   {
		   IDt = l.getID();
			double[] temp = new double[2];
			temp[0] = getMove(locate, h1, t1, g1, IDt, q);
			temp[1] = getMove(locate, h2, t2, g2, IDt, q);
			double[] temp1 = l.getLoc();
			double[] temp2 = new double[2];
			temp2[0] = temp[0] + temp1[0];
			temp2[1] = temp[1] + temp1[1];
		   printout += "\nAfter " + l.getID() + " Moved (" + getLocation(temp) +
		   ")\nNew Location: (" + getLocation(temp2) + ")";
	   }
	   
	   printout += "\n\n==========================\nDistance from home...";
	   
	   for(Location l : locate)
	   {
		   	IDt = l.getID();
			double[] temp = new double[2];
			temp[0] = getMove(locate, h1, t1, g1, IDt, q);
			temp[1] = getMove(locate, h2, t2, g2, IDt, q);
			double[] temp1 = l.getLoc();
			double[] temp2 = new double[2];
			temp2[0] = temp[0] + temp1[0];
			temp2[1] = temp[1] + temp1[1];
		   printout += "\nDistance for " + l.getID() + ": (" + getDistance(temp2, home) + ")";
	   }

       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
   
   public static double getMove(ArrayList<Location> locate, double h, double t, double g, double IDt, int q)
   {
	   for(Location l : locate)
	   {
		   q++;
		   if(l.getID() == IDt && q == 1)
		   {
			   return h;
		   }
		   if(l.getID() == IDt && q == 2)
		   {
			   return t;
		   }
		   if(l.getID() == IDt && q == 3)
		   {
			   return g;
		   }
		}
		return 0;
   }
}