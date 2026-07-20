
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/30/2026
 * PURPOSE: Program is a game of black jack(21). The object of the game is to accumulate
			cards that add up to 21 without exceeding this total. The game includes 2 players and a
			dealer. The total points are recorded for each round of the game.
 */

package BlackJack;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class NjorogeBlackJack {
	
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		File historyFile = NjorogeBlackJackHistory.writeFile(); 
		
		String playAgain;
		int roundCount = 0;
		
		do {
			roundCount++;	
			startGame(historyFile, roundCount);
			
			System.out.print("\nWould you like to play again?" + 
					"\nType 'Y' for YES or 'N' for No: ");
			playAgain  = keyboard.nextLine();
		
		}
		while (playAgain.equalsIgnoreCase("Y"));
	
		System.out.print("\nGame Over!");
		NjorogeBlackJackHistory.readHistory(historyFile);
	}
	
	static ArrayList<Card> dealerHand;
	static ArrayList<Card> deck;
	static Random random = new Random();
	static ArrayList<Card> playerHand;
	static ArrayList<Card> secondPlayerHand;
	
	
	private static class Card {
			String value;
			String type;
			
		Card(String value, String type) {
				this.value = value;
				this.type = type;
		}
		
		public String toString() {
			return value + "-" + type;
		}
		
		public int getValue() {
			if ("AJQK".contains(value)) {
				if (value.equals("A")) {
					return 11;
				}
				return 10;
			}
			return Integer.parseInt(value);
		}
		
		public boolean isAce() {
			return value.equals("A");
		}
	}
	
	public static void buildDeck() {
		deck = new ArrayList<Card>();
		String[] values = {"A", "K", "Q", "J", "2", "3", "4","5", "6", "7", "8", "9", "10"};
		String[] types = {"C", "H", "S", "D"};
		
		for (int i= 0; i < types.length; i++) {
			for (int j = 0; j < values.length; j++) { 
	            Card card = new Card (values[j], types[i]);
	            deck.add(card);
			}
		}
		System.out.println("The deck is:");
		System.out.println(deck);
	}
	
	public static int reducePlayerAce(int playerSum, int playerAceCount) {
	    while (playerSum > 21 && playerAceCount > 0) {
	        playerSum -= 10;
	        playerAceCount -= 1;
	    }
	    return playerSum;
	}
	
	public static void shuffleCards() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nWould you like to shuffle the deck?" + 
				"\nType 'Y' for YES or 'N' for No: ");
		String input = keyboard.nextLine();
		
		if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
		    throw new NjorogeBlackJackExceptionsB("Only enter 'Y' OR 'N'!");
		    }
		
		if (input.trim().isEmpty()) {
	        throw new NjorogeBlackJackExceptions();
	 }
		    
		if (input.equalsIgnoreCase("Y")) {
			for (int i = 0; i < deck.size(); i++) { 
				int j = random.nextInt(deck.size());
	            Card newCard = deck.get(i);
	            Card randomCard = deck.get(j);
	            deck.set(i, randomCard);
	            deck.set(j, newCard);
		}
			System.out.println("Deck shuffled!");
	}
			else {
				System.out.println("Deck left as is!");
			}
		
		System.out.println("Current deck is: \n" + deck);
	}


	private static void startGame(File historyFile, int roundCount) {
		Scanner keyboard = new Scanner(System.in);
		 buildDeck();
		 shuffleCards();
		 Card hiddenCard;
		 int dealerSum = 0;
		 int dealerAceCount = 0;
		 int playerSum = 0;
		 int playerAceCount = 0;
		 int secondPlayerSum = 0;
		 int secondPlayerAceCount = 0;
		 
		 dealerHand = new ArrayList<Card>();
		 hiddenCard = deck.remove(deck.size()-1);
		 dealerSum += hiddenCard.getValue();
		 dealerAceCount += hiddenCard.isAce() ? 1 : 0;
		 
		 Card card = deck.remove(deck.size()-1);
		 dealerSum += card.getValue();
		 dealerAceCount += card.isAce() ? 1 : 0;
		 dealerHand.add(card);
		 
		 System.out.println("\nDealer's Hand is: " + dealerHand);
		 
		 playerHand = new ArrayList<Card>();
		 for (int i = 0; i < 2; i++) {
			 card = deck.remove(deck.size()-1);
			 playerSum += card.getValue();
			 playerAceCount += card.isAce() ? 1 : 0;
			 playerHand.add(card);
			 }
		 
		 System.out.println("\nFirst player, your hand is: " + playerHand);
		 System.out.println("Your Ace count is: " + playerAceCount);
		 System.out.println("Your total sum is: " + playerSum);
		 
		 if (playerSum == 21 || secondPlayerSum == 21 || dealerSum == 21) {
			    System.out.println("\n--- BLACKJACK! Game Over! ---");
			  determineWinner(playerSum, secondPlayerSum, dealerSum); 
			String record = "Round "+ roundCount + " ~ Dealer: " + dealerSum + " | First Player: " + playerSum + " | Second Player: " + secondPlayerSum;
			NjorogeBlackJackHistory.roundsResult(historyFile, record);
			return;
		 }
		 while (playerSum < 21) {
			 
			 System.out.print("\nWould you like to Hit or Stay? " + 
						"\nType 'H' for Hit or 'S' for Stay: ");
			 String input = keyboard.nextLine();
			 
			 if (!input.equalsIgnoreCase("H") && !input.equalsIgnoreCase("S")) {
				    throw new NjorogeBlackJackExceptionsB("Only enter 'H' OR 'S'!");
				    }
			 
			 if (input.trim().isEmpty()) {
			        throw new NjorogeBlackJackExceptions();
			 }
			 
			 if (input.equalsIgnoreCase("H")) {
				 card = deck.remove(deck.size()-1);
				 playerSum += card.getValue();
				 playerAceCount += card.isAce() ? 1 : 0;
				 playerSum = reducePlayerAce(playerSum, playerAceCount);
				 playerHand.add(card);
				 
				 System.out.println("\nYou hit! First player, your new hand is: " + playerHand);
				 System.out.println("Your Ace count is: " + playerAceCount);
				 System.out.println("Your total sum is: " + playerSum);
			 }	    
		 
			 if (playerSum > 21) {
		            System.out.println("\nFirst player you BUST! You went over 21.");
		            break;
			 	}
			 else if (input.equalsIgnoreCase("S")) {
				 System.out.println("\nYou stayed! First player, your current hand is: " + playerHand);
				 System.out.println("Your Ace count is: " + playerAceCount);
				 System.out.println("Your total sum is: " + playerSum);
				 break;
			 	}
		 }
			 secondPlayerHand = new ArrayList<Card>();
			 for (int i = 0; i < 2; i++) {
				 card = deck.remove(deck.size()-1);
				 secondPlayerSum += card.getValue();
				 secondPlayerAceCount += card.isAce() ? 1 : 0;
				 secondPlayerHand.add(card);
				 }
			 
			 System.out.println("\nSecond player, your hand is: " + secondPlayerHand);
			 System.out.println("Your Ace count is: " + secondPlayerAceCount);
			 System.out.println("Your total sum is: " + secondPlayerSum);
		 
		while (secondPlayerSum < 21) {
					 
				System.out.print("Would you like to Hit or Stay? " + 
								"\nType 'H' for Hit or 'S' for Stay: ");
				String input = keyboard.nextLine();
					 
				if (input.trim().isEmpty()) {
					   throw new NjorogeBlackJackExceptions();
				}
				
				if (!input.equalsIgnoreCase("H") && !input.equalsIgnoreCase("S")) {
				    throw new NjorogeBlackJackExceptionsB("Only enter 'H' OR 'S'!");
				    }
					 	
				if (input.equalsIgnoreCase("H")) {
					card = deck.remove(deck.size()-1);
					secondPlayerSum += card.getValue();
					secondPlayerAceCount += card.isAce() ? 1 : 0;
					secondPlayerSum = reducePlayerAce(secondPlayerSum, secondPlayerAceCount);
					secondPlayerHand.add(card);
						 
					 System.out.println("\nYou hit! Second player, your new hand is: " + secondPlayerHand);
					 System.out.println("Your Ace count is: " + secondPlayerAceCount);
					 System.out.println("Your total sum is: " + secondPlayerSum);
					 
				}
	
				 if (secondPlayerSum > 21) {
			            System.out.println("Second player you BUST! You went over 21.");
			            break;
				 	}
				 else if (input.equalsIgnoreCase("S")) {
					 System.out.println("\nYou stayed! Second player, your current hand is: " + secondPlayerHand);
					 System.out.println("Your Ace count is: " + secondPlayerAceCount);
					 System.out.println("Your total sum is: " + secondPlayerSum);
					 break;
				 	}
			 	}
		 
		 	dealerHand.add(0, hiddenCard);
		 	System.out.println("\nDealer's hidden card is: " + hiddenCard);
		 	
			 while (dealerSum < 17) {
				 card = deck.remove(deck.size()-1);
				 dealerSum += card.getValue();
				 dealerAceCount += card.isAce() ? 1 : 0;
				 dealerSum = reducePlayerAce(dealerSum, dealerAceCount);
				 dealerHand.add(card);
				 System.out.println("\nDealer has added another card and can not go over 17");
			 }
			 
			 
			 System.out.println("\nDealer's new hand is: " + dealerHand);
			 System.out.println("Dealer's Ace count is: " + dealerAceCount);
			 System.out.println("Dealer's total sum is: " + dealerSum);
			 
	
			 determineWinner(playerSum, secondPlayerSum, dealerSum);
			 
			 String record = "Round "+ roundCount + " ~ Dealer: " + dealerSum + " | First Player: " + playerSum + " | Second Player: " + secondPlayerSum;
			 NjorogeBlackJackHistory.roundsResult(historyFile, record);
	}
		 
	public static void determineWinner (int playerSum, int secondPlayerSum, int dealerSum) {
				 
		if (dealerSum > 21) {
	        System.out.println("\nDealer bust!");
	    }
	    if (playerSum > 21) {
	        System.out.println("\nFirst player busts and loses!");
	    } else if (dealerSum > 21 || playerSum > dealerSum) {
	        System.out.println("\nFirst player wins!");
	    } else if (playerSum == dealerSum) {
	        System.out.println("\nFirst player draws with Dealer!");
	    } else {
	        System.out.println("\nFirst player loses to Dealer!");
	    }

	    if (secondPlayerSum > 21) {
	        System.out.println("Second player busts and loses!");
	    } else if (dealerSum > 21 || secondPlayerSum > dealerSum) {
	        System.out.println("Second player wins!");
	    } else if (secondPlayerSum == dealerSum) {
	        System.out.println("Second player draws with Dealer!");
	    } else {
	        System.out.println("Second player loses to Dealer!");
	    }
	}
}














