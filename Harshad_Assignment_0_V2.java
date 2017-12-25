/* Author Name: Harshad Patel
 * Date:        01/18/2017
 * Description: Write a java program with full documentation which ask two numbers from the user and perform the following operation on the given numbers and display the result.
				- Add
				- Subtract
				- Divid
				- Multiple
				- and mod
				- exit
				Make a menu for the asked example;  * */
//Declare the Package
package com.strose;
import java.util.Scanner;// Declare the import for scanner 

public class Harshad_Assignment_0_V2 // Create a Class
{
	public static void main(String[] args)// Main Method
	{
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);// Create a Scanner object to read input
		System.out.println("Enter The First Number:"); // Prompt the user to enter the amount
		int num1=input.nextInt(); //Read the input in next
		System.out.println("Enter The Second Number:");// Prompt the user to enter the amount
		int num2=input.nextInt();//Read the input in next
		int num3=num1%num2; 
		
		System.out.println("\nHere is the Resualt of Arithmentic Operation.:\n"); //Print the Simple Display Message 
		System.out.println("Add      :" +(num1+num2)); // Addition of Two Numbers
		System.out.println("Subtract :"+ (num1-num2)); // Subtraction of Two Numbers
		System.out.println("Divid    :" +(num1/num2)); // Division of Two Numbers
		System.out.println("Multiple :"+ (num1*num2)); // Multiple of Two Numbers
		System.out.println("Mod      :"+ num3 );       // Mod of Two Numbers
		
	}//End Main Method
}//End Class