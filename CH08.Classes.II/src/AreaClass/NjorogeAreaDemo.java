/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/15/2026
 * PURPOSE: PROGRAM CALCULATES THE AREA OF A CIRCLE, A RECTANFLE AND A CYLINDER.
 */

package AreaClass;
import java.util.Scanner;

public class NjorogeAreaDemo {

	public static void main(String[] args) {
		
		double radius;
		int length;
		int width;
		double height;
		int menu;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Menu of 3 shape objects: \n"
				+ "1. Find the area of a circle \n"
				+ "2. Find the area of a rectangle \n"
				+ "3. Find the volume of a cylinder \n"
				+ "4. Quit \n"
				+ "Choose one: ");
		
		menu = keyboard.nextInt();
		
		switch (menu) {
			case 1:
			 System.out.print("What is the radius of the circle? ");
			 radius = keyboard.nextDouble();
			 double circleArea = NjorogeShape.calcArea(radius);
			 System.out.printf("Area of the circle is:  %,.2f\n", circleArea);
			 break;
			 
			case 2:
			 System.out.print("What is the width of the rectangle? ");
			 width = keyboard.nextInt();
			 System.out.print("What is the length of the rectangle? ");
			 length = keyboard.nextInt();
			 double rectangleArea = NjorogeShape.calcArea(length, width);
			 System.out.printf("Area of the rectangle is: %,.2f\n", rectangleArea);
			 break;
			 
			case 3:
			 System.out.print("What is the radius of the cylinder? ");
			 radius = keyboard.nextDouble();	
			 System.out.print("What is the height of the cylinder? ");
			 height = keyboard.nextDouble();
			 double cylinderVolume = NjorogeShape.calcArea(radius, height);
			 System.out.printf("Volume of the cylinder is: %.2f\n", cylinderVolume);
			 break;
			 
			case 4:
			System.out.println("You have quit the menu. Thank you and have a nice day!");
			break;
		}
	}

}
	
