/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS TEST SCORES TO FIND AVERAGE AND FINDS EXCEPTIONS.
 */

package TestScoresCustom;

public class NjorogeTestScoresCustom extends Exception{

	public NjorogeTestScoresCustom(){
		super ("Error: The test score is invalid.");
	}
	public NjorogeTestScoresCustom(double amount){
		super("Error: The test score("+amount+") is invalid.");
	}
}
