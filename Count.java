package com.strose;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 *  Read the program. I have marked spots that need to be filled in.
 *  I try to leave examples that should help you write the code.
 *  
 *  This program should give you a gui that allows you to
 *  increment and decrement a number. This program uses to
 *  JButtons and a JLabel.
 *  It also uses JFrame (extends) and JPanel, as does any
 *  gui/swing application in Java.
 *  
 *  Because our class extends JFrame, we may treat the class
 *  as a JFrame. This means, we can add a JPanel to it by
 *  saying, "this.add(panel);". This is exactly what this
 *  program does.
 *  
 *  Wherever you see "this." and a method connected to that, 
 *  we are talking about our class. Also realize, we are talking
 *  about a JFrame. You will see code like, "this.setSize(x, y);".
 */

public class Count extends JFrame {

	private final int FRAME_WIDTH = 250;
	private final int FRAME_HEIGHT = 90;
	private int count = 0;
	
	private JPanel panel;
	private JButton bInc;
	private JButton bDec;
	public JLabel label;
	
	public Count()
	{
		count = 0;
		
		panel = new JPanel();
		bInc = new JButton("Increment");
		bDec = new JButton("Decrement");
		label = new JLabel("Default Message..");
		
		bInc.addActionListener(new IncreaseCount());
		bDec.addActionListener(new DecreaseCount()); //Ignore this error. You need to write this ActionListener at the bottom.
		

		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Counter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void run() 
	{
		//I added the button "bInc" to the panel here.
		panel.add(bInc); 
		panel.add(bDec);	//TODO:Write some code that adds button "bDec" to the panel.
		panel.add(label);  //TODO:Write some code that adds label "label" to the panel.
		
		
		//This adds the panel to the class, which is a JFrame.
		this.add(panel);
		
		this.setVisible(true);
	}
	
	public class IncreaseCount implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			count++; //TODO:Add some code to increment the counter
			label.setText(count + " has increased by 1"); //TODO:Add some code to setText() on the label
		}
		
	}
	
	public class DecreaseCount implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			count--;
			label.setText(count + " has decreased by 1");
		}
	}
	//TODO:Add a DecreaseCount class that implements ActionListener here.
		 	//Under ActionPerformed...
			//TODO:Add some code to decrement the counter
			//TODO:Add some code to setText() on the label
}