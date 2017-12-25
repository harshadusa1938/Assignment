package com.strose;



public class Recursion
{
  public static int calc(int n)
  {
  
    if(n == 0)
    {
      return 1;
    }
  
    int temp = 10 + calc(n-1);
    
    return temp;
  }
  
  public static void main(String[] args)
  {
    int result = calc(2);       // kicks off the recursive function
    System.out.println(result); // prints 21
  }
}