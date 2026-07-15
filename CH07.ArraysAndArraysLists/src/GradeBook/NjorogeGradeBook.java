/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/09/2026
 * PURPOSE: PROGRAM HAS ARRAYS THAT HOLD STUDENT GRADES AND TEST SCORES.
 */

package GradeBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NjorogeGradeBook {
	public static void main(String[] args) {
		ArrayList<String> grades = readFile();
		
	}
	public static ArrayList<String> readFile() {
		
		int index = 0;
		double total;
		int ScoreCount;
		Scanner keyboard = new Scanner(System.in);
		
		var grades = new ArrayList<String>();
		
		System.out.print("What is the folder path name? ");
		String folderPath = keyboard.nextLine();
		
		System.out.print("What is the file name? ");
		String folderName = keyboard.nextLine();
		
		File myFile = new File(folderPath, folderName);
		
		try (Scanner inputFile = new Scanner(myFile)) {
		{
		   while (inputFile.hasNext())
		   {
			   grades.add(inputFile.next());
		   }
		}
	}
		   catch (FileNotFoundException e) {
				 System.out.println("File not found at " + myFile.getAbsolutePath());
			 }
		return grades;
	}
	public static void parallelMade(String[][] numbers) {
	
		var name = new String[5];
		var average = new double[5];
		var letterGrades = new char[5];
		int scoreCount;
		double total;
		
		for (int row = 0; row < numbers.length; row++) {
			total = 0.0;
		    scoreCount = 0;
		    
		    for (int col = 0; col < numbers[row].length; col++) {
		    	if (col == 0) {
	                name[row] = numbers[row][col]; 
	            } else {
	                total += Double.parseDouble(numbers[row][col]);
	                scoreCount++;
	            }
		    }
		    
		    name[row] = numbers[row][0];
		    average[row] = total / scoreCount;
		    letterGrades[row] = gradeLevel(average[row]); 
		    
		    System.out.printf("%-12s | Average: %8.2f | Grade: %s%n", 
	                name[row], average[row], letterGrades[row]);
		}
	}
	public static char gradeLevel(double average) {
		        if (average >= 90) return 'A';
		        if (average >= 80) return 'B';
		        if (average >= 70) return 'C';
		        if (average >= 60) return 'D';
		        return 'F';
		    }
}
	

