
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 03/26/2026
 * PURPOSE: PROGRAM ASKS THE USER'S NAME, AGE AND MONTHLY PAY WHICH THEN CALCULATES THE ANNUAL PAY AND THE USER'S FUTURE AGE IN TEN YEARS.
 */
package NameAgeAnnualIncome;

import java.util.Scanner;

public class NjorogeNameAgeAnnualIncome {
	
	public static void main(String[] args)
	  {
		String name;
		int age;
		int futureAge;
		double monthlyPay;
		double annualPay; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		System.out.print("What is your monthly pay? ");
		monthlyPay = keyboard.nextDouble();
		
		annualPay = monthlyPay * 12;
		
		futureAge = age + 10;		
		
		System.out.println("Hello " + name);
		System.out.println("Your age in ten years is: " + futureAge);
		System.out.println("Your annual pay is: $" + annualPay);
	  }
}
