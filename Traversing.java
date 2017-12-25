package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Traversing 
{
	public static void main(String[] args)
	{
		
		List<String> al=new ArrayList<String>();
		//Add Element
		al.add("Harsh");
		al.add("Rahul");
		al.add("Bitti");
		//al.add(2,"Asha");
		
		System.out.println("Array Elements:" + al);
		//System.out.println("2Nd Element:"+al.get(2));
		
		// Forward Iterator
		ListIterator<String>itr=al.listIterator(); 
		{
		while(itr.hasNext())
				{
					System.out.println("Forward Elements:"+itr.next());
			
				}
		};
		
		//Previous
		//ListIterator<String> itr1=al.listIterator();
		
		//{
			while(itr.hasPrevious())
			{
				//Object element=itr1.previous();
				System.out.println("Previos Elements Traversing:"+itr.previous());
			}
			
		//};
		
		
	}
}
