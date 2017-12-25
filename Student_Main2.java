/*package com.strose;

import java.util.Scanner;

public class Student_Main2
{
	public static void main(String[] args) 
	
{		
		 Scanner keyboard=new Scanner(System.in);
		//Student s1=new Student();
		
		System.out.println("==========================");
	    System.out.println("Student Information");
	    System.out.println("==========================");
	    
	    System.out.println("Enter your name: ");
	    String name = keyboard.nextLine();
	    
	    System.out.println("Enter your SSN: ");
	    String ssn = keyboard.nextLine();
	    
	    System.out.println("Enter your Course Completed: ");
	    int course_completed = keyboard.nextInt();
	    
	    System.out.println("Enter your Course Grades: ");
	    int course_grades = keyboard.nextInt();
	    
	    System.out.println("Enter your Course Credits: ");
	    int course_credits = keyboard.nextInt();
	  	
	    Student s1=new Student(name, ssn, course_completed, course_grades, course_credits);
		s1.show();
		
	 
	{	
		 Scanner keyboard=new Scanner(System.in);
		 Student students_Obj[];

	      //  System.out.println("How many name you want to enter:");
	        int num =3;
	        students_Obj = new Student[num];

	        for (int i=1; i<=num; i++) 
	        {
	        	
	    	    System.out.println("==========================");
	    	    
	        	System.out.println(" Enter Student Name:");
	            String name = keyboard.nextLine();
	            //students_Obj[i].setName(name);
	         
	            System.out.println(" Enter Your SSN:");
	            String ssn = keyboard.nextLine();
	            //students_Obj[i].setSsn(ssn);
	            
	            System.out.println("Enter your Course Completed:");
	            String course_completed = keyboard.nextLine();
	            //students_Obj[i].setCourse_completed(course_completed);
	            
	            System.out.println("Enter your Course Grades:");
	            String course_grades = keyboard.nextLine();
	            //students_Obj[i].setCourse_grades(course_grades);
	            
	            System.out.println("Enter your Course Credits:");
	            String course_credits = keyboard.nextLine();
	            //students_Obj[i].setCourse_credits(course_credits);
	            
	           
	            //Student s1=new Student(name, ssn,course_completed,course_grades,course_credits);
	            Student s1=new Student(name, ssn, course_completed,course_grades,course_credits);
		    	
	            s1.show();
		    	
	        } 
	       
	               
	}
}				
		Student s1=new Student("Harshad", "124545", 3, 80, 9) ;
		{
			System.out.println("Student Name:"+s1.getName()+"Student SSN:" +s1.getSsn()+"Student Grades:"+s1.getCourse_grades()+"Student Completed:" +s1.getCourse_completed()+"Student Credit:"+ s1.getCourse_credits());
		}

		Student s2=new Student("Rahul", "124545", 3, 80, 9) ;
		{
			System.out.println("Student Name:"+s2.getName()+"Student SSN:" +s2.getSsn()+"Student Grades:"+s2.getCourse_grades()+"Student Completed:" +s2.getCourse_completed()+"Student Credit:"+ s2.getCourse_credits());
		}

		
		Student s3=new Student("Asha", "124545", 3, 80, 9) ;
		{
			System.out.println("Student Name:"+s3.getName()+"Student SSN:" +s3.getSsn()+"Student Grades:"+s3.getCourse_grades()+"Student Completed:" +s3.getCourse_completed()+"Student Credit:"+ s3.getCourse_credits());
		}

*/