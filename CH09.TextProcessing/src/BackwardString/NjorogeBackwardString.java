/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/16/2026
 * PURPOSE: PROGRAM CHECKS TO SEE IF THE TEXT PROVIDED IS A PALINDROME, THAT WHEN REVERSED, IT IS EQUAL TO THE ORIGINAL TEXT.
 */

package BackwardString;

import java.util.Scanner;

public class NjorogeBackwardString {
	public static void main(String[] args) {
		
		String textString;
		String newString;
		String endString = "quit";
		int newText = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter text to see if it is a palindrome or ");
		System.out.print("\nType 'quit' to leave the program: ");
		textString = keyboard.nextLine();
		
		while (!textString.equalsIgnoreCase(endString)) {
		newString = textString.replace(" ", "").toLowerCase();
		
		String reversedString = "";
		for (int i = newString.length() - 1; i >= 0; i--) {
		    reversedString += newString.charAt(i);
		}
		if (newString.equals(reversedString)) {
			System.out.println("It is a palindrome!\n");
		}
		else {
			System.out.println("It is not a palindrome!\n");
			}
		
		System.out.print("Enter text to see if it is a palindrome or ");
		System.out.print("\nType 'quit' to leave the program: ");
		textString = keyboard.nextLine();
		
		
		}
		
	}
}
