package com.strose;

import java.util.Scanner;
//import javax.swing.*;

public class Assignment 
{

	private static Scanner s;

	public static void main(String[] args) 
	{
		int option;
		s = new Scanner((System.in));
		System.out.println("Enter First Number:");
		int num1=s.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2=s.nextInt();
	
		while(true)
		{
			System.out.println("----------------------------");
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Subtract");
			System.out.println("Enter 3 for Multiply");
			System.out.println("Enter 4 for Divide");
			System.out.println("Enter 5 for Mod");
			System.out.println("Enter 6 to Exit");
			System.out.println("---------------");
			option = s.nextInt();
     		switch(option)
			{
				case 1:
					System.out.println("Add: " + (num1+num2));
					break;
					
				case 2:
					System.out.println("Subtrat: " + (num1-num2));
					break;
					
				case 3:
					System.out.println("Multiply : " + (num1*num2));
					break;
					
				case 4:
					System.out.println("Divide: " + (num1/num2));
					break;
					
				case 5:
					int num3=num1%num2;
					System.out.println("Mod: " + num3);
					break;
					
				case 6:
				{
				System.exit(0);			
				}				
			}			
		}		
	}
}
