package com.strose;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main
{
	public static void main(String[] args) 
	{	

		Scanner keyboard = new Scanner(System.in);
		Student students_Obj[];

		//  System.out.println("How many name you want to enter:");
		int num =3;
		int marks;
		int numberoftests;int avg=0;

		students_Obj = new Student[num];

		for (int i=1; i<=num; i++) 
		{
			//System.out.println("==========================");
			System.out.println("Enter Student Name:");
			String name = keyboard.nextLine();
			//students_Obj[i].setName(name);

			System.out.println("Enter Your SSN:");
			String ssn = keyboard.nextLine();
			//students_Obj[i].setSsn(ssn);
			int k=3,k1;
			System.out.println("Enter your Course Completed");
			int course_completed=keyboard.nextInt();
			{
				k1 = k * course_completed;
			} 

			System.out.println("Enter Your Subjects:");
			int course_grades=keyboard.nextInt();
			int sum=0;
			int q=0;
			int grade=0;
			// int avg=0;
			int GPA=0;
			for(int a = 1; a<=course_grades; a++)
			{
				System.out.println("Enter your " +a+ " Marks:");
				q = keyboard.nextInt();
				ArrayList s = new ArrayList();
				s.add(q);
				sum=sum + q;

				avg = sum/course_grades;

				GPA= (avg*course_grades)/100;
				/// Student GPA
				//GPA=GPA + (avg*q)/100;
				//GPA=sum*q/100;
				//GPA_Total=GPA+;
				
				
				/*if(avg != 0)
	                System.out.print("Your Grade is ");
	                if(avg>80)
	                {
	                    System.out.print("A");
	                }
	                else if(avg>60 & avg<=80)
	                {
	                    System.out.print("B");
	                }
	                else if(avg>40 & avg<=60)
	                {
	                    System.out.print("C");
	                }
	                else
	                {
	                    System.out.print("D");
	                }
				 */    

				

			}

			//              System.out.println("Enter your Course Credits:");
			//	            String course_credits = keyboard.nextLine();

			//	            System.out.print("Enter Marks Obtained in 5 Subjects : ");
			//	               for(int j=0; j<=course_grades; j++)
			//	                {
			//	                	//course_grades[j] = keyboard.nextInt();
			//	                    //sum = sum + course_grades[j];

			//students_Obj[i].setCourse_grades(course_grades);
			//int course_grades;

			//	int j;	           
			//int course_grades[];
			//int i;
			// float sum=0, avg;
			//Scanner scan = new Scanner(System.in);

			// System.out.print("Enter Marks Obtained in 5 Subjects : ");
			/*    for(j=0; j<=course_grades; j++)
                {
                	course_grades[j] = keyboard.nextInt();
                    sum = sum + course_grades[j];
                }

                avg = sum/5;

                System.out.print("Your Grade is ");
                if(avg>80)
                {
                    System.out.print("A");
                }
                else if(avg>60 && avg<=80)
                {
                    System.out.print("B");
                }
                else if(avg>40 && avg<=60)
                {
                    System.out.print("C");
                }
                else
                {
                    System.out.print("D");
                }            	
			 */            	

			//	            System.out.println("Enter your Course Grades:");
			//	            int course_grades = keyboard.nextInt();
			//	            //students_Obj[i].setCourse_grades(course_grades);

			System.out.println("Enter your Course Credits:");
			String course_credits = keyboard.nextLine();
			//	            //students_Obj[i].setCourse_credits(course_credits);

			Student s1=new Student(name, ssn, course_completed,course_grades,course_credits);
			//s1.show();
			System.out.println("STUDENT Name: " + name);
			System.out.println("STUDENT SSN: " + ssn);
			System.out.println("STUDENT COMPLETED COURSE: " + course_completed);
			System.out.println("STUDENT COURSE GRADES: " + sum);
			System.out.println("STUDENT COURSE GRADES AVERAGE: " + avg);
			//System.out.println("STUDENT GPA:"+ GPA);
			System.out.println("STUDENT COURSE CREDITS: " + k1);
			//				
		} 
	}
}