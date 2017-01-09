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
	C.	0 1 3 
	D.	0 1 2 
	E.	1 3 5




