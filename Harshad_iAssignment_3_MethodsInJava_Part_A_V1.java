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

import java.util.*;
import java.lang.Math;

public class Harshad_iAssignment_3_MethodsInJava_Part_A_V1 // Create Class
{
	// Declared the Variables
	public double futureamount,futureamount1,futureamount2,presentamount,presentamount1,presentamount2;
	double interest,interest1,interest2,time,time1,time2,pastvalue,initialvalue;
	public double a,b,c;
	
	public void interest() // Declared Method
	{
		Scanner input = new Scanner(System.in); //Create a Scanner object to read input

		System.out.println("Enter the amount : "); // Display Message
		presentamount=input.nextInt();

		System.out.println("Enter interest rate : ");
		interest=input.nextInt();
		double i=interest/1200;

		System.out.println("Enter time period(in years) : ");
		time=input.nextInt();
		double n=time*12;

		futureamount=presentamount*(Math.pow(1+i,n));
		initialvalue=presentamount*(Math.pow(1+i,-n));  
	}
	public void displayAmount()
	{
		System.out.printf("Future value of Initial amount is : "+"%.2f",futureamount);
		System.out.printf("\nPresent value of Initial amount is : "+"%.2f",initialvalue);
	}

	public void annuity()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Amount : ");
		presentamount2=input.nextInt();

		System.out.println("Enter Interest Rate : ");
		interest2=input.nextInt();
		double i2=interest2/1200;
		System.out.println("Enter time period(in years) : ");
		time2=input.nextInt();
		double n2=time2*12;

		double x=Math.pow(1+i2,n2);
		double y=(x-1.00)/i2;
		a=x*y;
	}
	public void display1()
	{
		System.out.printf("Annuity amount is : " + "%.3f",a);
	}
}