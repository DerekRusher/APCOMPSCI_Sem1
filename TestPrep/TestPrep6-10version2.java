GO BACK TO NUMBER 3


Question_01:
Which of the following correctly initializes an array one to contain four even
numbers (recall that 0 is an even number)? 

	I.	int[] one = {6, 4, 9, 2};
	II.	int[] one = new int[4];
	III.int[] one = new int[4];
		for(int i = 0; i < one.length; i++)
			one[i] = i;

	A.	I only
/*	B.//II only*/
	C.	I and III only
	D.	II and III only
	E.	I, II, and III
	
Answer: (B) 
Answer I should be obvious. It contains a single odd number and only 3 
even numbers, and therefore can’t be the correct answer. 
Answer III is incorrect, because it fills the array with {1, 2, 3, 4}, which is 2 
odd numbers and 2 even.  
Answer II is correct because the default value for a new array with 4 slots is 
{0, 0, 0, 0}. Since 0 is considered an even number, all values are technically even. 

/*********************************************************************************************************/

Question_02: 
The following program segment is intended to find the index of the first even 
number arry[0] ... arry[N-1], where arry is an array of N integers. 

	int i = 0;
	while(arry[i] % 2 != 0)
	   i++;
	location = i;

This segment will work as intended 
	A.	Always
	B.	Never
/*	C.//Whenever arry contains at least one even number.*/
	D.	Whenever arry contains at least one odd number. 
	E.	Whenever arry contains no even numbers. 

Answer: (C)
Remember that arry is an array of N integers. Since an array index starts at 
0, the top index in any array will always be 1 less than the total number of 
slots in the array. For example, if we have

int[] arry = {2, 3, 5, 7, 6, 8, 20};

We would have the following index
0 1 2 3 4 5 6
2 3 5 7 6 8 20

The 7 values in arry get indexed from 0 to 6. If arry contains any even
integers, the loop exits on the first one it finds because of the check
while(arry[i] % 2 != 0). 

However if arry contains only odd integers…
	int[] arry = {1, 3, 5, 7, 9};

The loop will continue to add 1 to i until the call to arry[i] throws an 
ArrayIndexOutOfBoundsException. 

	1.	Loop runs once: 		i = 0, add 1 to i
	2.	Loop runs twice: 		i = 1, add 1 to i
		. . . 
	3.	Loop runs N-1 times: 	i = N, add 1 to i
	4.	Loop runs N times: 	while(arry[i] % 2 != 0) 
												i is Out of bounds

When you run into questions like this, ask yourself how the loop will know 
when to stop. Is there an escape condition under all circumstances? In this 
case, there is only an escape condition if there are one or more even 
numbers in the list. 

How to fix: 
You need a nested loop to keep i from exceeding the value of N-1 in order to 
avoid an out of bounds error. For example you could write

	int i = 0;
	while(arry[i] % 2 != 0 && i < N - 1)
	   i++;
	location = i;
	System.out.println(location);

You have to use  i < N-1 in the loop in order to get the correct value for 
location because 1 is added to i after. 

/*********************************************************************************************************/

Question_03:
Refer to the following code segment. You may assume that arry is an array of int values. 

	int average = arry[0], i = 0;
	while(i < arry.length)
	{
	   i++;
	   average += arry[i];
	}
	average = average / arry.length;

Which of the following will be the result if the code above is executed? 

	A.//The average of arry[0], arry[1],..., arry[arry.length-1] will be stored in average. 
	B.	The average of arry[1], arry[2], ..., arry[arry.length-1] will be stored in average.
	C.	The average of arry[0], arry[1], ..., arry[arry.length] will be stored in average. 
	D.	An infinite loop will occur
/*	E.	An ArrayIndexOutOfBounds exception will occur*/ 

(i++ needs to be at the end)

Answer: (E) 
For this problem, you have to remember that an Array containing N values 
has a top index of N-1. This particular program attempts to calculate the 
average of all of the elements in the list. Although the while loop limits 
i to be < arry.length, the loop adds 1 to i before we add average += arry[i].  
This means that arry[0] will be skipped, and the final call to arry[i] 
will be out of bounds. 

Consider N to be arry.length

	1.	Loop runs once: 		i = 0, add 1 to i, add arry[1]to average
	2.	Loop runs twice: 		i = 1, add 1 to i, add arry[2] to average
		. . .

	3.	Loop runs N - 1 times: 		i = N - 1, add 1 to i, add arry[N] to average, which is Out of bounds by 1.

/*********************************************************************************************************/
		
Question_04:
Refer to the following code segment. You may assume that arry is an array of int values. 

	int average = arry[0], i = 0;
	while(i < arry.length)
	{
	   average += arry[i];
	}
	average = average / arry.length;

	A.	The average of arry[0], arry[1],..., arry[arry.length-1] will be stored in average. 
	B.	The average of arry[1], arry[2], ..., arry[arry.length-1] will be stored in average.
	C.	The average of arry[0], arry[1], ..., arry[arry.length] will be stored in average. 
/*	D.//An infinite loop will occur*/
	E.	An ArrayIndexOutOfBoundsException will occur
	
Answer: (D)
Remember: an infinite loop happens when there is no escape condition to 
exit a loop. In this particular program, there are no values for average or 
within arry that will prevent an infinite loop. The integer i starts at 0 and 
does not iterate up or down. Since i will always be < arry.length, the while 
condition will be true forever, and the loop will run until the computer runs 
out of memory. 

/*********************************************************************************************************/

Question_05:
Refer to the following code segment. You may assume that arrAy contains 
elements arrAy[0], arrAy[1],..., arrAy[N-1], where N == arrAy.length. 

	int count = 0;
	for (int i = 0; i < N; i++)
	   if (arrAy[i] % 2 != 0)
	   {
		   arrAy[count] = arrAy[i];
		   count++;
	   }
	int[] odds = new int[count];
	for(int i = 0; i < count; i++)
	   odds[i] = arrAy[i];

If arrAy initially contains the elements 1, 2, 3, 4, 5, 6, 7, 8 in this order, 
what will odds contain after execution of the code segment? 

/*	A.//1, 3, 5, 7*/
	B.	0, 0, 0, 0, 1, 3, 5, 7
	C.	1, 3, 5, 0, 0, 0, 7
	D.	1, 0, 3, 0, 5, 0, 7
	E.	1, 3, 5, 7, 0, 0, 0
	
Answer: (A) 
This program is much simpler than it seems. You can eliminate all of the 
incorrect answers by understanding that the Array odds will have a length of 
count that is equal to the number of odd values in arrAy. The first for loop 
counts the number of odd values in arrAy and holds that number in the 
variable count. odds starts out empty, and is filled with count number of 
values in the second loop. 

If you plug through the loop you can find that the correct numbers are there 
for answer A. But since we know that there are only 4 odd values in arrAy, 
we can determine that odds will have a length of 4 and eliminate all the 
other answers. 

But what if there were multiple answers with 4 values? 
Let’s pretend that we had more than one possible answer with the correct number of values for odds. 

	A.	0, 0, 0, 0
	B.	0, 0, 0, 0, 1, 3, 5, 7
	C.	1, 3, 5, 0, 0, 0, 7
/*	D.//1, 3, 5, 7*/
	E.	1, 3, 5, 7, 0, 0, 0
Refer to the following modified question: 

	int count = 0;
	for (int i = 0; i < N; i++)
	   if (arrAy[i] % 2 != 0)
	   {
		   arrAy[count] = arrAy[i];
		   count++;
	   }
	int[] odds = new int[count];
	for(int i = 0; i < count; i++)
	   odds[i] = arrAy[i];

Count = from 0 - 4		i = 0 - 8

                    0 1 2 3 4 5 6 7 
arrAy (before loop) 1 2 3 4 5 6 7 8
arrAy (after loop)  1 3 5 7 5 6 7 8
odds                1 3 5 7

Answer: 	(D)

First loop
Loop runs once: i = 0, count = 0, arrAy[0] = 1
arrAy[0] = 1, add 1 to count 
0 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8

Loop runs twice: i = 1, count = 1, arrAy[1] = 2
0 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8

Loop runs three times: i = 2, count = 1, arrAy[2] = 3
arrAy[1] = 3, add 1 to count 
0 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8

Loop runs four times: i = 3, count = 2, arrAy[3] = 4
0 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8

Loop runs five times: i = 4, count = 2, arrAy[4] = 5
arrAy[2] = 5, add 1 to count 
0 1 2 3 4 5 6 7
1 3 5 4 5 6 7 8

Loop runs six times: i = 5, count = 3, arrAy[5] = 6
0 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8

Loop runs seven times: i = 6, count = 3, arrAy[6] = 7
arrAy[2] = 5, add 1 to count 
0 1 2 3 4 5 6 7
1 3 5 7 5 6 7 8

Count = 4

Second Loop: 
0 1 2 3 
0 0 0 0

Loop runs once: i = 0
Set odds[0] to arrAy[0]
0 1 2 3 
1 0 0 0

Loop runs twice: i = 1
Set odds[1] to arrAy[i]
0 1 2 3
1 3 0 0


Loop runs three times: i = 2
Set odds[2] to arrAy[2]
0 1 2 3
1 3 5 0

Loop runs four times: i = 3
Set odds[3] to arrAy[3]
0 1 2 3
1 3 5 7

/*********************************************************************************************************/

Question_06(Modified - give full points for P5 and P7)
Consider this program segment: 
	for(int i = 1; i <= k; i+=2)
	   if(arrAy[i] % 10 == 7)
		   System.out.print("SMALL");

What is the maximum number of times that SMALL can be printed? 

	A.	0
	B.	1
	C.	k -1
	D.	k / 2 rounded up
	E.	k 

Answer: (C) 
The answer is k-1, but the format of the question does not fit the output. 
You will not see a question like this on the AP Exam or on the next test. 

/*********************************************************************************************************/

Question_07
What will be output from the following code segment, assuming it is in the 
same class as the printSome() method? 
	int[] arrAy = {10, 20, 30, 40};
	printSome(arrAy);
	System.out.print(arrAy[0] + " ");
	System.out.print(arrAy[1] + " ");
	System.out.print(arrAy[3] + " ");
				. . . 
	static void printSome(int[]lyst)
	{
	   int[]arrAy2 = lyst;
	   for(int i = 0; i < arrAy2.length; i++)
		   arrAy2[i] = i;
	}

	A.	0 0 0
	B.	1 2 3 
/*	C.//0 1 3*/
	D.	0 1 2 
	E.	1 3 5
	
	
Answer: (C) 
This one is simple if you can see that arrAy is changed by the printSome() method. 

arrAy , lyst, and arrAy2 are all objects. In Java, when you set two or 
objects equal to one another you are not setting them equal to the same values. 
 				
				Not doing this
			arrAy = {10, 20, 30, 40}
			lyst = {10, 20, 30, 40}
			arrAy2 = {10, 20, 30, 40}

You are actually telling Java to let these objects refer to the same data. To 
use the above code segment as an example, arrAy is passed into printSome() 
as a parameter, effectively setting the parameter lyst equal to arrAy.printSome() 
then sets arrAy2 = to lyst, which effectively means…

	arrAy2  = lyst = arrAy = {10, 20, 30, 40}

In other words, arrAy, lyst, and arrAy2 now all refer to the same values. 

Therefore, as printSome() changes the data values on arrAy2, they are 
changed for lyst and arrAy as well. 

arrAy[0], arrAy[1],arrAy[3] are printed by the print statement at the bottom.

/*********************************************************************************************************/

Question_08

The following code fragment is intended to find the smallest value in arrAy[0] . . . arrAy[n - 1]. 

	/** Precondition:
	*   -arrAy is an array, arrAy.length = n
	*   arrAy[0] . . . arrAy[n-1]initialized with integers.
	*   Postcondition: max = largest value in arrAy[0]
	*/
	int max = arrAy[0];
	int i = n - 1;

	while (i >= 0) 
	{
	   i--;
	   if(arrAy[i] > max)
		   max = arrAy[i];
	}

This code is incorrect. For the segment to work as intended, which of the 
following modifications could be made? 

	I.	Change the line 
			int i = n - 1;
			to
			int i = n;

		Make no other changes

	II.	Change the body of the while loop to 
			{
			if(arrAy[i] > max)
				   max = arrAy[i];
			i--;
			}

		Make no other changes

	III.Change the test for the while loop as follows:
			
			while (i > 0)

		Make no other changes


	A.	I ony
/*	B.//II only*/
	C.	III only 
	D.	I and II only
	E.	I, II, and III

Answer: (B) 
There are two problems with the segment as it’s given to us: 
	1.	arrAy [n-1] is not tested
	2.	i will eventually be incremented to -1, which will lead to an out of 
		bounds exception for the  if(arrAy[i] > max)  test

No matter what else is changed, the loop will eventually create an out of 
bounds exception because 1 is subtracted from i before the 
if(arrAy[i] > max) test in the loop. 

Even if you change the initial value of i like in answer I, the loop eventually 
is able to iterate down to -1 before if(arrAy[i] > max)  is checked. 

Changing the while loop to i > 0 will solve the out of bounds exception, but 
will prevent the loop from checking the value at position n - 1. If the 
greatest number is in that position, you could get inaccurate results. 

Answer II is the only real solution. The i-- is moved.

/*********************************************************************************************************/

Question_09
Which declaration will cause an error? 

	I.	List <Integer> numList = new ArrayList<>();
	II.	List <String> intList;
	III.ArrayList<boolean>compList = new ArrayList<boolean>();

	A.	I only
	B.	II only
/*	C.//III only*/
	D.	I and III only
	E.	II and III only
	
Answer: (C) 
Remember that you can declare a List as an ArrayList. III will cause an error, 
because ArrayLists can only contain objects, not primitive values. If you want 
to put boolean values into an ArrayList, you must use Boolean objects. 

	ArrayList<Boolean>compList = new ArrayList<Boolean>();
	
/*********************************************************************************************************/

Question_10(Modified - full points For P5 and P7)
Which of the following, when used as the /* body */ of method 
countDigits(), will enable that method to compute the number of 
digits for any number n?

		/** @param n a positive integer
		*  @return number of digits
		*/
		public int countDigits(int n)
		{
		   /* body */
		}

		I.	return 1 + countDigits(n / 10)

		II.	if (n > 0)
			   return 1 + countDigits(n / 10);
			return 0;

		III.if (n > 0)
			   return n + countDigits(n / 10);
			return 0;
					
	A.	I only
	B.//II only
	C.	III only
	D.	I and II only
	E.	I, II, and III

Answer: (B) 

Answer I is wrong because it has no escape condition for the the recursive 
loop. The loop will continue to return 1 + countDigits(n/10) until the 
computer runs out of memory. 

Answer III is wrong because it adds n to the return. The loop runs n number 
of times, which is appropriate, but it does not result in the correct number \
of digits. For Example, let’s examine the output if n = 325. 

countDigits(325) - returns 325 + countDigits(32)	returns 325 + 35 = 360
countDigits(32) - returns 32 + countDigits(3)		returns 32 + 3 = 35
countDigits(3) - returns 3 + countDigits(0)		returns 3
countDigits(0) - returns 0


Answer II is correct because it adds 1 to the return for each digit. Let’s try 
again with Answer II’s body using n = 3. 

countDigits(325) - returns 1 + countDigits(32)		returns 1 + 1 + 1 = 3
countDigits(32) - returns 1 + countDigits(3)		returns 1 + 1
countDigits(3) - returns 1 + countDigits(0)		returns 1
countDigits(0) - returns 0

/*********************************************************************************************************/

Question_11
Refer to the method stringRecur:
	public void stringRecur(String s)
	{
	   if(s.length() < 15)
		   System.out.println(s);
	   else
		   stringRecur(s + "*");
	}

When will method stringRecur terminate without error? 
/*	A.//Only when the length of the input string is less than 15*/
	B.	Only when the length of the input string is greater than or equal to 15
	C.	Only when an empty string is input
	D.	For all string inputs
	E.	For no string inputs

Answer: (A)  
The escape condition in the loop is if(s.length() < 15). If the length of the 
input string is not < 15 initially, the “*” will be added to s over and over,
only increasing the length of s. Since the length of s will never be < 15, 
the recursive loop will continue until the computer runs out of memory (runtime error). 

/*********************************************************************************************************/

Question_12
Refer to the method stringRecur:

	public String stringRecur(String s)
	{
	   if(s.length() < 15)
		   return s;
	   return stringRecur(s + "*");
	}


When will method stringRecur terminate without error? 
/*	A.//Only when the length of the input string is less than 15*/
	B.	Only when the length of the input string is greater than or equal to 15
	C.	Only when an empty string is input
	D.	For all string inputs
	E.	For no string inputs


Answer: (A)  
This is actually the same problem as Question_12. However, you must remember 
that a return exits a method. If the initial value of String s is < 15, 
the value of s is returned, which stops the loop and exits the method before 
the recursive call to stringRecur(). You do not need an else since the 
program never reads the recursive call. 

/*********************************************************************************************************/

Question_13
public int result(int n)
{
   if(n == 0)
       return 0;
   else
       return 3 + result(n / 10);
}

What value does result(5342) return? 
	A.	3
	B.	0
//	C.//12
	D.	15
	E.	4

Answer: (C) 
This question can be answered without plugging through the loop. You can see 
that the loop will run once for each digit in the value of n. Since an is an 
int, division by 10 will result in the removal of the right digit. This happens 
once for each digit until n == 0. Therefore, the loop runs n times. You can 
also see in the else statement that the loop will add 3 to the return value each it runs. 

Therefore, if the loop adds 3 to the return 4 times, the return will be 12

First run: 3 + result(534)	returns 12
2nd run: 3 + result(53)	returns 9
3rd run: 3 + result(5)		returns 6
4th run: 3 + result(0) 		returns 3

/*********************************************************************************************************/

Question_14
public int result(int n)
{
   if(n == 0)
       return 0;
   else
       return 1 + result(n - 1);
}

What value does result(8) return? 
/*	A.//8*/
	B.	0
	C.	4
	D.	1
	E.	Nothing. The code will produce an error. 

Answer: (A) 
You don’t need to complete the entire loop to answer this question. If you 
look carefully, you can see that the recursive loop will run n times, starting 
with n = 8 and returning n-1 until n = 0. Each time the loop runs, one is 
added to the return. If n = 8, 1 is added to the return 8 times, leaving a 
final return of 8. 

result(8): returns 1 + result(7)	returns 8
result(7): returns 1 + result(6)	returns 7
result(6): returns 1 + result(5)	returns 6
result(5): returns 1 + result(4)	returns 5
result(4): returns 1 + result(3)	returns 4
result(3): returns 1 + result(2)	returns 3
result(2): returns 1 + result(1)	returns 2
result(1): returns 1 + result(0)	returns 1
result(0): returns 0

/********************************************************************************************************/

Question_15
Refer to method nums: 

	public int shuffle(int x, int a, int b)
	{
	   if(x < 2)
		   return a;
	   else
		   return b + shuffle(x - 1, a, b);
	}

What value is returned by the call nums(2, 4, 6)? 
	A.	20
	B.	14
/*	C.//10*/
	D.	8
	E.	2
	
Answer: (C) 
You can determine the following without plugging through the loop: 
	1.	The loop will run 2 times, because we are starting with n = 2. The loop 
		starts with the value of n, and recursively calls nums with n-1 
		substituted for n until n < 2 or n == 1.
	2.	For n - 1 times, d is added to the return
			else
				return d + nums(n - 1, a, d);

	3.	Therefore, we add d to the return once
		Finally, we know that the last run of the loop will add 4 to the return, because a=4. 
			if(n < 2)
				   return a;


We end with a total of 1 * d + a, or 6 + 4 = 10. Take a look at the proof below. 

Loop runs once: 	
n = 2, a = 4, d = 6; returns 6 + nums(1, 4, 6)	returns 6 + 4 = 10
Loop runs twice: 	
n = 1, a = 4, d = 6; returns a				returns 4

/*********************************************************************************************************/

Question_16
Refer to method f:
		public int f(int k, int n)
		{
		   if(n == k)
			   return k;
		   else
			   if(n > k)
				   return f(k, n-k);
			   else
				   return f(k-n, n);
		}

What value is returned by the call f(6, 8)?
	A.	8
	B.	4
	C.	3
/*	D.//2*/
	E.	1

Answer: (D) 
This problem is easy to solve if you logically analyse what it does. To start, 
we evaluate if(n == k) if this is the case, we return k and the program exits. 

If not, we evaluate which int value is greater. 
	if(n > k)
		 return f(k, n - k);
		We recursively call f(k, n-k) until n == k
	else #if n < k
		 return f(k-n, n);
			We recursively call f(k-n, n) until n == k

Once we reach n == k, the value of n and k should be equal to the original 
difference between the two. 

f(6, 8) - returns f(6, 8 - 6)
f(6, 2) - returns f(6 - 2, 2)
f(4, 2) - returns f(4 - 2, 2)
f(2, 2) - k = 2, therefore we return 2

/*********************************************************************************************************/

Question_17
Consider the following declarations
	List<String> words = new ArrayList<String>();
	String space = " ";
	Integer num = new Integer(5);

	Which statement will cause an error? 
	A.	words.add(space);
	B.	words.add("Number: " + num );
	C.	words.add("" + num);
	D.	words.add(space + 8);
//	E.	words.add(num);

Answer: (E) 
E is incorrect, because it is attempting to add an Integer object to words. 

/*********************************************************************************************************/

Question_18
Consider the following declarations
	static List<Integer> numbers = new ArrayList<Integer>();
	static String space = " ";
	static String word = "Numbers:";


Which statement will cause an error? 
	A.//System.out.println(numbers);
	B.	System.out.println(word + space + numbers);
	C.	System.out.println("\"" + numbers + "\"");
	D.	numbers.add(8);
/*	E.	String nString = "" + numbers[0];*/
	
Answer: (E) 
If you look carefully you’ll notice that the error is not in the declaration itself, 
but in the call to numbers[0]. Since numbers is an ArrayList, you cannot call an 
index directly as you can with a regular Array. To make this call correctly, you 
would use the ArrayList.get() method. 
	String nString = "" + numbers.get(0);
	
/*********************************************************************************************************/

Question_19
Let numbers be an ArrayList<Integer> containing these elements: 
	2, 5, 7, 6, 0, 1
	
Which of the following statements would cause an error to occur? 
Assume that each statement applies to the given numbers, 
independent of the other statements. 

	A.	System.out.println(numbers);
	B.	System.out.println(numbers.get(5));
	C.	Integer intOb = numbers.get(4);
/*	D.//System.out.println(numbers.length);*/
	E.	numbers.set(5, 8);
	
Answer: (D)  
Answer D employs the Array.length property, which will work on any array. 
However, the length of an ArrayList is private, and can only be accessed 
using the ArrayList.size() method.
	System.out.println(numbers.size());

/*********************************************************************************************************/

Question_20
Refer to the method insert below: 

		/** @param list an ArrayList of String objects
		*  @param element a String object
		*  Precondition: list contains String values sorted
		*               in decreasing order.
		*  Postcondition: element inserted in its correct position in list
		*/
		public void insert(List <String> list, String element)
		{
		   int index = 0;
		   while(element.compareTo(list.get(index)) > 0)
			   index++;
		   list.add(index, element);
		}

If list contains the values "mouse", "house", "cat", "dog", "door" , 
which of the following values for element would produce an error? 


	A.	No word will produce an error
	B.	"bob"
//	C.	"zoo" 
	D.	Any word will produce an error
	E.	"0" 
