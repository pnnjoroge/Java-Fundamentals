
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/15/2026
 * PURPOSE: PROGRAM CALCULATES THE AREA OF A CIRCLE, A RECTANFLE AND A CYLINDER.
 */

package AreaClass;

public class NjorogeShape {
	
	public static void main(String[] args) {
		
		double radius;
		int length;
		int width;
		double height;
		
		
		
	}
		
		public static double calcArea(double radius) {
			
			return Math.PI * radius * radius;
		}
		
		public static double calcArea(int length, int width) {
			
			 return length * width;
		}
		
		public static double calcArea(double radius, double height) {
			
			 return (Math.PI * radius * radius) * height;
		}

}

