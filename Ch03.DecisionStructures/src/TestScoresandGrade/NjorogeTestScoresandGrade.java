
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 03/26/2026
 * PURPOSE: PROGRAM ASKS THE TEST SCORES DATA FROM THE USER, 
 * 			THEN CALCULATES THE AVERAGE AND ASSIGNS A LETTER GRADE BASED ON THE AVERAGE.
 */

package TestScoresandGrade;
import java.util.Scanner;

public class NjorogeTestScoresandGrade {
	

	public static void main(String[] args)
	      {
			double testScore1;
			double testScore2;
			double testScore3;
			double averageTest;
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter your 3 test scores below");
			
			System.out.print("Test 1: ");
			testScore1 = keyboard.nextDouble();
			
			System.out.print("Test 2: ");
			testScore2 = keyboard.nextDouble();
			
			System.out.print("Test 3: ");
			testScore3 = keyboard.nextDouble();
			
			averageTest = (testScore1 + testScore2 + testScore3) / 3;
			
			System.out.printf("Your average is: %.1f\n", averageTest);
					
			if (averageTest < 60)
				 {
				    System.out.println("Your grade is F.");
				  }
				else
					{
				    	if (averageTest < 70)
				    		{	
				             System.out.println("Your grade is D.");
				         }
				           else
				          {
				            if (averageTest < 80)
				           {
				                System.out.println("Your grade is C.");
			             }
				            else
				            {
				              if (averageTest < 90)
				             {
			                System.out.println("Your grade is B.");
				              }
			              else
				              {
				                System.out.println("Your grade is A.");
				              }
				            }
				          }
				    }
	      }
 }
