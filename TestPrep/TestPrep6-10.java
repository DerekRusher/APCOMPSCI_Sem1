//COME BACK TO THIS//COME BACK TO THIS//COME BACK TO THIS//COME BACK TO THIS//COME BACK TO THIS 
//---------------------------------------------7---------------------------------------------//


Question_01:
Which of the following correctly initializes an array arr to contain four elements each with a value of 0? 

	I.	int[] arr = {0, 0, 0, 0};
	II.	int[] arr = new int[4];
	III.int[] arr = new int[4];
		for(int i = 0; i < arr.length; i++)
		arr[i] = 0;

	A.	I only
	B.//III only
	C.	I and III only
	D.	II and III only
/*	E.	I, II, and III*/
	
Answer: 
(E) - Segment I is an initializer (an initialized list), with zeros at all 
positions. Segment II creates an array with 4 positions, which are filled with 
zeros by default. Segment III Creates the same array as Segment II, but 
with a for loop to fill it with zeros. The loop is not necessary, but is not 
incorrect. 

//POSITIONS ARE FILLED BY ZEROES BY DEFAULT

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_02: 
The following program segment is intended to find the index of the first
negative integer arr[0] ... arr[N-1], where arr is an array of N integers. 

	int i = 0;
	while(arr[i] >= 0)
		i++;
	location = i;

This segment will work as intended 
	A.//Always
	B.	Never
/*	C.	Whenever arr contains at least one negative integer.*/
	D.	Whenever arr contains at least one non-negative integer. 
	E.	Whenever arr contains no negative integers. 

Answer: 
(C) - If arr contains not negative integers, the value of i will eventually
exceed N-1, and arr[i] will cause an ArrayIndexOutOfBoundsException to be thrown. 

//LOOP WOULD MAKE i LONGER THEN THE ARRAY IF IT NEVER ENDS. WILL NOT END WITH NO NEGATIVES.

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_03:
Refer to the following code segment. You may assume that arr is an array of int values. 

	int sum = arr[0], i = 0;
	while(i < arr.length)
	{
		i++;
		sum += arr[i];
	}

	A.//Sum of arr[0], arr[1], ..., arr[arr.length-1] will be stored in sum
	B.	An infinite loop will occur
/*	C.	A runtime error will occur*/

Answer: 
(E) The intent is to sum elements arr[0], arr[1], … , arr[arr.length-1]. 
Notice, however, that when i has the value arr.length-1, it is incremented to 
arr.length in the loop, so the statement sum += arr[i] uses arr[arr.length], 
which is out of range. 

//THE FINAL VALUE OF ARR[i] DOES NOT ACCOUNT FOR WHEN I == ARR.LENGTH, 
//SO IT WOULD CREATE AN INDEXOUTOFBOUNDS ERROR

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_04:
Refer to the following code segment. You may assume that array arr1 contains
elements arr1[0], arr1[1],..., arr1[N-1], where N == arr1.length. 

	int count = 0;
	for (int i = 0; i < N; i++)
		if (arr1[i] != 0)
		{
			arr1[count] = arr1[i];
			count++;
		}
	int[] arr2 = new int[count];

	for(int i = 0; i < count; i++)
		arr2[i] = arr1[i];

If array arr1 initially contains the elements 0, 6, 0, 4, 0, 0, 2 in this order,
what will arr2 contain after execution of the code segment? 

/*	A.	6, 4, 2*/
	B.	0, 0, 0, 0, 6, 4, 2
	C.	6, 4, 2, 4, 0, 0, 2
	D.	0, 6, 0, 4, 0, 0, 2
	E.	6, 4, 2, 0, 0, 0, 0
	
Answer: 
(A) The code segment has the effect of removing all occurrences of 0 from 
array arr1. Then the nonzero elements are transferred to array arr2.

//FOR LOOP WASA CONFUSING, ASSUME IT ENDS AFTER THE IF CLOSES.

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_05
Consider this program segment: 
	for(int i = 2; i <= k; i++)
		if(arr[i] < someValue)
			System.out.print("SMALL");

What is the maximum number of times that SMALL can be printed? 

	A.	0
	B.	1
/*	C.//k - 1*/
	D.	k - 2
	E.	k

Answer: 
(C) If arr[i] < someValue for all i from 2 to k, SMALL will be printed on each 
iteration of the for loop. Since there ar k - 1 iterations, the maximum 
number of times that SMALL can be printed is k - 1. 

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_06
What will be output from the following code segment, assuming it is in the
same class as the doSomething method? 

	int[] arr = {1, 2, 3, 4};
	doSomething(arr);
	System.out.print(arr[1] + " ");
	System.out.print(arr[3]);
				. . . 
	public void doSomething(int[] list)
	{
	   int[] b = list;
	   for(int i = 0; i < b.length; i++)
		   b[i] = i;
	}
	
	A.	0 0 
	B.//2 4 
	C.	1 3
	D.	0 2 
	E.	2 3

Answer: 
(C) Array arr is changed by doSomething()

//doSomething CHANGES arr FROM 1 2 3 AND 4 TO 0 1 2 3

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_07: 
The following code fragment is intended to find the smallest value in arr[0]... arr[n-1]. 

//Precondition: arr[0]...arr[n-1] initialized with integers
//arr is an array, arr.length = n;
//Postcondition: min = smallest value in arr[0]...arr[n-1]  

	int min = arr[0];
	int i = 1;
	while (i < n)
	{
		i++;
		if(arr[i] < min)
			min = arr[i];
	}

The code is incorrect. For the segment to work as intended, which of the
following modifications could be made? 

I.	Change the line
	int i = 1;

	To 

	int i = 0 

	Make no other changes.
 
II.	Change the body of the while loop to

	{
		if(arr[i] < min)
			min = arr[i];
	}
	i++;

	Make no other changes

III.Change the while loop as follows: 

 	While (i <= n )

	Make no other changes.
	
	
A.//I only
B.	II only
C.	III only 
D.	I and II only
E.	I, II, and III

Answer:
(B) There are two problems with the segment as given: 
	1. arr[1] is not tested. 
	2. When i has a value of n-1, incrementing i will lead to an out-of-range 
	error for the if(arr[i] < min) test. 

//COME BACK TO THIS
	
	
/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_08
Refer to the method match below: 

/* @param v an array of int sorted in increasing order
*  @param w an array of int sorted in increasing order
*  @param N the number of elements in array v
*  @param M the number of elements in array w
*  @return true if there is an integer k that occurs
*  in both arrays; otherwise returns false
*  Precondition:
*      v[0]..v[N-1] and w[0]..w[M-1] initialized with integers.
*      v[0] < v[1] < .. < v[N-1] and w[0] < w[1] .. < w[M-1].
*/
public static boolean match(int[] v, int[] w, int N, int M)
{
   int vIndex = 0, wIndex = 0;
   while (vIndex < N && wIndex < M)
   {
       if(v[vIndex] == w[wIndex])
           return true;
       else if(v[vIndex] < w[wIndex])
           vIndex++;
       else wIndex++;
   }
   return false;
}

Assuming that the method has not been exited, which assertion is true at the
end of every execution of the while loop? 

/*	A.	V[0] .. v[vIndex-1] and w[0] .. w[wIndex-1] contain one common 
		value, vIndex <= N and wIndex <= M.*/
	B.//V[0] .. v[vIndex] and w[0] .. w[wIndex] contain one common value, 
	  //vIndex <= N and wIndex <= M. 
	C.	V[0] .. v[vIndex-1] and w[0] .. w[wIndex-1] contain one common 
		value, vIndex <= N-1 and wIndex <= M-1.
	D.	V[0] .. v[vIndex] and w[0] .. w[wIndex] contain one common value, 
		vIndex <= N-1 and wIndex <= M-1.
	E.	V[0] .. v[N-1] and w[0] .. w[M-1] contain one common value, 
		vIndex <= N and wIndex <= M.

Answer: 
(A)  Notice that either vIndex or wIndex is incremented at the end of the 
loop. This means that, when the loop is exited, the current values of 
v[vIndex] and w[wIndex] have not been compared. Therefore, you can only 
make an assertion for values v[0] .. v[vIndex - 1] .. w[wIndex - 1]. Also, 
notice that if there is no common value in the arrays, the exiting condition 
for the while loop will be that the end of the on of the arrays has been 
reached, namely vIndex equals N or wIndex equals M. 
/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_09
Which declaration will cause an error? 
I.	List <String> stringList = new ArrayList<String>();
II.	List <int> intList = new ArrayList<int>();
III.ArrayList<String>compList = new ArrayList<String>();

A.	I only
B.	II only
C.//III only
D.	I and III only
E.	II and III only

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_10
Which of the following, when used as the /* body */ of method sum, will
enable that method to compute 1 + 2 + ... + n correctly for any n > 0?

	/* @param n a positive integer
	*  @return 1 + 2 + ... + n
	*/
	public int sum(int n)
	{
	   /* body */
	}

	I.	return n + sum(n-1);
			
	II.	if(n == 1)
		   return 1;
		else
		   return n + sum(n - 1)
			
	III.if(n == 1)
		   return 1;
		else
		   return sum(n) + sum(n - 1);

A.	I only
B.	II only
C.	III only
D.//I and II only
E.	I, I, and III

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/
Question_10.5

Refer to the method stringRecur:
	public void stringRecur(String s)
	{
	   if(s.length() < 15)
		   System.out.println(s);
	   stringRecur(s + "*");
	}

When will method stringRecur terminate without error? 
A.	Only when the length of the input string is less than 15
B.	Only when the length of the input string is greater than or equal to 15
C.	Only when an empty string is input
D.//For all string inputs
E.	For no string inputs

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Questions 11 and 12 refer to method result: 

public int result(int n)
{
   if(n == 1)
       return 2;
   else
       return 2 * result(n - 1);
}

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_11
What value does result(5) return? 
A.	64
B.//32
C.	16
D.	8
E.	2

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_12
If n > 0, how many times will result be called to evaluate result(n) (including the initial call)? 
A.	2
B.	2^n
C.//n
D.	2n
E.	n^2

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_13
Refer to method mystery:
	
	public int mystery(int n, int a, int d)
	{
	   if(n == 1)
		   return a;
	   else
		   return d + mystery(n - 1, a, d);
	}


What value is returned by the call mystery (3, 2, 6)? 
A.	20
B.//14
C.	10
D.	8
E.	2

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_14
Refer to method f:
	public int f(int k, int n)
	{
	   if(n == k)
		   return k;
	   else
		   if(n > k)
			   return f(k, n - k);
		   else
			   return f(k-n, n);
	}
What value is returned by the call f(6, 8)?
A.	8
B.	4
C.	3
D.//2
E.	1

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_15
What does method recur do? 
	/** @param x an array of n integers
	*  @param n a positive integer        
	*/
	public int recur(int[] x, int n)
	{
	   int t;
	   if(n == 1)
		   return x[0];
	   else
	   {
		   t = recur(x, n - 1);
		   if(x[n-1] > t)
			   return x[n-1];
		   else
			   return t;
	   }

A.//It finds the largest value in x and leaves x unchanged
B.	It finds the smallest value in x and leaves x unchanged
C.	It sorts x in ascending order and returns the largest value in x. 
D.	It sorts x in descending order and returns the largest value in x. 
E.	It returns x[0] or x [n-1], whichever is larger. 

Answer: 
(A) If there is only one element in x, then recur return that element. Having 
the recursive call at the beginning of the else part of the algorithm causes 
the if part for each method call to be stacked until t eventually gets assigned 
to x[0]. The pending if statements are then executed and t is compared to 
each element in x. The largest value in x is returned. 

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_16
Consider the following declarations
	static List<String> strList = new ArrayList<String>();
	static String ch = " ";
	static Integer intOb = new Integer(5);

	Which statement will cause an error? 
	A.	strList.add(ch);
	B.	strList.add(new String("handy andy"));
	C.	strList.add(intOb.toString());
	D.	strList.add(ch + 8);
	E.//strList.add(intOb + 8);

Answer: 
(E) All elements added to strList must be of type String. Each choice satisfies 
this except choice E. Note that in choice D, the expression ch + 8 becomes a 
String since ch is a String (just one of the operands needs to be a String to 
convert the whole expression to a String). In choice E, neither intOb nor 8 is 
a String

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_17
Let list be an ArrayList<Integer> containing these elements: 
	2, 5, 7, 6, 0, 1
	
Which of the following statements would not cause an error to occur? 
Assume that each statement applies to the given list, independent of the 
other statements. 

	A.	Object ob = list.get(6);
	B.	Integer intOb = list.add(3.4);
	C.//list.add(6, 9);
	D.	Object x = list.remove(6);
	E.	Object y = list.set(6, 8);

Answer: 
(C) The effect of choice C is to adjust the size of the list to 7 and to add the 
Integer 9 to the last slot (i.e., the slot with index 6). Choices A, D, and E will 
all cause an IndexOutOfBoundsException because there is no slot with index 
6: the last slot has index 5. Choice B will cause a compile-time error, since it
is attempting to add an element of type Double to a list of type Integer. 
	
/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_18
Refer to the method insert below: 
	/** @param list an ArrayLis of String objects
	*  @param element a String object
	*  Precondition: list contains String values sorted
	*               in decreasing order.
	*  Postcondition: element inserted in its correct position in list
	*/
	public void insert(List <String> list, String element)
	{
	   int index = 0;
	   while(element.compareTo(list.get(index)) < 0)
		   index++;
	   list.add(index, element);
	}

Answer: 
(D) If element is smaller than the last item in the list, it will be compared 
with every item in the list. Eventually index will be incremented to a value 
that is out of bounds. To avoid this error, the test in the while loop should be 


	while(index < list.size() &&
		   element.compareTo(list.get(index)) < 0);



/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/