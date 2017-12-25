package com.strose;

/* Author Name: Harshad Patel
Tushar Patel
Mona Mittal
 * Date:        01/18/2017
 * last updated: 01/26/2017
 * Description:  Calculator with GUI Design
 * Team Assignment 0
 **/

// import statements

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Team1_Calculator_V1 extends JFrame implements ActionListener
{
	/** We used the J Panel and JButton for GUI
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//make 5 panels, one for each row
	JPanel[] row = new JPanel[5];
	//make 19 buttons on the calculator
	JButton[] button = new JButton[19];
	String[] buttonString = {
			"7", "8", "9", "+",
			"4", "5", "6", "-",
			"1", "2", "3", "*",
			".", "/", "OFF", "√",
			"ON", "=", "0"};
	int[] dimW = {300,45,100,90};
	int[] dimH = {35, 40};
	// Uses the first integer in the width, and the first integer in height.
	Dimension displayDimension = new Dimension(dimW[0], dimH[0]);
	// Uses the second integer in the width, and the second integer in height.
	Dimension regularDimension = new Dimension(dimW[1], dimH[1]);
	//Uses the third integer in the width, and the second integer in height.
	Dimension rColumnDimension = new Dimension(dimW[2], dimH[1]);
	//Uses the fourth integer in width, and the second integer in height.
	Dimension zeroButDimension = new Dimension(dimW[3], dimH[1]);

	//declare some booleans for our functions
	boolean[] function = new boolean[4];
	//temporary doubles later for our calculations
	double[] temporary = {0, 0};

	// creatng a display using JTextArea
	JTextArea display = new JTextArea(1,20);
	Font font = new Font("Calibri", Font.BOLD, 16);

	Team1_Calculator_V1()//Same as class name
	{
		super("Calculator");  
		setDesign();
		setSize(372, 252);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(5,5);
		setLayout(grid);
		for(int i = 0; i < 4; i++)
			function[i] = false;
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,1,1);

		for(int i = 0; i < 5; i++) //for loop
			row[i] = new JPanel();
		row[0].setLayout(f1);

		for(int i = 1; i < 5; i++) //for loop
			row[i].setLayout(f2);

		for(int i = 0; i < 19; i++) // for loop
		{
			button[i] = new JButton();
			button[i].setText(buttonString[i]);
			button[i].setFont(font);
			button[i].addActionListener(this);
		}

		display.setFont(font); // set display
		display.setEditable(false);
		display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		display.setPreferredSize(displayDimension);
		for(int i = 0; i < 14; i++)
			button[i].setPreferredSize(regularDimension);

		for(int i = 14; i < 18; i++) // for loop
			button[i].setPreferredSize(rColumnDimension);
		button[18].setPreferredSize(zeroButDimension);
		row[0].add(display);
		add(row[0]);

		for(int i = 0; i < 4; i++) // for loop
			row[1].add(button[i]);
		row[1].add(button[14]);
		add(row[1]);

		for(int i = 4; i < 8; i++) // for loop
			row[2].add(button[i]);
		row[2].add(button[15]);
		add(row[2]);

		for(int i = 8; i < 12; i++) //for loop
			row[3].add(button[i]);
		row[3].add(button[16]);
		add(row[3]);
		row[4].add(button[18]);

		for(int i = 12; i < 14; i++) // for loop
			row[4].add(button[i]);
		row[4].add(button[17]);
		add(row[4]);



		setVisible(true);
	}	



	public void clear() //Make a method for clear the button
	
	{

		try {

			display.setText(""); // Sets the display blank

			for(int i = 0; i < 4; i++)

				function[i] = false; // Sets the functions back to false

			for(int i = 0; i < 2; i++)

				temporary[i] = 0;  // Sets our temporary variables back to 0

		} catch(NullPointerException e) { 

		}

	}



	public void getSqrt() 
	{

		try {
			// Create a variable for value, and use Math's square root to find value
			double value = Math.sqrt(Double.parseDouble(display.getText())); 

			display.setText(Double.toString(value)); // Sets display to new value

		} catch(NumberFormatException e) {

		}

	}


	public void getPosNeg() 
	{

		try {

			display.setText("0"); 

		} catch(NullPointerException e) { 

		}

	}


	private Object getText() // we used the get method for text
	{
		// TODO Auto-generated method stub
		return null;
	}



	public void getResult()// get result method
	{

		double result = 0;

		temporary[1] = Double.parseDouble(display.getText());

		String temp0 = Double.toString(temporary[0]);

		String temp1 = Double.toString(temporary[1]);

		try {

			if(temp0.contains("-")) {

				String[] temp00 = temp0.split("-", 2);

				temporary[0] = (Double.parseDouble(temp00[1]) * -1);

			}

			if(temp1.contains("-")) {

				String[] temp11 = temp1.split("-", 2);

				temporary[1] = (Double.parseDouble(temp11[1]) * -1);

			}

		} catch(ArrayIndexOutOfBoundsException e) {

		}

		try {

			if(function[2] == true)

				result = temporary[0] * temporary[1];

			else if(function[3] == true)

				result = temporary[0] / temporary[1];

			else if(function[0] == true)

				result = temporary[0] + temporary[1];

			else if(function[1] == true)

				result = temporary[0] - temporary[1];

			display.setText(Double.toString(result));

			for(int i = 0; i < 4; i++)

				function[i] = false;

		} catch(NumberFormatException e) {

		}

	}



	public final void setDesign() //This method is used for the design the swing
	{

		try {

			UIManager.setLookAndFeel(

					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

		} catch(Exception e) {  

		}

	}



	@Override

	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == button[0])

			display.append("7");

		if(ae.getSource() == button[1])

			display.append("8");

		if(ae.getSource() == button[2])

			display.append("9");

		if(ae.getSource() == button[3]) {

			//add function[0]

			temporary[0] = Double.parseDouble(display.getText());

			function[0] = true;

			display.setText("");

		}

		if(ae.getSource() == button[4])

			display.append("4");

		if(ae.getSource() == button[5])

			display.append("5");

		if(ae.getSource() == button[6])

			display.append("6");

		if(ae.getSource() == button[7]) {

			//subtract function[1]

			temporary[0] = Double.parseDouble(display.getText());

			function[1] = true;

			display.setText("");

		}

		if(ae.getSource() == button[8])

			display.append("1");

		if(ae.getSource() == button[9])

			display.append("2");

		if(ae.getSource() == button[10])

			display.append("3");

		if(ae.getSource() == button[11]) {

			//multiply function[2]

			temporary[0] = Double.parseDouble(display.getText());

			function[2] = true;

			display.setText("");

		}

		if(ae.getSource() == button[12])

			display.append(".");

		if(ae.getSource() == button[13]) {

			//divide function[3]

			temporary[0] = Double.parseDouble(display.getText());

			function[3] = true;

			display.setText("");

		}

		if(ae.getSource() == button[14])

			clear();

		if(ae.getSource() == button[15])

			getSqrt();

		if(ae.getSource() == button[16])

			getPosNeg();

		if(ae.getSource() == button[17])

			getResult();

		if(ae.getSource() == button[18])

			display.append("0");

	}

	public static void main(String[] arguments) {

		Team1_Calculator_V1 c = new Team1_Calculator_V1();

	}

}
