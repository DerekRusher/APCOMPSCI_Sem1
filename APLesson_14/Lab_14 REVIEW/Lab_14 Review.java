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


	A.	I only
	B.//II only
	C.	III only
	D.	I and II only 
	E.	I, II, and III
	
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


	E.//A compile error message, due to not implementing a method that was declared in the interface. 

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
		 
	D.	A compile error message, due to improperly using an attribute (instance variable) in the interface. Public Stri
		 
	E.	A compile error message, due to implementing a method that was not declared in the interface.  
	
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


	C.//The Great Ivan parades with performers
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
	E.	Waltz, ChaCha, and Tango

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


	A.//Subclass-1 only
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


	III.The Performer abstract class is necessary for using polymorphic methods. 


	A.	I only
	B.	II only
	C.	III only
	D.	I and II only
	E.	II and III only

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
	D.	I and II only
	E.	I, II, and III

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


	I.	Implementing abstract interface
	II.	Extending abstract class
	III.Polymorphism


	A.	I only
	B.	I and II only
	C.	I and III only
	D.	II and III only
	E.	I, II, and III

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


	A.	Performer enters arena in parade.
		Ringmaster announces performer entering arena.
		Performer juggles 4 knives.
		Performer receives flowers and leaves arena.
		Performer enters arena in parade.
		Ringmaster announces performer entering arena.
		Performer rides standing on two ponies.
		Performer receives flowers and leaves arena.
		Performer enters arena in parade.
		Ringmaster announces performer entering arena.
		Performer manages five lions in a cage.
		Performer receives flowers and leaves arena.


	B.	Performer juggles 4 knives.
		Performer rides standing on two ponies.
		Performer manages five lions in a cage.


	C.	An ArrayIndexOutOfBoundsException error message


	D.	A compile error, indicating the objects are incorrectly instantiated


	E.	A compile error, indicating that generic data structures cannot be used with polymorphism. 
	/*********************************************************************************************************/