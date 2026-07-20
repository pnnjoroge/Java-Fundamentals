
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/23/2026
 * PURPOSE: Program is a game of black jack(21). The object of the game is to accumulate
			cards that add up to 21 without exceeding this total. The game includes 2 players and a
			dealer. The total points are recorded for each round of the game.
 */
 


package BlackJack;

public class NjorogeBlackJackExceptionsB extends IllegalArgumentException { 
		
		public NjorogeBlackJackExceptionsB(String message) {
			super("Error: " + message);
		}
	}
