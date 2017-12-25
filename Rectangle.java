package com.strose;

public class Rectangle 
{
//attributes
	private int length;
	private int width;

	public Rectangle() 
	{
		length = 0;
		width = 0;
	}

	public Rectangle(int l, int w) 
	{
		length = l;
		width = w;
	}

	// Get And Set Methods
	public void setLength(int l)
	{
		length = l;
	}

	public void setWidth(int w) 
	{
		width = w;
	}

	public int getLength()
	{
		return length;
	}
	
}