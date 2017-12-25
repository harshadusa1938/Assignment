package com.strose;
import java.util.Scanner; // Needed for the Scanner Class
/*
 *Team Assignment 2
 *Authors Harshad Patel
          Tushar Patel
          Mona Mittal
 *Date Created- 02/09/2017
 *In this program  the user is prompted to enter a monetary amount (in dollars and cents) as a double precision variable
  and then the monetary equivalent in dollars, quarters, dimes, nickels, and pennies is displayed.
  *Team1_Tassignment2_V1
  */         

public class Team1_Tassignment2_V1 // Class Name
{
	public static void main (String[] args)  // main method
	{	
		double DOLLAR,MONEY, QUARTERS, DIMES, NICKELS, PENNIES;  // Identifiers
		Scanner Scan = new Scanner (System.in);                  //Create a Scanner object to read input
		System.out.print ("Enter the monetary amount in xx.xx: "); // Prompt the user to enter the amount
		MONEY = Scan.nextDouble();

         // Calculation to convert the amount in dollars, quarters,Dimes, Nickels and Pennies
		 DOLLAR= MONEY % 100 /1;
		 QUARTERS = MONEY %100 %50 %20 %10 %5 %1 /0.25; 
		 DIMES = MONEY %100 %50 %20 %10 %5 %1 %0.25 /0.10;
		 NICKELS = MONEY %100 %50 %20 %10 %5 %1 %0.25 %0.10 /.05;
		 PENNIES = MONEY %100 %50 %20 %10 %5 %1 %0.25 %0.10 %.05 /.01;
		 
		 // Print statements for Dollar, Quarters, Dimes,Nickels and Pennies
		 System.out.println ((int) DOLLAR + " DOLLARS");
		 System.out.println ((int) QUARTERS + " QUARTERS");
		 System.out.println ((int) DIMES + " DIMES");
		 System.out.println ((int) NICKELS + " NICKLES");
		 System.out.println ((int) PENNIES + " PENNIES");
	}// end of main method
}// end of class