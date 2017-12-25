package com.strose;
import java.util.Scanner;
/*
 	Authors-Harshad Patel
	Date -  02/07/2017
	1) replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10.
	2) Then swap the first digit with the 3rd, and swap 2 digit with the 4th.
	3) then print the encypted integer.
    Also write a seperate application that inputs an encrypted 4-digit integer and decrypts it (by reversing the encryption scheme) to form the original number.
*/

//Create Class as a  Team1_Assignment1_v1.
public class Harshad_Encryption_V1 
{
	public static void main(String[] args) // Main Method Define
	{
		// Declared Variable
		int num, decrypt1, decrypt2, decrypt3, decrypt4, encrypt; // Declared Variables
		do
		{   
			Scanner inp = new Scanner(System.in); // Create a scanner object to read input 
			System.out.println("Please Enter Four Digits to Encryption... "); //Print the Message

			num = inp.nextInt(); //Read the Input User in Next Line
		}
		while(num/1000 == 0 || num/10000 != 0); // Using While Loop

		decrypt1 = num/1000; 
		decrypt2 = num/100;
		decrypt3 = num/10;
		decrypt4 = num/1;

		decrypt1 = (decrypt1+7)%10;  
		decrypt2 = (decrypt2+7)%10;  
		decrypt3 = (decrypt3+7)%10;  
		decrypt4 = (decrypt4+7)%10;
		
		encrypt = decrypt1;  // Swiping
		decrypt1 = decrypt3; // Swiping
		decrypt3 = encrypt;  // Swiping

		encrypt = decrypt2;  
		decrypt2 = decrypt4;
		decrypt4 = encrypt;
		System.out.println("The Encrypted Number Before Swapping : "+decrypt1 + decrypt2 + decrypt3 + decrypt4); // Print Swiping with DEcrypted Numbers
		System.out.printf("The Final Encrypted Number is:" +decrypt3 + decrypt4 + decrypt1 + decrypt2); // Get the Result of DEcryped Numbers
		int a,x,y,z,w;   // Declared Variables     
		Scanner inp1 = new Scanner(System.in); // Create a Scanner object to read input
		System.out.println("\nEnter The Result after Encryption : "); //Print Simple Message  

		a=inp1.nextInt();    //Read the Input User in Next Line       
		x = a % 10;
		w = ( a / 10 ) % 10;                                                   
		
		//Description
		z = ( a / 100 ) % 10;
		y = ( a / 1000 ) % 10;

		if( w < 7 )
			w += 10;
		if( x < 7 )      
			x += 10;
		if( y < 7 )
			y += 10;
		if( z < 7 )
			z += 10;
		w -= 7;
		x -= 7;
		y -= 7;
		z -= 7;
		
		System.out.println("The Encrypted Number before Swappig : "+w+x+y+z); //Print the Swapping Number which is Encrypted 
		System.out.printf("The Encrypted Number is:" +y + z + w + x); //Final Result of the Encrypted..
		
	}//End Method
}// End Class