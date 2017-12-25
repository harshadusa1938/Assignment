package com.strose;

import java.util.Scanner;

public class TestRectangle
{
public static void main(String[] args) 
{
	
	Scanner console = new Scanner(System.in);
    
    System.out.print("\n\n\t\t\t###### Draw Rectangle #######\n");
    
    int height = getValue_int(console, "Length");
    int width = getValue_int(console, "Width");
    Scanner console_1 = new Scanner(System.in);
    String drawCharacter = getValue(console_1, "draw Character");
    
    System.out.print("\n");
    console.close();
    console_1.close();

	Rectangle r1 = new Rectangle(height, width);
//	System.out.println(r1.toString());
	r1.test(drawCharacter);
}

public static int getValue_int(Scanner console, String name) 
{
    System.out.println("Enter "+name + " : ");

    try {
        int width = console.nextInt();
        
        if(width > 0 && width < 31){
        	return width;
        }
        System.out.println(" Valid values for length and width are integers in the range 1-30");
    }catch(Exception ne) {
        System.out.println("Unable to parse your input, enter correct value ");
    }
    return getValue_int(console, name);
}


public static String getValue(Scanner console, String name) 
{
    System.out.println("Enter "+name + " : ");
    try
    {
    	String string = console.nextLine();
    	return string;
    }catch(Exception ne)
    {
        System.out.println("Unable to parse your input, enter correct value ");
    }
    return getValue(console, name);
}
}
