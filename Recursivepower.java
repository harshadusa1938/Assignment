package com.strose;

public class Recursivepower {

	public static void main(String[] args)
	{
		for (int n = 0; n < 4; n++)
		
		System.out.println("3 to power " + n + "is" + power(3, n));
		
	}

	private static int power(int x, int n) {
		// TODO Auto-generated method stub

		if (n < 0){
			System.out.println("Illegal Argument");
		System.exit(0);}
		if (n > 0)

			return (power(x, n - 1) * x);
		else
			return (1);
	}
}
