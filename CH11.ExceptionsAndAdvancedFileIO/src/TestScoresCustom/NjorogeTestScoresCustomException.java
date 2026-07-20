
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS TEST SCORES TO FIND AVERAGE AND FINDS EXCEPTIONS.
 */

package TestScoresCustom;

import TestScores.NjorogeTestScores;
import TestScores.NjorogeTestScoresHundred;

public class NjorogeTestScoresCustomException {
	private int [] testScores;
	
	
	
	public NjorogeTestScoresCustomException(int[] testScores) throws NjorogeTestScoresCustom, NjorogeTestScoresHundred {
		for (int index = 0; index < testScores.length; index++) {
			int score = testScores[index];
			
			if( score < 0) {
				throw new NjorogeTestScoresCustom();
			}
			if(score > 100) {
				throw new NjorogeTestScoresCustom(score);
			}
		}
		this.testScores = testScores;
	}
}
