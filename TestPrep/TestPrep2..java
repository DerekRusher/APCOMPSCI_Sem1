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

Question_09
Consider the following code segment and two classes


	Aardvark andy = new Aardvark();
	System.out.println(andy.getAnimalType());


	public class Animal
	{
	   private String animalType;
	   public Animal()
	   {
		   animalType = "Unknown";
	   }
	   public String getAnimalType()
	   {
		   return animalType;
	   }
	}


	public class Aardvark extends Animal
	{
	}


Which of the following are true statements about the Aardvark class?


I.	Aardvark is a superclass of Animal.
II.	Aardvark will have the exact same features and behaviors as the animal class
III.Aardvark objects have no access to any methods since the class declaration is empty. 


	A.	I only
//	B.//II only
	C.	III only
	D.	I and II
	E.	I and III
	
//Aardvark is a subclass of Animal, therefor I is wrong. III is wrong becuase Aardvark can only
//plug into one constructor for Animal, which makes II correct.

Answer: B 
Choice I is wrong because Aardvark is a subclass of Animal, not a superclass. 
Choice III is wrong because Aardvark will have access to all methods of Animal via 
inheritance. Choice II is the only correct statement. Since Aardvark is an empty class 
which inherits from Animal, an Aardvark object will have the same exact behavior as an 
Animal object. Remember, Aardvark did not re-define or newly-define any methods. 

/*********************************************************************************************************/

Use the following classes for Questions 10 and 11


	class Person
	{
	   public int age;


	   public Person()
	   {
		   System.out.println("Person Constructor");
		   age = 17;
	   }


	   public int getAge()
	   {
		   return age;
	   }
	}


	public class Student extends Person
	{
	   public int grade;
	   public Student(int g)
	   {
		   grade = g;
		   System.out.println("Student Constructor");
	   }
	   public int getGrade()
	   {
		   return grade;
	   }
	   public void showData()
	   {
		   System.out.println("Student's Grade is " + grade);
		   System.out.println("Student's Age is " + age);
	   }
	   public static void main(String[]args)
	   {
		   Student tom = new Student(12);
		   Person sue = new Person();
		   tom.showData();
	   }
	}
/*********************************************************************************************************/

Question_10
Considering the following code segment…


	Student tom = new Student(12);
	Person sue = new Person();
	tom.showData();


...what are the first 2 lines of output? 


//	A.//Person Constructor
	  //Student Constructor
		 
	B.	Student Constructor
		Person Constructor


	C.	Person Constructor
		Person Constructor


	D.	Student Constructor
		Student Constructor


	E.	No Output. 
		This program do does not compile. 
		
//The code would run through the student subclass, which relies on the superclass' constructor first,
//thus Person constructor would run first, then Student constructor would run after. All other lines
//come after.

Answer: A
The code segment shows the creation of a Student object, followed by the creation 
of a Person object. Many students would then conclude B would be the answer. What 
must be remembered is that anytime an object of a subclass is created, the 
superclass constructor is called first. Consider this: Before you can be enrolled as a 
student, you must first be born as a person. 

/*********************************************************************************************************/

Question_11
Considering the following code segment…


	Student tom = new Student(12);
	Person sue = new Person();
	tom.showData();


...what are the last 2 lines of output?


//	A.	Student’s Grade is 12
	  /*Student’s Age is 17*/


	B.//Student’s Age is 12
	  //Student’s Grade is 17


	C.	Student’s Age is 17
		Student’s Grade is 12 


	D.	Student Constructor
		Student’s Age is 17


	E.	Student Constructor
		Student’s Grade is 12
		
//The declaration of Student tom gives a grade of 12, printed first, and the Person
//constructor gives an age of 17, printed second in the showData class, and as showData
//is run last, those two lines appear last and B must be the answer.

Answer: A
Here, we know that tom.showData() is the last thing that is called, and that showData() 
has 2 print statements. Therefore, the last 2 lines of output are going to be the grade 
and age lines from showData(). We put in a parameter of 12 in the tom object, which 
gives is a grade of 12, and all Person objects get an age of 17. Therefore, A is the 
only answer that prints the Grade and Age in order, and has the correct numbers for each. 

Why I got it wrong: Has the correct explanation, simply selected the wrong answer in a moment of
					temporary insanity.

/*********************************************************************************************************/

Question_12
Considering the following code segment and two classes.


	Person sue = new Person(32);
	Student tom = new Student(12, 25);
	sue.showData();
	tom.showData();


	class Person
	{
	   public int age;


	   public Person(int a)
	   {
		   System.out.println("Person Constructor");
		   age = a;
	   }


	   public int getAge()
	   {
		   return age;
	   }
	   public void showData()
	   {
		   System.out.println("Student's Age is " + age);
	   }
	}


	public class Student extends Person
	{
	   public int grade;
	   public Student(int g, int a)
	   {
		   super(a);
		   grade = g;
		   System.out.println("Student Constructor");
	   }
	   public int getGrade()
	   {
		   return grade;
	   }
	   public void showData()
	   {
		   super.showData();
		   System.out.println("Student's Grade is " + grade);
	   }
	}


What are the last 2 lines of output? 


	A.	Student’s age is 32
		Student’s age is 25
		 
	B.	Student’s Age is 25
		Student’s Age is 32

	C.	Student’s Grade is 12
		Student’s Age is 25
		 
//	D.//Student’s Age is 25
	  //Student’s Grade is 12

	E.	No Output. 
		This program does not compile.
		
//Tom's show data is what prints last, and seeing as the call to super comes first and the
//data is entered and transfered correctly, Age comes first at 25 and grade comes second at
//12, making D the correct answer.

Answer: D
This is similar to 10 and 11. The difference is that The variable age is no longer a set 
value, but subject to input from the parameter, and is initialized in the Person 
constructor. Student objects should forward the parameter for age into the constructor for Person. 

/*********************************************************************************************************/



/*********************************************************************************************************/


