Question_01
Consider the following abstract interface and abstract class. 


		public class DS1203
		{
		   public static void main(String[]args)
		   {
			   CircusPerformer ivan = new CircusPerformer();
		   }
		}


		public interface CircusPerformer
		{
		   public String getPerformer();
		   public void act();
		   public void entrance();
		   public void performance();
		   public void exit();
		}


Which of the following are reasons why the program does not compile? 


	I.	CircusPerformer is abstract and cannot be used to instantiate an object. 
	II.	The CircusPerformer interface is not implemented by the required classes. 
	III.There is no constructor defined in interface CircusPerformer. 


//	A.	I only
	B.//II only
	C.	III only
	D.	I and II only 
	E.	I, II, and III
	
Answer:  A
This is one of those questions that you need to read carefully. It does not say “Which of the following 
are true?”, it asks which one is the reason why the program doesn’t compile. Answers II and III may be 
true, but they are not the reason that the program doesn’t compile. The program will not compile, 
because it attempts to instantiate an object of the CircusPerformer class which is an Interface. 
Remember that an Interface cannot be instantiated under any circumstances. 
	
/*********************************************************************************************************/

Question_02
Consider the following code segment, interface and class. 


	Acrobat ivan = new Acrobat("Ivan");
	ivan.act();


	public interface CircusPerformer
	{
	   public String getPerformer();
	   public void act();
	   public void entrance();
	   public void performance();
	   public void exit();
	}


	public class Acrobat implements CircusPerformer
	{
	   private String performerName;
	   public Acrobat(String pN)
	   {
		   performerName = pN;
	   }
	   public void act()
	   {
		   entrance();
		   performance();
		   exit();
	   }
	   public void entrance()
	   {
		   System.out.println("Parades with performers");
	   }
	   public void performance()
	   {
		   System.out.println("Flips on the trapeze");
	   }
	}


What is printed as a result of executing the code segment? 


	A.	Parades with performers
		Flips on the trapeze


	B.	Parades with performers
		Flips on the trapeze
		Lands in a safety net
		 
	C.	Ivan
		Parades with performers
		Flips on the trapeze
		Lands in a safety net


	D.	A compile error message, due to implementing a method that was not declared in the interface. 


//	E.//A compile error message, due to not implementing a method that was declared in the interface. 

/*********************************************************************************************************/	

Question_03
Consider the following code segment, interface, and class. 


	Acrobat ivan = new Acrobat("Ivan");
	ivan.act();


	public interface CircusPerformer
	{
	   private String name;
	   public String getPerformer();
	   public void act();
	   public void entrance();
	   public void performance();
	   public void exit();
	}


	public class Acrobat implements CircusPerformer
	{
	   private String name;
	   public Acrobat(String n)
	   {
		   name = n;
	   }
	   public void act()
	   {
		   entrance();
		   performance();
		   exit();
	   }
	   public String getPerformer()
	   {
		   return name;
	   }
	   public void entrance()
	   {
		   System.out.println(name + " parades with performers");
	   }
	   public void performance()
	   {
		   System.out.println(name + " flips on the trapeze");
	   }
	   public void exit()
	   {
		   System.out.println(name + " lands in safety net");
	   }
	}


What is printed as a result of executing the code segment? 


	A.	parades with performers
		Ivan flips on the trapeze
		Ivan lands in safety net
		 
	B.//Ivan parades with performers
	  //Ivan flips on the trapeze
	  //Ivan lands in safety net


	C.	Ivan 
		parades with performers
		Ivan flips on the trapeze
		Ivan lands in safety net
		 
//	D.	A compile error message, due to improperly using an attribute (instance variable) in the interface. Public Stri
		 
	E.	A compile error message, due to implementing a method that was not declared in the interface.  
	
Answer:  D
Interfaces usually do not have attributes. If they do, the attributes must be final and initialized in the
declaration. Another issue is the keyword private, which is never allowed in an interface. Everything 
in an interface is both public and abstract. If you think about it logically, private members in an 
interface would be inaccessible to a class that implements the interface, while the class would still be 
required to implement them (abstraction).
	
/*********************************************************************************************************/

Question_04
Consider the following code segment, interface, and class


Acrobat ivan = new Acrobat("Ivan");
ivan.act();


	public interface CircusPerformer
	{
	   public String preName = "The Great ";
	   public String getPerformer();
	   public void act();
	   public void entrance();
	   public void performance();
	   public void exit();
	}
	public class Acrobat implements CircusPerformer
	{
	   private String name;
	   public Acrobat(String n)
	   {
		   name = preName + n;
	   }
	   public void act()
	   {
		   entrance();
		   performance();
		   exit();
	   }
	   public String getPerformer()
	   {
		   return name;
	   }
	   public void entrance()
	   {
		   System.out.println(name + " parades with performers");
	   }
	   public void performance()
	   {
		   System.out.println(name + " flips on the trapeze");
	   }
	   public void exit()
	   {
		   System.out.println(name + " lands in safety net");
	   }
	}


What is printed as a result of executing the code segment? 


	A.	parades with performers
		Ivan flips on the trapeze
		Ivan lands in safety net


	B.	Ivan parades with performers
		Ivan flips on the trapeze
		Ivan lands in safety net


//	C.//The Great Ivan parades with performers
	  //The Great Ivan flips on the trapeze
	  //The Great Ivan lands in safety net


	D.	A compile error message, due to improperly using an attribute (instance variable) in the interface.
		Public Stri


	E.	A compile error message, due to implementing a method that was not declared in the interface.  

/*********************************************************************************************************/

Question_05
Consider the following code segment and Dance interface


	Waltz waltz = new Waltz("Moon River");
	ChaCha chacha = new ChaCha();
	Tango tango = new Tango();
	waltz.playMusic();
	chacha.danceBasic();
	tango.makeRoutine();


	interface Dance
	{
	   public void playMusic();
	   public void danceBasic();
	}


Which of the following correctly implements the Dance interface?


	public class Waltz implements Dance
	{
	   private String music;
	   public Waltz(String m)
	   {
		   music = m;
	   }
	   public void playMusic()
	   {
		   System.out.println("Play " + music);
	   }
	   public void danceBasic()
	   {
		   System.out.println("Forward-side-close, back-side-close");
	   }
	}


	public class ChaCha implements Dance
	{
	   public void playMusic()
	   {
		   System.out.println("Play music");
	   }
	   public void danceBasic()
	   {
		   System.out.println("Rock-step, cha-cha-cha");
	   }
	}


	public class Tango implements Dance
	{
	   public void playMusic()
	   {
		   System.out.println("Play music ");
	   }
	   public void danceBasic()
	   {
		   System.out.println("Forward, forward, forward-side-drag");
	   }
	   public void makeRoutine()
	   {
		   System.out.println("Make dance routine");
	   }
	}


	A.//Waltz only
	B.	ChaCha only
	C.	Waltz and ChaCha only
	D.	ChaCha and Tango only
//	E.	Waltz, ChaCha, and Tango

Answer:  E
All three methods properly implement the Dance interface. The ChaCha class does the bare minimum, 
implementing both abstract methods from Dance. The Waltz method also implements both methods, 
and then adds a constructor  and an attribute. Remember, the minimum requirement is to implement 
all abstract methods from the interface. Once that is done, there is no problem adding constructors, 
extra methods, or attributes. 

/*********************************************************************************************************/
	
Question_06
Consider the following abstract Dance class


	public abstract class Dance
	{
	   private String music;
	   public Dance(String m)
	   {
		   music = m;
	   }
	   public String getMusic()
	   {
		   return music;
	   }
	   public abstract void playMusic();
	   public abstract void danceBasic();
	}


Which of the following classes correctly declares a subclass of Dance? 


Subclass-1
	public class Tango extends Dance
	{
	   public Tango(String m)
	   {
		   super(m);
	   }
	   public void playMusic()
	   {
		   System.out.println("Play " + getMusic());
	   }
	   public void danceBasic()
	   {
		   System.out.println("Forward, forward, forward-side-drag");
	   }
	}


Subclass-2
	public class Tango extends Dance
	{
	   public Tango()
	   {
		  
	   }
	   public void playMusic()
	   {
		   System.out.println("Play music");
	   }
	   public void danceBasic()
	   {
		   System.out.println("Forward, forward, forward-side-drag");
	   }
	}


Subclass-3
	public class Tango extends Dance
	{
	   public void playMusic()
	   {
		   System.out.println("Play music");
	   }
	   public void danceBasic()
	   {
		   System.out.println("Forward, forward, forward-side-drag");
	   }
	}


//	A.//Subclass-1 only
	B.	Subclass-2 only
	C.	Subclass-3 only
	D.	Subclass-2 and Subclass-3 only
	E.	Subclass-1, Subclass-2, and Subclass-3

/*********************************************************************************************************/

Questions 7 - 10 refer to the following interface, abstract class, and classes. 


	public interface CircusShow
	{
	   public void entrance();
	   public void act();
	   public void announcement();
	   public void performance();
	   public void exit();
	}


	public class Performer implements CircusShow
	{
	   public void entrance()
	   {
		   System.out.println("Performer enters arena in parade.");
	   }
	   public void act()
	   {
		   entrance();
		   announcement();
		   performance();
		   exit();
	   }
	   public void announcement()
	   {
		   System.out.println("Ringmaster announces performer entering arena.");
	   }
	   public void exit()
	   {
		   System.out.println("Performer receives flowers and leaves arena.");
	   }
	}
	public class Juggler extends Performer
	{
	   public void performance()
	   {
		   System.out.println("Performer juggles 4 knives.");
	   }
	}
	public class Equestrian extends Performer
	{
	   public void performance()
	   {
		   System.out.println("Performer rides standing on two ponies.");
	   }
	}
	public class LionTamer extends Performer
	{
	   public void performance()
	   {
		   System.out.println("Performer manages five lions in a cage.");
	   }
	}
	
/*********************************************************************************************************/

Question_07


What is true about the design of the previously shown program code? 


	I.	The Juggler, Equestrian, and LionTamer classes could implement the CircusShow directly, 
		without the use of the abstract Performer class. 


	II.	The Performer class is used for greater program writing efficiency


	III.The Performer class is necessary for using polymorphic methods. 


	A.	I only
	B.//II only
	C.	III only
//	D.	I and II only
	E.	II and III only
	

Answer:  D
Choice I is correct. The abstract class Performer is not absolutely necessary. Each of the three classes 
could implement CircusShow directly. However, it would mean that the same entrance(), act(), 
announcement(), and exit() methods would need to be duplicated in each of the three implementing classes. 

Choice II is also correct. By using the abstract class Performer, the methods that Juggler, Equestrian, 
and LionTamer all have in common only need to be written once. 

Choice III is not correct. While polymorphism can be facilitated with an abstract class, 
it can also be facilitated with an interface. 

/*********************************************************************************************************/

Question_08
Consider the following three code segments. 


	Segment-1
	Juggler sue = new Juggler();
	Equestrian tom = new Equestrian();
	LionTamer tarzan = new LionTamer();


	Segment-2
	Performer sue = new Juggler();
	Performer tom = new Equestrian();
	Performer tarzan = new LionTamer();


	Segment-3
	CircusShow sue = new Juggler();
	CircusShow tom = new Equestrian();
	CircusShow tarzan = new LionTamer();


Which of the three segments properly instantiates three new objects? 


	A.	I only 
	B.	II only
	C.	III only
	D.//I and II only
//	E.	I, II, and III
	
Answer:  E
Segment I is correct. It shows the usual way objects are declared and constructed. The class identifier 
and the constructor identifier are the same. 

Segment II is also correct. The class identifier does not have to match the constructor identifier. 
The class identifier can be the identifier of a superclass, even if the superclass is abstract. 

Segment III is also correct. The class identifier can actually be the identifier of an interface provided 
that the interface is implemented by the class (either directly or indirectly) whose constructor you are 
using to create the object. 

/*********************************************************************************************************/

Question_09
Consider the following code segment. 


	Performer sue = new Juggler();
	Performer tom = new Equestrian();
	Performer tarzan = new LionTamer();
	ArrayList<Performer> performers = new ArrayList<Performer>();
	performers.add(sue);
	performers.add(tom);
	performers.add(tarzan);
	for(Performer performer : performers)
	   performer.act();


Which of the following three programming concepts is used with this program? 


	I.	Implementing interfaces
	II.	Extending classes
	III.Polymorphism


	A.	I only
	B.	I and II only
	C.	I and III only
	D.	II and III only
//	E.//I, II, and III

/*********************************************************************************************************/

Question_10
Consider the following code segment. 


	CircusShow sue =  new Juggler();
	CircusShow tom = new Equestrian();
	CircusShow tarzan = new LionTamer();
	ArrayList<CircusShow> performers = new ArrayList<>();
	performers.add(sue);
	performers.add(tom);
	performers.add(tarzan);
	for(CircusShow performer: performers)
	   performer.act();


What is printed as a result of executing the code segment? 


//	A.//Performer enters arena in parade.
//	  //Ringmaster announces performer entering arena.
//	  //Performer juggles 4 knives.
//	  //Performer receives flowers and leaves arena.
//	  //Performer enters arena in parade.
//	  //Ringmaster announces performer entering arena.
//	  //Performer rides standing on two ponies.
//	  //Performer receives flowers and leaves arena.
//	  //Performer enters arena in parade.
//	  //Ringmaster announces performer entering arena.
//	  //Performer manages five lions in a cage.
//	  //Performer receives flowers and leaves arena.


	B.	Performer juggles 4 knives.
		Performer rides standing on two ponies.
		Performer manages five lions in a cage.


	C.	An ArrayIndexOutOfBoundsException error message


	D.	A compile error, indicating the objects are incorrectly instantiated


	E.	A compile error, indicating that generic data structures cannot be used with polymorphism.  
/*********************************************************************************************************/

Question_11

Consider the compDis interface and the partial implementation of the Distance class below. 

public interface compDis {
   /**
    * Tells the user which is greater - this object
    * or compared. Returns -1, 0, or 1 if the implicit
    * object (this object) is less than, equal to, or
    * greater than compared respectively.
    */
   double compare(Object compared);
}


public class Distance implements compDis
{
   private String units; //holds the measurement type
   private double distance;

   public Distance()
   {
       /*implementation not shown*/
   }
   public Distance(String units, double dist)
   {
       /*implementation not shown*/
   }
   public double compare(Object o)
   {
       /* implementation not shown */
   }

   public String toString()
   {
       /* implementation not shown */
   }

   //additional methods not shown

Here is a program that finds the greatest of 3 distances. 

public class GreatestDistance
{
   /* Which object is greater: a or b? */
   public static compDis great(compDis a, compDis b)
   {
       if(a.compare(b) < 0)
           return a;
       else
           return b;
   }

   /* Which object is the greatest of 3 objects? */
   public static compDis greatOf3(compDis a, compDis b, compDis c)
   {
       return great(great(a, b), c);
   }

   public static void main(String[] args)
   {
       /* code to test greatOf3 method */
   }
}

Which are correct replacements for /* code to test greatOf3 method */?

	I.	Distance d1 = new Distance("standard", 86.7);
		Distance d2 = new Distance("metric", 98.2);
		Distance d3 = new Distance("statndard", 54.3);
		System.out.println("The greatest distance is " + greatOf3(d1, d2, d3));
		 
		 
	II.	compDis d1 = new Distance("standard", 86.7);
		compDis d2 = new Distance("metric", 98.2);
		compDis d3 = new Distance("statndard", 54.3);
		System.out.println("The greatest distance is " + greatOf3(d1, d2, d3));

	III.compDis d1 = new compDis("standard", 86.7);
		compDis d2 = new compDis("metric", 98.2);
		compDis d3 = new compDis("statndard", 54.3);
		System.out.println("The greatest distance is " + greatOf3(d1, d2, d3));

	A.	II only
//	B.//I and II only
	C.	II and III only
	D.	I and III only
	E.	I, II, and III
