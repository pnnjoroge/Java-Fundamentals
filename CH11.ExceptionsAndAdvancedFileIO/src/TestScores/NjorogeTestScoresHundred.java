
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS TEST SCORES TO FIND AVERAGE AND FINDS EXCEPTIONS.
 */

package TestScores;

public class NjorogeTestScoresHundred extends IllegalArgumentException{
	
	public NjorogeTestScoresHundred() {
		super("Error: The test score can not be greater than 100.");
	}
	public NjorogeTestScoresHundred(double amount) {
		super("Error: The test score (" + amount + ") can not be greater than 100.");
	}
}
