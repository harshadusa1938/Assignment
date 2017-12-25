package com.strose;
import java.util.Scanner;

public class Student// Create Student Class
{
	public String name;
	public String ssn;
	public int course_completed;
	public int course_grades;
	public String course_credits;

	//Create Constructor
	public Student(String name,String ssn,int course_completed,int course_grades,String course_credits)

	{
		this.name=name;
		this.ssn=ssn;
		this.course_completed=course_completed;
		this.course_grades=course_grades;
		this.course_credits=course_credits;
	}//end of constructor


		//Create a Getter and Setter Method..
		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public String getSsn()
		{
			return ssn;
		}

		public void setSsn(String ssn)
		{
			this.ssn = ssn;
		}

		public int getCourse_completed() 
		{
			return course_completed;
		}

		public void setCourse_completed(int course_completed) 
		{
			this.course_completed = course_completed;
		}

		public int getCourse_grades()
		{
			
			
			return course_grades;
		}

		public void setCourse_grades(int course_grades) 
		{
			this.course_grades = course_grades;
		}

		public String getCourse_credits() 
		{
			return course_credits;
		}

		public void setCourse_credits(String course_credits) 
		{
			this.course_credits = course_credits;
		}

		public void show()
		{
			//System.out.println("This is Student main method");
			
		}
	}//end class
