/* Author Name: Harshad Patel
 * Date:        01/18/2017
 * Description: Write a java program with full documentation which ask two numbers from the user and perform the following operation on the given numbers and display the result.
				- Add
				- Subtract
				- Divide
				- Multiple
				- and modulo
				- exit
				Make a menu for the asked example;  * */
//Declare the Package
package com.strose;

import java.util.Scanner;// Declared the Import 

public class Harshad_Assignment_0_V1 //Create the Class 
{
	public static void main(String[] args) // Main Method
	{
		int option; //Declared Variable
		// TODO Auto-generated method stub
		Scanner input = new Scanner((System.in));  // Create a Scanner object to read input
		System.out.println("Enter First Number:"); // Prompt the user to enter the Number
		int num1 = input.nextInt(); //Read the input in next

		System.out.println("Enter Second Number:"); // Prompt the user to enter the Number
		int num2 = input.nextInt(); //Read the input in next

		while (true) //While Loop for Choose in order to the Given Selection using Switch Case 
		{
			// Print the Selection Options.
			System.out.println("----------------------------");
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Subtract");
			System.out.println("Enter 3 for Multiply");
			System.out.println("Enter 4 for Divide");
			System.out.println("Enter 5 for Mod");
			System.out.println("Enter 6 to Exit");
			System.out.println("---------------");
			option = input.nextInt();
			switch (option) // Switch Case and choose the options
			{
			case 1:
				System.out.println("Add: " + (num1 + num2)); //Addition of Two Numbers
				break; //Statement Break.

			case 2:
				System.out.println("Subtrat: " + (num1 - num2)); //Subtraction of Two Numbers
				break;//Statement Break.

			case 3:
				System.out.println("Multiply : " + (num1 * num2)); //Multipl of Two Numbers
				break;//Statement Break.

			case 4:
				System.out.println("Divide: " + (num1 / num2)); //Divide of Two Numbers
				break;//Statement Break.

			case 5:
				int num3 = num1 % num2;
				System.out.println("Mod: " + num3); //Mod of Two Numbers
				break;//Statement Break.

			case 6:
			{
				System.exit(0); //Exit the System...
			}
			}
		}
	} //End Method
}// End Class
