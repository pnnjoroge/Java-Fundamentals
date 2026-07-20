
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS TEST SCORES TO FIND AVERAGE AND FINDS EXCEPTIONS.
 */

package TestScores;

public class NjorogeTestScores extends IllegalArgumentException{

//	public static void main(String[] args) {
//		
//	}
	public NjorogeTestScores() {
		super("Error: The test score can not be negative.");
	}
	public NjorogeTestScores(double amount) {
		super("Error: The test score("+amount+") can not be negative.");
	}
}


