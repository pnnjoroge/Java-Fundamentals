
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 03/26/2026
 * PURPOSE: PROGRAM ASKS THE USER'S TOTAL AMOUNT FOR THE MEAL, 
 * 			THEN CALCULATES THE TAX, TIP AND THE TOTAL AMOUNT DUE WITH EVERYTHING INCLUDED.
 */


package RestaurantBill;

import java.util.Scanner;

public class NjorogeRestaurantBill {
	

	public static void main(String[] args)
	  {
		
		double totalAmount;
		double taxAmount;
		double totalAndTaxAmount;
		double tipAmount;
		double grandTotal;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is the total amount for the meal? ");
		totalAmount = keyboard.nextDouble();
		
		taxAmount = 0.0675 * totalAmount;
		
		totalAndTaxAmount = totalAmount + taxAmount;
		
		tipAmount = 0.2 * totalAndTaxAmount;
		
		grandTotal = totalAndTaxAmount + tipAmount;
		
		System.out.println("Total Amount Of Meal: " + totalAmount);
		System.out.println("Tax Amount: " + taxAmount);
		System.out.println("Tip Amount: " + tipAmount);
		System.out.println("Grand Total: $" + grandTotal);
	  }
		
}
