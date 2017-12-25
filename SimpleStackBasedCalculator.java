package com.strose;

/*
Author Name: Harshadkumar N Patel
Developed Code: 03 November, 2017 
Assignment-3 of DataStructure */

import java.util.Scanner;
import java.util.Stack;

public class SimpleStackBasedCalculator 
{

	public static void main(String[] args) // Main Method
	{
		Scanner in = new Scanner(System.in);

		Stack<Double> numbers = new Stack<>();

		String prompt = "Following token Detail :: (q -> Quit , p -> Pop , c -> Clear , s -> Display Stack, + -> Addition, - -> Subtract, * -> Multiplication, / -> Division) \nPlease Enter Data:: \n";

		boolean cont = true;

		System.out.print(prompt);
		while (cont && in.hasNext()) { // Stop if quit command issued, or EOF
			String token = in.next();
			boolean isOperator = isOperator(token);

			if (isOperator && numbers.size() < 2) {
				System.err.println("Operation failed: not enough operands");
			} else if (isOperator) {
				double right = numbers.pop();
				double left = numbers.pop();
				switch (token) {
				case "+":
					numbers.push(left + right);
					break;
				case "-":
					numbers.push(left - right);
					break;
				case "*":
					numbers.push(left * right);
					break;
				default:
					numbers.push(left / right);
				}
			} else if (token.equals("q")) {
				cont = false;
			} else if (token.equals("p")) {
				System.out.println(numbers.pop());
			} else if (token.equals("c")) {
				numbers = new Stack<Double>();
			} else if (token.equals("s")) {
				System.out.println("Stack ->" + numbers);
			} else {
				try {
					numbers.push(Double.parseDouble(token));
				} catch (NumberFormatException e) {
					System.err.println("Invalid operator, number, or command");
				}
			}

			System.out.println("Stack ->" + numbers);
		}
	}

	private static boolean isOperator(String str) {
		String[] opList = { "+", "-", "*", "/" };
		for (String op : opList) {
			if (str.equals(op))
				return true;
		}
		return false;
	}

}