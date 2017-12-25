package com.strose;

//j list that allows multiple selections
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * In this Program The counter can be incremented (by one), decremented (by one), and reset (to zero) by selecting the appropriate option.
The purpose of this program is to design a Counter class that models the functionality and
behavior of this physical device and implements it in software.

 *Team Assignment 4
 *
 *Team Members:Harshad Patel
 *             Mona Mittal
 *			   Tushar Patel
 *  Date : 03/05/2017
 */
class  CounterConsoleMenu extends JFrame 
{
	private static final long serialVersionUID = 1L;
	JTextField text; //text field
	static boolean go;
	int num = 0;  

	//Set up GUI
	public void init() 
	{   
		//Create J panel
		JPanel panel = new JPanel();
		//Create increment button
		JButton increment = new JButton("Increment");
		//Create decrement button
		JButton decrement = new JButton("Decrement");
		//Create reset button
		JButton reset = new JButton("Reset");
		//Create close Button
		JButton close = new JButton("Close");

		text = new JTextField(20); //Construct text with 20
		panel.setLayout(new FlowLayout()); //Set Frame layout
		panel.add(increment); //add increment button
		panel.add(text);     //add text button
		panel.add(decrement); //add decrement button
		panel.add(reset);   //add reset button
		panel.add(close);   // add close button

		this.setSize(500, 200); //set sixe
		this.add(panel); //add panel
		this.setVisible(true); //show the buttons
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Set default operation that is exit on close

		increment.addActionListener(new incrementListener()); //Register listener for increment
		decrement.addActionListener(new decrementListener());//Register listener for decrement
		reset.addActionListener(new resetListener());//Register listener for reset
		close.addActionListener(new CloseListener());//Register listener for close
	}
	
	//private inner class for event handling
	private class CloseListener implements ActionListener
	{
		//process text field events
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//Exit System or Exit Windows of Dialog
			System.exit(0);
		}
	}


	//Handling Increment button
	private class incrementListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent event) 
		{
			num++; //Increment in the number
			text.setText("" + num); //Set text after the increment
		}
	}


	//Handling decrement button
	private class decrementListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent event) 
		{
			num--; //Decrement in the number
			text.setText("" + num); //Set text after the decrement
		}
	}

	// handling reset button
	private class resetListener implements ActionListener 
	{
		public void actionPerformed (ActionEvent event) 
		{
			num = 0; //number is 0
			text.setText("" + num); //reset the number again to 0
		}
	}

} //end class