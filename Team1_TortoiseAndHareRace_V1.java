package com.strose;

/*
 *Team Assignment 1
 *Authors-Harshad Patel
          Tushar Patel
          Mona Mittal
 *Date -  18/4/2017
 *tAssignment-5: tortoise and hare race
This project involves writing a program to simulate a tortoise and hare race. 
The contenders will each race along a horizontal course that contains at least 50 squares.
You may add more if you wish. The race begins with each contender at square 1. 
The contender that first reaches or passes the last square of the course is the winner of the race
 */


//import statement
import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class Team1_TortoiseAndHareRace_V1 extends Applet  //start of the class
{
	private static final long serialVersionUID = 1L;
	// Declared Variables
	int tortSquaresDone  = 0, hareSquaresDone = 0;
	int tortX = 250, hareX = 250;
	final int tortY = 100, hareY = 300, WIDTH = 15, HEIGHT = 50;
	int turn = 0;
	String turnNum;
	int move = 0;
	String tMove, hMove;

	//Control Method to control a tortoise and Hare Race and who is winning a Race
	public void control() {

		System.out.println("control");

		while ((tortX < 985) && (hareX < 985)) 
		{
			move = (int) (10 * Math.random());

			//tortoise
			switch (move) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				tortSquaresDone += 3;
				tortX += (3 * WIDTH);
				tMove = "Fast Plod";
				break;
			case 6:
			case 7:
			case 8:
				tortSquaresDone += 1;
				tortX += (1 * WIDTH);
				tMove = "Slow Plod";
				break;
			case 9:
			case 10:
				tortX = tortX;
				tMove = "Slip";
				break;
			}
			if(tortX < 250){
				tortX = 250;
			}

			//hare
			switch (move) {
			case 1:
			case 2:
				hareSquaresDone +=6;
				hareX += (6 * WIDTH);
				hMove = "Big Hop";
				break;
			case 3:
			case 4:
			case 5:
				hareSquaresDone +=3;
				hareX += (3 * WIDTH);
				hMove = "Small Hop";
				break;
			case 6:
				hareSquaresDone -=6;
				hareX -= (6 * WIDTH);
				hMove = "Big Slip";
				break;
			case 7:
			case 8:
				hareSquaresDone -=3;
				hareX -= (3 * WIDTH);
				hMove = "Small Slip";
				break;
			case 9:
			case 10:
				hareX = hareX;
				hMove = "Fall Asleep.";
				break;
			}

			if(hareX < 250){
				hareX = 250;
			}

			turn++;
			turnNum = (turn + "");
			repaint();
			delay();
		}
	}

	//paint for Applet of visualization Live Racing
	public void paint(Graphics screen) {
		drawRace(screen);

		clearCurrent(screen);
		fillNext(screen);

		if (tortX >= 985) {
			screen.drawString("Tortoise Wins", 650, 240);
			stop();
		} 
		if (hareX >= 985) {
			screen.drawString("Hare Wins", 650, 240);
			stop();
		}
	}

	public void clearCurrent(Graphics s)
	{
		s.clearRect(tortX + 1, tortY + 1, WIDTH - 1, HEIGHT - 1);
		s.clearRect(hareX + 1, hareY + 1, WIDTH - 1, HEIGHT - 1);
	}

	public void fillNext(Graphics s)
	{

		System.out.println(tortX);
		System.out.println(hareX);

		s.fillRect(tortX + 1, tortY + 1, WIDTH - 1, HEIGHT - 1);
		s.fillRect(hareX + 1, hareY + 1, WIDTH - 1, HEIGHT - 1);
	}

	public void drawRace(Graphics s)
	{
		s.drawRect(250, 100, 750, 50);
		s.drawRect(250, 300, 750, 50);
		int lineX = 265, lineYi = 100, lineYf = 150;
		for (int i = 1; i <= 98; i++) {
			if (lineX == 1000) {
				lineX = 265;
				lineYi = 300;
				lineYf = 350;
			}
			s.drawLine(lineX, lineYi, lineX, lineYf);
			lineX += 15;
		}

		s.setFont(new Font("Times New Roman", Font.BOLD, 16)); // Displaying data in Graphics format..
		s.drawString("tortoise ------------- " + tMove + " -------------- " + tortSquaresDone, 59, 80);
		s.drawString("hare     ------------- " + hMove + " -------------- " + hareSquaresDone  , 66, 271);
		s.drawString("Race", 250, 55);
	}

	public void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void stop()//Stop method to stop the thread 
	{
	}

	@Override
	public void start() {
		super.start();

		Runnable runnable = new Runnable() {
			public void run() {
				control();
			}
		};
		new Thread(runnable).start();

	}
}//end of class
