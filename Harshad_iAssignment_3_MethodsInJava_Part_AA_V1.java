/* Author Name: Harshad Patel
 * Date:        02/14/2017
 * Description: Write a program that prompts the user to specify a financial function to use, then calculates and displays the appropriate value. Assume that interest compounds monthly, round money to the nearest penny, and use methods to for the four calculations. Use Math class functions as much as possible. The functions will help the user answer the following questions:

1. If you deposit P dollars in a savings account, how much money, F, would be in the account after n years? (Future Value of a Single Sum)
2. How much would you have to deposit in a savings account today, P, in order to have F dollars in the account after n years? (Present Value of a Single Sum)
3. If you made monthly deposits of A dollars in a savings account, how much money would be in the account after n years? (Future Value of an Annuity)
Formulas for performing the above calculations are as follows:
Future Value of a Single Sum: F = P * (1 + i)n
--------------------------------
There are Some equation
i = .05/12 = .004167, n = 2 * 12 = 24, P = 100
F = 100 * ( 1 + .004167 ) 24 = 100 * 1.10495 = $110.50 
---------------------------------*/

package com.strose;

import java.util.Scanner;

public class Harshad_iAssignment_3_MethodsInJava_Part_AA_V1 // Create the class
{
	public static void main(String[] args) // Declared the Main Method
	{
		int i; // Declare the Variable
		Scanner sc = new Scanner(System.in); //// Create a Scanner object to read input
		System.out.println("Select 1 for Future value & Present Value ");
		System.out.println("Select 2 for Annuity Amount ");
		System.out.println("Enter Your Choice: ");
		i=sc.nextInt();

		Harshad_iAssignment_3_MethodsInJava_Part_A_V1 interest_rate = new Harshad_iAssignment_3_MethodsInJava_Part_A_V1();

		switch(i)
		{  
		case 1:

			interest_rate.interest();
			interest_rate.displayAmount();
			break;

		case 2:

			interest_rate.annuity();
			interest_rate.display1();
			break;

		}
	}
}