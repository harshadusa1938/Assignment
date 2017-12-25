package com.strose;

public class RecursionDemo1 {

	public static void main(String[] args) {
		System.out.println("Vertical: 3");
		writeVertical(3);
		System.out.println("Vertical: 12");
		writeVertical(12);
		System.out.println("Vertical: 123");
		writeVertical(123);
	}

	public static void writeVertical(int n) {
		if (n < 10)
			System.out.println("This is for:=" +n);
		else
			writeVertical(n / 10);
		System.out.println(n % 10);
	}
}
