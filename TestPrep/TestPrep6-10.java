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

A./*Change the line
	int i = 1;

	To 

	int i = 0 

	Make no other changes.
  */
B.	Change the body of the while loop to

	{
		if(arr[i] < min)
			min = arr[i];
	}
	i++;

	Make no other changes

C.	Change the while loop as follows: 

 	While (i <= n )

	Make no other changes.

/**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//**//*****/

Question_05:
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