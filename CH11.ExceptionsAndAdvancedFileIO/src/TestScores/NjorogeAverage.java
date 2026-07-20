
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: PROGRAM PULLS TEST SCORES TO FIND AVERAGE AND FINDS EXCEPTIONS.
 */

package TestScores;

public class NjorogeAverage {
	
		private int [] testScores;
		

		public static void main(String[] args) {
		    int[] testScores = {90, 100, 280, -50};

		    for (int score : testScores) {
		        try {
		            if (score < 0) throw new NjorogeTestScores(score);
		            if (score > 100) throw new NjorogeTestScoresHundred(score);
		        } 
		        catch (NjorogeTestScores | NjorogeTestScoresHundred e) {
		            System.out.println(e.getMessage());
		        }
		    }
		    try {
		        NjorogeAverage AvgScore = new NjorogeAverage(testScores);
		        System.out.println("The average is: " + AvgScore.getAverageScores());
		        System.out.println("\nCalculation has ended. Start Again");
		    } catch (Exception e) {
		        System.out.println("\nCalculation stopped, try again.");
		    }
		}

		
	
		public NjorogeAverage(int[] testScores) throws NjorogeTestScores, NjorogeTestScoresHundred {
			for (int index = 0; index < testScores.length; index++) {
				int num = testScores[index];
				
				if(num < 0) {
					throw new NjorogeTestScores(num);
				}
				if(num > 100) {
					throw new NjorogeTestScoresHundred(num);
				}
			}
			this.testScores = testScores;
		}
		
		public double getAverageScores() {
			double total = 0;
			for (int index = 0; index < testScores.length; index++) {
				total = testScores[index];
		}
			return total/testScores.length;
	}
}

