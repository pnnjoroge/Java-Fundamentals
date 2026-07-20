
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/16/2026
 * PURPOSE: PROGRAM CHECKS TO SEE IF THE TEXT PROVIDED IS A PALINDROME, THAT WHEN REVERSED, IT IS EQUAL TO THE ORIGINAL TEXT.
 */

package PasswordVerifier;

import java.util.Scanner;

public class NjorogePasswordVerifier {
	public static void main(String[] args) {
		
		final int characterLength = 6;
		final int upperCaseLetter = 1;
		final int lowerCaseLetter = 1;
		final int digitNumber = 1;
		final int specialCharacterNumber = 1;
		
		char[] specialCharacters = {'!', '@', '#', '$', '%', '&', '*', '?'};
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int specialCharacterCount = 0;
		int characterCount = 0;
		
		String passwordInput;
		
		
	
		
		
		System.out.print("Enter password: ");
		passwordInput = keyboard.nextLine();
		
		int passwordInputLen = passwordInput.length();
		
		for (int i=0; i<passwordInputLen; i++) {
			char ch = passwordInput.charAt(i);
			characterCount++;
		
			if (Character.isUpperCase(ch))
				upperCount++;
			else if (Character.isLowerCase(ch))
				lowerCount++;
			else if (Character.isDigit(ch))
				digitCount++;
			else {
				for (char spec : specialCharacters) {
                    if (ch == spec) {
                    	specialCharacterCount++;
                    }     	break;
			}
		}
	}
			
			
		boolean isValid = (upperCount >= upperCaseLetter &&
							lowerCount >= lowerCaseLetter &&
							digitCount >= digitNumber && 
							characterCount >= characterLength && 
							specialCharacterCount >= specialCharacterNumber); 
		
		if (isValid && characterCount >= 10 && specialCharacterCount >= 2) {
			System.out.println("Strong Password!");
		}
			else if (isValid) {
					System.out.println("Acceptable Password!");
				}
			else {
				System.out.println("Invalid Password! The password does not have the following:");
				if(upperCount < upperCaseLetter) {
					System.out.println("1 uppercase letter");
				}
				if(lowerCount < lowerCaseLetter) {
					System.out.println("1 lowercase letter");
				}
				if(digitCount < digitNumber) {
					System.out.println("1 numerical digit");
				}
                if (specialCharacterCount < specialCharacterNumber) {
						System.out.println("a special character");
				}
                
                System.out.println("Try again.\n");
                System.out.print("Enter password: ");
        		passwordInput = keyboard.nextLine();
			}
		}
	}
}


