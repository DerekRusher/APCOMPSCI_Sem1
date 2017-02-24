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
//	E.//There is no class relationship between Rumba and Mambo. 
	
//Neither class extends the other nor calls upon on even refers to the other.

Answer: E
Neither class extends the other so there is no inheritance. 
Neither class contains an object of the other class so there is no composition.
  Polymorphism requires either inheritance or an interface. Neither is present. 

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
//	E.	II and III
	
//Rumba.super() calls upon the super of Rumba, which doesnt exist, and II only runs the 
//"executing the Rumba constructor" line once total. III is the only one left.

Answer: E
Choice I is no good because a constructor is an object method (non-static method). 
It cannot be called as a class method (static method). Choices II and III both work 
and do the exact same thing. While choice III explicitly calls the superclass 
constructor with super, choice II also words because the superclass constructor is 
automatically called. The super keyword is only necessary when the superclass 
constructor has parameters.  

Why I got it wrong: super only needs to be called if data is being transfered.
					no data was transfered, thus II and III work.
	
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
//	E.  I and IV
	
//act, entrance, preformance, and exit all are already declared in CircusPerformer and cannot be changed.
//There must be a constructor to inherit these methods so I is the only necissary class. 

Answer: E
The term “defined” is confusing in this question. It really means that these methods 
have to be redefined or overridden in the subclass Equestrian. The Equestrian class 
would need its own constructor and performance method. Since there is no default 
constructor for CircusPerfomer objects, subclasses need to pass the performerName 
and actName data into the constructor in the super. In addition, the description for 
CircusPerformer says that it “rides ponies over the obstacles”, meaning it does more 
than just “Runs in circles”. For this reason, we have to override the performance 
method to print “rides ponies of the obstacles”.

Why I got it wrong: All classes can be overwritten, not just abstract classes. Abstract only
					means the class HAS to be written over.

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
//	B.//II only
	C.	III only 
	D.	I and II only
	E.	I and III only
	
//CircusPerformer needs perameters, and only aN and pN actually contain things at this point.

Answer: B
I is incorrect, because there is no default constructor for CircusPerformer objects. 
Therefore, the call to super() in the Equestrian subclass would have to include 
parameter data. You could get  away with setting values directly on performerName 
and actName, because they were not declared private in the CircusPerformer 
superclass. III is incorrect, because you have no variables performerName and 
actName in the Equestrian constructor. 

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


//		D.//Compile error message indicating that there is a problem with the constructor. 


		E.	Compile error message indicating that there is a problem with the act method. 
		
//The constructor is never made for the TightRopeWalker, thus nothing else can happen.

Answer: D
TightRopeWalker does not have a constructor that will send the necessary 
performerName and actName data to the constructor in the superclass CircusPerformer. 

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


//	A.//Starts from tight rope platform
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

Answer: A
The only difference between this and Question_05 is that there is a proper 
constructor in TightRopeWalker has a proper constructor that passes the necessary 
information to the superclass. 

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


//	A.//Starts from tight rope platform
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

Answer: A 
HighWireJuggler neither re-defines nor newly-defines any methods. All methods will 
be inherited from TightRopeWalker or CircusPerformer. This means that HighWireJuggler 
objects will behave exactly like TightRopeWalker objects and have the same output. 

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


//	C.//Starts from tight rope platform
	  //Juggles wile walking and flipping a tight rope
	  //Exits from tight rope platform


	D.	Compile error message indicating that there is a problem with the constructor. 


	E.	Compile error message indicating that there is a problem with the act method. 
	
//The call to a new object is fine, the call to act() is fine, and B requires some things to be wrong
//and some things to be right, not possible with this set up. A would be true if there was no change
//from 7. C is left.

Question_08
Answer: C
There is only one significant difference between this and Question_07, and that is 
that HighWireJuggler now re-defines the performance() method. Therefore, all 
HighWireJuggler objects will enter() and exit() like a TightRopeWalker, but will 
perform() with “Juggles while walking and flipping a tight rope”.

/*********************************************************************************************************/

