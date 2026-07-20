package HeadsorTailsGame;

import java.util.Scanner;

public class NjorogeHeadsorTailsGame {
	public static void main(String[] args) {
		
		int min = 1;
		int max = 2;
		int numberChosen;
		int matchingNumber;
		int playerScore = 0;
		int numberTossed = 0;

	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Guess the chosen number: ");
	numberChosen = keyboard.nextInt();
	
	while(playerScore != 11 ) {
	matchingNumber = NjorogeHeadsorTailsCoinToss.getRandomNumber(min, max);
	numberTossed ++;
	
	if (numberChosen == matchingNumber) {
		playerScore += 2;
		System.out.println("Correct! +2 points.");	
		}
		else {
			playerScore -=1;
			System.out.println("Incorrect! -1 point.");
		}
	
		System.out.println("Your total score is: " + playerScore + "\n");
		System.out.print("Guess the chosen number: ");
		numberChosen = keyboard.nextInt();
		
		}
	System.out.print("Game Over!");
	System.out.print("The coin was tossed " + numberTossed + " times!");
	}
	
}
