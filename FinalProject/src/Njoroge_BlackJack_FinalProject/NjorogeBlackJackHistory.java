
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/30/2026
 * PURPOSE: Program is a game of black jack(21). The object of the game is to accumulate
			cards that add up to 21 without exceeding this total. The game includes 2 players and a
			dealer. The total points are recorded for each round of the game.
 */

package BlackJack;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class NjorogeBlackJackHistory {
	public static void main(String[] args) {
		File gameHistory = writeFile();
		
		roundsResult(gameHistory, " ");
		readHistory(gameHistory);
	}

	static File writeFile() {

		File file = new File("game_results.txt");
		
		try {
	        if (file.createNewFile()) {
	            System.out.println("Game history file created! " + file.getName());
	        } else {
	            System.out.println("Game history file already exists!.");
	        }
	    } catch (IOException e) {
	        System.out.println("An error occurred while creating the file.");
	    }
		return file;
	}
	
	public static void roundsResult(File file, String resultText) {
	    try (FileWriter writer = new FileWriter(file, true)) { 
	        writer.write(resultText + "\n");
	        System.out.println("Game results successfully saved to " + file.getName());
	    } catch (IOException e) {
	        System.out.println("Error writing to file.");
	    }
	}
	
	public static void readHistory(File file) {
        try (Scanner reader = new Scanner(file)) {
            System.out.println("\n--- Loading Game History ---");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("History file not found.");
        }
    }
}
