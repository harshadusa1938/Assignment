package com.strose;

public class MyBinarySearchTree 
{

	static Node root;

	public void addNode(int key, String name) {
		
		Node n = new Node(key, name);
		
		if(root == null)
		{
			root = n;
		}
		else
		{
			Node current = root;
			
			while(current != null)
			{
				if(key < current.key)
				{
					if(current.leftChild == null)
					{
						current.leftChild = n;
						break;
					}
					else
					{
						current = current.leftChild;
					}
				}
				
				if(key > current.key)
				{
					if(current.rightChild == null)
					{
						current.rightChild = n;
						break;
					}
					else
					{
						current = current.rightChild;
					}
				}				
			} 
		}

		
	}
	

	public void inOrderTraverseTree(Node current) {

		if (current != null) {

			inOrderTraverseTree(current.leftChild);
			System.out.println(current);
			inOrderTraverseTree(current.rightChild);

		}

	}

	public void preorderTraverseTree(Node current) {
		
		if (current != null) {

            System.out.println(current);
			preorderTraverseTree(current.leftChild);
			preorderTraverseTree(current.rightChild);

		}
	}

	public void postOrderTraverseTree(Node current) {

			if (current != null) {

			postOrderTraverseTree(current.leftChild);
			postOrderTraverseTree(current.rightChild);
			System.out.println(current);

		}
	}

	public Node findNode(int key) {
		
		Node current = root;
		if(root == null)
			return null;
		else
		{
			
			if(key < current.key)
			{
				current = current.leftChild;
			}
			
			if(key > current.key)
			{
				current = current.rightChild;
			}
		}
		
		return current;

	}

public static void main(String[] args) 
{

		MyBinarySearchTree  b = new MyBinarySearchTree ();
		b.addNode(100, "A");
        b.addNode(99, "B");
	    b.addNode(101, "C");
     	b.preorderTraverseTree(root);
     	
     	System.out.println("Find " + b.findNode(100));
		
}


class Node {

	int key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int key, String name) {

		this.key = key;
		this.name = name;

	}

	public String toString() {

		return name + " has the key " + key;
	}

}
}