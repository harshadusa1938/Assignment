/* Author Name: Harshad Patel
 * Date:        02/14/2017
 * Description: Write a program that prompts the user to enter integers in the range 1 to 50 and counts the occurrences of each integer. The program should also prompt the user for the number of integers that will be entered.
				As an example, if the user enters 10 integers (10, 20, 10, 30, 40, 49, 20, 10, 25, 10), the program output would be:
				10 occurs 4 times
				20 occurs 2 times
				25 occurs 1 time
				30 occurs 1 time
				40 occurs 1 time
*/

package com.strose;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Harshad_iAssignment_3_MethodsInJava_Part_B_V1 // Create the Class
{
	public static void main(String[] args)  // Declared Main Method
	{
		Map<Integer, Integer> counter = new HashMap<Integer, Integer>(); // Using the Hash map object 
		System.out.println("Please enter a number or 50 to quit"); // Print the Message

		Scanner input = new Scanner(System.in);// Create a Scanner object to read input

		while (input.hasNext())//while loop
		{
			int x = input.nextInt(); 
			if (x >= 0 && x <= 48) // If Statement
			{
				Integer val = counter.get(x);
				if(val == null){
					counter.put(x, 1);
				} else {
					counter.put(x, ++val);
				}
			} 
			else if(x >=30)
			{
				break;
			}
		}

		for(Integer key : counter.keySet())
		{
			System.out.println(key + " occured " + counter.get(key) + " times"); // Display the Occurence Values in the List and Count the Numbers
		}
	} // End Main Method

}// End Class