package com.strose;

import java.util.*; //import statement

/*
 *Team Assignment 1
 *Authors-Harshad Patel
          Tushar Patel
          Mona Mittal
 *Date -  18/4/2017
 *tAssignment-5: tortoise and hare race
This project involves writing a program to simulate a tortoise and hare race. 
The contenders will each race along a horizontal course that contains at least 50 squares.
You may add more if you wish. The race begins with each contender at square 1. 
The contender that first reaches or passes the last square of the course is the winner of the race
  */
public class k
{ //start of the class
public static void main(String []args){ //main method
int finish=70,tort=1,hare=1,rtime=0;//initializing the variables
System.out.println("ON YOUR MARK, GET SET\nBANG !!!!!\nAND THEY'RE OFF !!!!!\n");//print statement
do //do while loop
{hare=movehare(hare); //hare
tort=movetort(tort);  //tort
print(tort,hare); //print 
rtime++;
}while(tort<finish&&hare<finish);//end of do while loop
if(tort>hare ) //if statement
    System.out.println("TORTOISE WINS!!! YAY!!!\n"); //print statement if tortoise wins
else if(tort<hare ) //else if
    System.out.println("Hare wins. Yo Yo. \n"); //pint statement if hare wins
else //else
    System.out.println("Would you believe IT\'S A TIE!!\n"); //print statement if its a tie
System.out.println("time of race: "+rtime+" simulated seconds\n"); //print statement for the time of the race
}
public static void print(int t,int h) 
{int i;
if(h==t) //if statement
    {for(i=0;i<h;i++) //for loop
          System.out.print(" "); //print statement
    System.out.println("OUCH!!!"); //prints statement
    }   
else if(h<t) //else if
    {for(i=0;i<h;i++) //for loop
          System.out.print(" "); //print statement
     System.out.print("H");//print H
    for(i=0;i<(t-h);i++)  //for loop
          System.out.print(" ");//print
     System.out.print("T");//print T
    }
else
   {for(i=0;i<t;i++) //FOR LOOP
          System.out.print(" ");//print
     System.out.print("T"); //print T
    for(i=0;i<(h-t);i++) //for loop
          System.out.print(" ");//print
     System.out.print("H"); //print H
    }
System.out.println(); //leave a blank line
}
public static int movehare(int r )  //start of the method
{int num;
num=(int)(Math.random()*10);//random move
if(num<2)  // if statement
     r-=2;
else if(num<5) // else if statement
      r++;
else if(num<6) // else if statement
      r-=12;
else if(num<8)// else if statement
      r+=9;
if(r< 1 ) // if statement
      r=1;
return r;
}
public static int movetort(int t) //move tort method
{int num;
num=(int)(Math.random()*10); //random move
if(num<5) // if statement
   t+=3;
else if(num<7)// else if statement
   t-= 6;
else // else statement
    t++;
if(t<1) // if statement
   t=1;
return t;
}
}//end of the class