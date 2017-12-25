package assignment;

import java.util.Scanner;

public class Program1
{		
	public String animalName="";
	public String carName="";
	public String cityName="";
	public int totalAnimals=0;

	public Program1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of Animal : ");
		animalName =s.next();
		System.out.println("Enter name of Car : ");
		carName =s.next();
		System.out.println("Enter name of City : ");
		cityName =s.next();
		System.out.println("Enter number of Animals : ");
		totalAnimals =s.nextInt();
	}

	public String getFinalOutput()
	{
		return "The "+totalAnimals+" "+animalName+" drove their "+carName+" to "+cityName+".";
	}
}