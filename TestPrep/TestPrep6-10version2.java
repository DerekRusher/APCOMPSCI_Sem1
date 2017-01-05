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

The average of arry[0], arry[1],..., arry[arry.length-1] will be stored in average. 
The average of arry[1], arry[2], ..., arry[arry.length-1] will be stored in average.
The average of arry[0], arry[1], ..., arry[arry.length] will be stored in average. 
An infinite loop will occur
An ArrayIndexOutOfBoundsException will occur
