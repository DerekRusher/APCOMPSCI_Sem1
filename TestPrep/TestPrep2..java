Question_01
Consider the following segment and two classes. 


	Mambo m = new Mambo();
	Rumba r = new Rumba();


	public class Rumba
	{
	   public Rumba()
	   {
		   System.out.println("Executing the Rumba constructor");
	   }
	}


	public class Mambo
	{
	   public Mambo()
	   {
		   System.out.println("executing the Mambo constructor");
	   }
	}


What is the relationship between class Rumba and class Mambo? 


	A.	Inheritance only 
	B.	Composition only
	C.	Both inheritance and composition
	D.	Polymorphism
	E.//There is no class relationship between Rumba and Mambo. 
	
//Neither class extends the other nor calls upon on even refers to the other.

/*********************************************************************************************************/

Question_02
Consider the following segment and two classes. 

	Mambo m = new Mambo();
	Rumba r = new Rumba();

	public class Rumba
	{
	   public Rumba()
	   {
		   System.out.println("Executing the Rumba constructor");
	   }
	}

	public class Mambo extends Rumba

	{
	   public Mambo()
	   {
		   /* missing code */
	   }
	}

The program output is expected to display the following

	Executing the Rumba constructor
	executing the Mambo constructor
	Executing the Rumba constructor


Which of the following can be used to replace the /* missing code */ in constructor 
Mambo so that the desired output is achieved? 

	I.	Rumba.super();
		System.out.println("executing the Mambo constructor");

	II.	System.out.println("executing the Mambo constructor");

	III.super();
		System.out.println("executing the Mambo constructor");

	A.	I only
	B.	II only
	C.//III only
	D.	I and II
	E.	II and III
	
//Rumba.super() calls upon the super of Rumba, which doesnt exist, and II only runs the 
//"executing the Rumba constructor" line once total. III is the only one left.
	
/*********************************************************************************************************/

For questions 03-08, refer to the following CircusPerformer class declaration. 


	public class CircusPerformer
	{
	   private String performerName;
	   private String actName;


	   public CircusPerformer(String pN, String aN)
	   {
		   performerName = pN;
		   actName = aN;
	   }
	   public String getPerformer()
	   {
		   return performerName;
	   }
	   public String getAct()
	   {
		   return actName;
	   }
	   public void act()
	   {
		   entrance();
		   performance();
		   exit();
	   }
	   public void entrance()
	   {
		   System.out.println("Starts in ring center");
	   }
	   public void performance()
	   {
		   System.out.println("Runs in circles");
	   }
	   public void exit()
	   {
		   System.out.println("Exits from ring center");
	   }
	}
	
/*********************************************************************************************************/

Question_03


Consider the following code segment and incomplete Equestrian class. 


	Equestrian sue = new Equestrian("Sue", "Amazing Ponies");
	sue.act();


	public class Equestrian extends CircusPerformer
	{
	}


An Equestrian object is a CircusPerformer who rides ponies over the obstacles. Which 
of the following methods must be defined in the Equestrian class? 


		I.	CircusPerformer constructor
		II.	act
		III.entrance
		IV.	performance
		V.	exit


	A.//I only
	B.	II only 
	C.	III, IV, and V
	D.	I and II
	E.  I and IV
	
//act, entrance, preformance, and exit all are already declared in CircusPerformer and cannot be changed.
//There must be a constructor to inherit these methods so I is the only necissary class. 

/*********************************************************************************************************/

Question_04
An Equestrian is a CircusPerformer who rides ponies over obstacles. Consider the 
following incomplete Equestrian constructor. 


	public Equestrian(String aN, String pN)
	{
	   /* missing code */
	}


Which of the following implementations can be used to replace /* missing code */. 
In constructor Equestrian so that the CircusPerformer instance variables are properly 
initialized? 


		I.	super();
			performerName = pN;
			actName = aN;


		II.	super(aN, pN);


		III.super(performerName, actName);


	A.	I only 
	B.//II only
	C.	III only 
	D.	I and II only
	E.	I and III only
	
//CircusPerformer needs perameters, and only aN and pN actually contain things at this point.


/*********************************************************************************************************/

Question_05 
Consider the following code segment and class.


A TightRopWalker is a CircusPerformer who walks and flips on a tightrope. 


TightRopeWalker joe = new TightRopeWalker("Joe", "Feats of Daring");
joe.act();


	public class TightRopeWalker extends CircusPerformer
	{
	   public void entrance()
	   {
		   System.out.println("Starts from tight rope platform");
	   }
	   public void performance()
	   {
		   System.out.println("Walks and flips on the tightrope");
	   }
	   public void exit()
	   {
		   System.out.println("Exits from tight rope platform");
	   }
	}


What is printed as a result of executing the code segment?


		A.Starts from tight rope platform
		  Walks and flips on the tight rope
		  Exits from tight rope platform


		B.	Starts in ring center
			Walks and flips on the tight rope
			Exits from ring center


		C.	Walks and flips on the tight rope


		D.//Compile error message indicating that there is a problem with the constructor. 


		E.	Compile error message indicating that there is a problem with the act method. 
		
//The constructor is never made for the TightRopeWalker, thus nothing else can happen.

/*********************************************************************************************************/

Question_06
Consider the following code segment and class.


A TightRopWalker is a CircusPerformer who walks and flips on a tightrope. 


TightRopeWalker joe = new TightRopeWalker("Joe", "Feats of Daring");
joe.act();


	public class TightRopeWalker extends CircusPerformer
	{
	   public TightRopeWalker(String pN, String aN)
	   {
		   super(pN, aN);
	   }
	   public void entrance()
	   {
		   System.out.println("Starts from tight rope platform");
	   }
	   public void performance()
	   {
		   System.out.println("Walks and flips on the tight rope");
	   }
	   public void exit()
	   {
		   System.out.println("Exits from tight rope platform");
	   }
	}


What is printed as a result of executing the code segment?


	A.//Starts from tight rope platform
	  //Walks and flips on the tight rope
	  //Exits from tight rope platform


	B.	Starts in ring center
		Walks and flips on the tight rope
		Exits from ring center


	C.	Walks and flips on the tight rope


	D.	Compile error message indicating that there is a problem with the constructor. 


	E.	Compile error message indicating that there is a problem with the act method. 
	
//The call to a new object is fine, the call to act() is fine, and B and C require some things to be wrong
//and some things to be right, not possible with this set up. A is left.

/*********************************************************************************************************/

Question_07

Consider the following code segment and class.


HighWireJuggler kathy = new HighWireJuggler("Kathy", "High Wire Juggling");
kathy.act();


	public class TightRopeWalker extends CircusPerformer
	{
	   public TightRopeWalker(String pN, String aN)
	   {
		   super(pN, aN);
	   }
	   public void entrance()
	   {
		   System.out.println("Starts from tight rope platform");
	   }
	   public void performance()
	   {
		   System.out.println("Walks and flips on the tight rope");
	   }
	   public void exit()
	   {
		   System.out.println("Exits from tight rope platform");
	   }
	}


	public class HighWireJuggler extends TightRopeWalker
	{
	   public HighWireJuggler(String pN, String aN)
	   {
		   super(pN, aN);
	   }
	}


What is printed as a result of executing the code segment?


	A.//Starts from tight rope platform
	  //Walks and flips on the tight rope
	  //Exits from tight rope platform


	B.	Starts in ring center
		Walks and flips on the tight rope
		Exits from ring center


	C.	Walks and flips on the tight rope


	D.  Compile error message indicating that there is a problem with the constructor. 


	E.	Compile error message indicating that there is a problem with the act method. 
	
//The call to a new object is fine, the call to act() is fine, and B and C require some things to be wrong
//and some things to be right, not possible with this set up. A is left.


/*********************************************************************************************************/

Question_08


Consider the following code segment and class.


HighWireJuggler kathy = new HighWireJuggler("Kathy", "High Wire Juggling");
kathy.act();


	public class TightRopeWalker extends CircusPerformer
	{
	   public TightRopeWalker(String pN, String aN)
	   {
		   super(pN, aN);
	   }
	   public void entrance()
	   {
		   System.out.println("Starts from tight rope platform");
	   }
	   public void performance()
	   {
		   System.out.println("Walks and flips on the tight rope");
	   }
	   public void exit()
	   {
		   System.out.println("Exits from tight rope platform");
	   }
	}


	public class HighWireJuggler extends TightRopeWalker
	{
	   public HighWireJuggler(String pN, String aN)
	   {
		   super(pN, aN);
	   }


	   public void performance()
	   {
		   System.out.println("Juggles while walking and flipping a tight rope");
	   }
	}


What is printed as a result of executing the code segment?

  
	A.	Starts from tight rope platform
		Walks and flips on the tight rope
		Exits from tight rope platform


	B.	Starts in ring center
		Walks and flips on the tight rope
		Exits from ring center


	C.//Starts from tight rope platform
	  //Juggles wile walking and flipping a tight rope
	  //Exits from tight rope platform


	D.	Compile error message indicating that there is a problem with the constructor. 


	E.	Compile error message indicating that there is a problem with the act method. 
	
//The call to a new object is fine, the call to act() is fine, and B and C require some things to be wrong
//and some things to be right, not possible with this set up. A is left.

/*********************************************************************************************************/