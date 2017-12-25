package Extra;

import java.util.*;

public class Traversing 
{

	public static void main(String[] args)
	{
		
		ArrayList<String> al=new ArrayList<String>();
		//Add Element
		al.add("Harsh");
		al.add("Rahul");
		al.add("Bitti");
		al.add(1,"Asha");
		
		System.out.println("2Nd Element:"+al.get(2));
		
		// Forward Iterator
		ListIterator<String>itr=al.listIterator(); 
		
		while(itr.hasNext())
				{
					System.out.println("Forward Elements:"+itr.next());
			
				}
			
		
		
		System.out.println("\nPrevios Elements Traversing:");
			while(itr.hasPrevious())
			{
				
				System.out.println("Previos Elements Traversing:"+itr.previous());
			}
			
		
		
		
	}
}
