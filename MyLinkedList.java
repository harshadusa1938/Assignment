/* Name: Harshad Patel
  Homework: Assignment-2
  Developed Date: 25 Sep, 2017
 */

package Harshad_Assignment_2;


import java.util.*;

public class MyLinkedList<T>
{
	private Node<T> head;

	/**
	 * Inserts a new node at the beginning of this list.
	 *
	 */
	public void addFirst(T item)
	{
		System.out.println("------------Add First------------ >> " + item);
		head = new Node<T>(item, head);
	}

	/**
	 * Removes the first element in the list.
	 *
	 */
	public T removeFirst()
	{
		System.out.println("------------Remove First------------ >> ");
		
		if (head == null)
			throw new NoSuchElementException();

		T tmp = head.data;
		head = head.next;
		return tmp;
	}

	/**
	 * Inserts a new node to the end of this list.
	 *
	 */
	public void addLast(T item) 
	{
		System.out.println("------------Add Last------------ >> " + item);
		
		if (head == null)
			addFirst(item);
		else {
			Node<T> tmp = head;
			while (tmp.next != null)
				tmp = tmp.next;

			tmp.next = new Node<T>(item, null);
		}
	}
	
	public T removeLast()
	{
		System.out.println("------------Remove Last------------ >> ");
		
		if (head == null) {
			throw new NoSuchElementException();
		}
		
		Node<T> tmp = head;
		Node<T> ptmp = head;
		while (tmp.next != null)
		{
			ptmp = tmp;
			tmp = tmp.next;
		}
		
		ptmp.next = null;
		T data = tmp.data;
		tmp = null;
		
		return data;
	}

	public void listDisplay() 
	{
		System.out.println("------------Display-------------");
		
		Node<T> tmp = head;
		System.out.println(tmp.data);

		while (tmp.next != null)
		{

			System.out.println(tmp.next.data);

			tmp = tmp.next;
		}
		
	}

	/**
	 * Inserts a new node after a node containing the key.
	 *
	 */
	public void insert(T key, T toInsert)
	{
		System.out.println("------------Add------------ >> ( " + key +" -> " + toInsert + " )");
		
		Node<T> tmp = head;

		while (tmp != null && !tmp.data.equals(key))
			tmp = tmp.next;

		if (tmp != null)
			tmp.next = new Node<T>(toInsert, tmp.next);
	}

	/**
	 * Removes the first occurrence of the specified element in this list.
	 *
	 */
	public void remove(T key)
	{
		System.out.println("------------Remove------------ >> " + key);
		
		if (head == null)
			throw new RuntimeException("cannot delete");

		if (head.data.equals(key))
		{
			head = head.next;
			return;
		}

		Node<T> cur = head;
		Node<T> prev = null;

		while (cur != null && !cur.data.equals(key)) 
		{
			prev = cur;
			cur = cur.next;
		}

		if (cur == null)
			throw new RuntimeException("cannot delete");

		// delete cur node
		prev.next = cur.next;
	}

	
	public static void main(String[] args)
	{
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.addFirst("p");
		list.listDisplay();
		
		list.addFirst("a");
		list.listDisplay();
		
		list.addLast("e");
		list.listDisplay();
		
		list.addLast("h");
		list.listDisplay();

		list.insert("e", "ee");
		list.listDisplay();

		list.remove("p");
		list.listDisplay();
		
		list.removeFirst();
		list.listDisplay();
		
		list.removeLast();
		list.listDisplay();
		
	}
}



