Question_01:
Which of the following correctly initializes an array arr to contain four elements each with a value of 0? 

  I.	int[] arr = {0, 0, 0, 0};
 II.	int[] arr = new int[4];
III.	int[] arr = new int[4];
		for(int i = 0; i < arr.length; i++)
		arr[i] = 0;

A.	I only
B.//III only
C.	I and III only
D.	II and III only
E.	I, II, and III

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
C.	Whenever arr contains at least one negative integer. 
D.	Whenever arr contains at least one non-negative integer. 
E.	Whenever arr contains no negative integers. 

Answer: 
(C) - If arr contains not negative integers, the value of i will eventually
exceed N-1, and arr[i] will cause an ArrayIndexOutOfBoundsException to be thrown. 

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
C.	A runtime error will occur	

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

6, 4, 2
0, 0, 0, 0, 6, 4, 2
6, 4, 2, 4, 0, 0, 2
0, 6, 0, 4, 0, 0, 2
6, 4, 2, 0, 0, 0, 0

/*WHERE DOES FOR LOOP END?*/

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_05
Consider this program segment: 
	for(int i = 2; i <= k; i++)
		if(arr[i] < someValue)
			System.out.print("SMALL");

What is the maximum number of times that SMALL can be printed? 

A.	0
B.	1
C.//k - 1
D.	k - 2
E.	k

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

//output: 2 4

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

A.	V[0] .. v[vIndex-1] and w[0] .. w[wIndex-1] contain one common value, vIndex <= N and wIndex <= M. 
B.//V[0] .. v[vIndex] and w[0] .. w[wIndex] contain one common value, vIndex <= N and wIndex <= M. 
C.	V[0] .. v[vIndex-1] and w[0] .. w[wIndex-1] contain one common value, vIndex <= N-1 and wIndex <= M-1.
D.	V[0] .. v[vIndex] and w[0] .. w[wIndex] contain one common value, vIndex <= N-1 and wIndex <= M-1.
E.	V[0] .. v[N-1] and w[0] .. w[M-1] contain one common value, vIndex <= N and wIndex <= M.

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

