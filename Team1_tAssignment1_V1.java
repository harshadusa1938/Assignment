package com.strose;

import java.io.*; 
/*
 *Team Assignment 1
 *Authors-Harshad Patel
          Tushar Patel
          Mona Mittal
 *Date -  1/30/2017
 *In this Java program  all the uppercase and lowercase alphabetic characters are displayed, 
  the digits 0 through 9, and the symbols +, -, _, =, &, @, #, $, ?, >, <, |, !, ~,
  a blank space character as well as their ASCII integer value are displayed.
  */
          
//Define Class as a  Team1_Assignment1_v1.
public class Team1_tAssignment1_V1
{
	//Create a Main Method
	public static void main(String[] args) throws IOException
	{   
		//To print the alphabets in Lowercase
		System.out.println("Alphabets in Lower case :"); 
		for (char lower = 'a'; lower <= 'z'; lower ++) 
		{
			System.out.printf("%s ", lower ); //Print the Lower Case  for Alphabet             
		} 
		System.out.println("");

		//To print the alphabets in  uppercase
		System.out.println("Alphabets in Upper case :");  
		for (char uppper = 'A'; uppper <= 'Z'; uppper++) 
		{
			System.out.printf("%s ", uppper);// print the uppercase for Alphabet               
		}
		System.out.println("");

		//To print numbers from 0 t0 9
		System.out.println("Numbers from  0 to 9");  
		for (int num=0;num<=9;num++)
		{
			System.out.printf("%d ",num); // Print the Numbers from 0 to 9                
		}
		System.out.println("");

		//To print various symbols
		System.out.println("Symbols +, -, *, _, =, >, <, |, !, ~, &, @, #, $, ?");

		//To store ASCII values using Buffers
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter a character or number to get the ASCII value:");
		String str = buffer.readLine();// Read the Line for Buffer
		for ( int i = 0; i < str.length(); ++i )
		{
			char c = str.charAt(i); // Take a Datatype like char which take a single character or value
			int j = (int) c;                      
			System.out.println("ASCII OF "+c +" = " + j + ".");  // Print the ASCII value
		}
	}

}