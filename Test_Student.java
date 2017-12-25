package assignment;

import java.util.Scanner;

public class Test_Student 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter Your First Score :");
		s1.marks1 = keyboard.nextInt();

		System.out.println("Enter Your Second Score :");
		s1.marks2 = keyboard.nextInt();

		System.out.println("Enter Your Third Score :");
		s1.marks3 = keyboard.nextInt();

		System.out.println("Your First Score is:"+s1.marks1);
		System.out.println("Your Second Score is:"+s1.marks2);
		System.out.println("Your Third Score is:"+s1.marks3);
		System.out.println("Your Total Score is:"+ s1.sum());
		System.out.println("Your Average is:"+s1.avg());
	}
}