package St_Rose;
/* Homework: Assignment-1
   Date: 09/16/2017
   Name: Harshad Patel
 */

public class Harshad_Assignement_1
{
 //Declare the Variables
 int number_Of_Items;
 int[] numbers_of_bag;
 
 // take a show method for Destination of the Target of Bags
	public int show(int destination)
	   {
		// Declare Variable 
	      int j = 0;
	      // For loop 
	      for (int i = 0; i < number_Of_Items - 1; i++)
	      {
	    	// Numbers of bags   
			if (numbers_of_bag[i] == destination)
	    	  {
				//Increment the numbers of bags
	    		  j++;
	    	  }
	      }
	      //Return value of j
	      return j;
	   } // end of method part

	// make a method for neglate, need to false and true
	public boolean neglate(int destination)
	   {
		//for loop for count the number of bags of that target
		for (int i = 0; i < number_Of_Items - 1; i++)
		  {
			  if (numbers_of_bag[i] == destination)
			  {
				  numbers_of_bag[i] = 0;
				  number_Of_Items--;
				  return true;
			  }
		  }
		  
		  return false;
	   } // End of Method
}
// End of the class