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
Questions 13 - 22 refer to the Loan, CreditCard, and FinanceCar classes defined below:

	public class Loan
	{
		private double principal;
		private double interestRate;
		private double total;


		public Loan()
		{
			principal = 0.0;
			interestRate = 0.0;
			total = 0.0;
		}


		public Loan(double p, double rate)
		{
		   principal = p;
		   interestRate = rate;
		   total = p;
		}


		public void payment(double p)
		{  
			total -= p; 
		}


		public void Fees(double amt) //Add fees to the total
		{ 
			/*  implementation not shown  */  
		}


		public double amountOwed()
		{   
			return total;   
		}
	}


	public class CreditCard extends Loan
	{
		public CreditCard()
		{   
			/* implementation not shown */  
		}
		
		public CreditCard(double principal, double rate)
		{   
			/* implementation not shown */   
		}
	}


	public class FinanceCar extends Loan
	{
		private static final double GAP = 1000.0;
		private double value;


		public FinanceCar(double p, double rate, double v)
		{  
			/*  implementation not shown */  
		}


	   /** GAP insurance is added to the total if the loan
		*  total exceeds the value of the car */
		public void needGap()
		{
			/* implementation not shown */
		}
	}


/*********************************************************************************************************/

Question_13
Of the methods shown, how many different non-constructor methods can be invoked by a FinanceCar object? 


	A.	1
	B.	2
	C.	3
	D.//4
	E.	5
	
//Can implement needGap, payment, fees, and amountOwed.

/*********************************************************************************************************/

Question_14
Which of the following correctly implements the default constructor of the CreditCard class?


	I.	super();
		principal = 0
		interestRate = 0;
		total = 0;
 
	II.	super(p, r);
		total = p;


	III.super();


	A.	II only
	B.	I and II only
	C.	II and III only
	D.//III only
	E.	I, II, and III
	
//II invokes the non-default constructor, making it wrong. Therefor only D is left.



/*********************************************************************************************************/

Question_15
Which is a correct implementation of the constructor with parameters in the FinanceCar class? 


	A.	principal = p;
		interestRate = rate;
		value = v;


	B.	principal = super.amountOwed();
		interestRate = rate;
		v = value;


	C.//super(p, rate);
	  //value = v;


	D.	super(p, rate, v);
		 
	E.	super();
		value = v;
		
//A and B dont implement the constructor correctly becuase they enter in the variables manually
//instead of calling the superclass. E has no parameters, and D has too many parameters, thus
//C is the only answer choice left.



/*********************************************************************************************************/

Question_16
Which is a correct implementation of the CreditCard constructor? 


	A.	super();
		principal = p;
		interestRate = rate;


	B.	super(principal, rate);


	C.	super(principal, rate);
		value = v;


	D.//super();


	E.	super(principal)
		interestRate = rate;

//A should use the non-default constructor, and B, C, and E all use variables that have no values,
//so D is the only response left.		

/*********************************************************************************************************/

Question_17
Which is the correct implementation of the code for the needGap() method in the FinanceCar class? 


	A.	super.Fees(GAP);


	B.	if(super.amountOwed() > value)
		{
			Fees(GAP);
		}


	C.	if(super.principal > value)
		{
			Fees(GAP);
		}


	D.	GAP += amount;
		if(super.amountOwed() > value)
		{
			Fees(GAP);
		}


	E.//if(super.amountOwed() > value)
	  //{
	  //	super.Fees(GAP);
	  //} 
		
//A is wrong becuase even if the car is more then the loan, that code will run. Finance Car must make 
//a call to the super for both fees and amountOwed, so B and C are eliminated, and D is out becuase
//amount doesnt even exist, leaving E to be the answer.

/********************************************************************************************************/

Question_18
Consider the following declarations that will occur in a driver file 


	Loan l = new Loan(5000, 0.03);
	Loan c = new CreditCard(2000, 0.085);
	Loan fC = new FinanceCar(20000, 0.059, 25000);


Which method call will cause an error? 


	A.	c.payment(250);
	B.	l.Fees(40);
	C.	fC.Fees(GAP);
	D.//((FinanceCar)(fC)).needGap();
	E.	c.payment(100);
	
//A, B, C, and E shouldnt cause errors so D is the only one left. I dont know what D calls,
//but process of elimination ftw.

/********************************************************************************************************/

Question_19
Which of the following from our Loan, CreditCard, and FinanceCar classes is an example of polymorphism?


	A.	amountOwed()
	B.	payment()
	C.	Fees()
	D.//The constructors
	E.	Any call to super()
	
//super calls need to refer to another class, so E is wrong. A, B, and C are either all true or
//all false because they are all in the Loan class and all can be accessed by CreditCard and
//FinanceCar, and becuase only 1 answer is correct, A, B, and C are out. This leaves D to be
//the answer.

/********************************************************************************************************/

Question_20
The constructor in FinanceCar contains a call to super() with the parameters p and rate. 
When Java decides to use Loan’s constructor with parameters at compile time, this is an example of... 


	A.	Method overloading
	B.//Method overriding
	C.	Downcasting
	D.	Dynamic binding
	E.	Static binding
	
//I only know what B means, and seeing as the parameters for Loan are overridden, B seems correct.

/********************************************************************************************************/

Question_21
Consider the following declarations and method calls


	Loan ln = new Loan(5000, 0.03);
	FinanceCar fC = new FinanceCar(20000, 0.059, 25000);


	ln.Fees(40);
	fC.needGap();


There are 2 calls to Fees() above - one in the Loan object ln and one inside of the 
needGap() method called in the FinanceCar object fC. Java decides which 
implementation of the needGap() method to use at run time. This is an example of…


	A.	Method overloading
	B.	Method overriding
	C.	Downcasting
	D.//Dynamic binding
	E.	Static binding
	
//I only know what B means, and seeing as this has nothing to do with being overridden, B seems wrong.
//D sounds correct becuase dynamic means while moving or in movement and at run time Java makes
//the decision, sounding like D is correct.

/********************************************************************************************************/

Question_22
Consider the following declarations.


	Loan l = new Loan(5000, 0.03);
	Loan c = new CreditCard(2000, 0.085);
	FinanceCar fC = new FinanceCar(20000, 0.059, 25000);


Which of the above will cause a ClassCastException? 


	A.	((Loan)c).needGap();
	B.	((CreditCard)c).amountOwed();
	C.//((CreditCard)fC).payment(250);
	D.	((Loan)fC).Fees(40);
		((FinanceCar)fC).amountOwed(); 
		
//I have no idea what a ClassCast is, but a CreditCard class shouldnt be able to become a 
//FinanceCar class, so C seems wrong.

/********************************************************************************************************/