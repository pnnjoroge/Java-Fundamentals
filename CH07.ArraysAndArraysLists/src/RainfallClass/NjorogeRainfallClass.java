
/*
 * AUTHOR: PAULETTE NJOROGE
 * DATE: 04/08/2026
 * PURPOSE: PROGRAM IS AN ARRAY THAT ENQUIRES DATA OF RAINFALL FOR EACH MONTH OF THE YEAR FROM THE USER, STORES IT AND CALCULATES THE 
 * 			TOTAL, AVERAGE, THE MONTH WITH THE MOST RAINFAL AND THE LEAST RAINFALL.
 */

package RainfallClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NjorogeRainfallClass {
	
	public static void main(String[] args) {
		
	double totalRainfall = 0;
	double averageRainfall;
	Double maxRainfall;
	Double minRainfall;
	int maxIndex;
	int minIndex;
	String maxMonth;
	String minMonth;

		
	String[] months = {"January","February", "March", "April", "May", "June", "July", 
							"August", "September", "October", "November", "December"};
	
	
	var monthsList = new ArrayList<Double>();
	
	Scanner keyboard = new Scanner(System.in);
	
	for (int index = 0; index < months.length; index++) {
		System.out.print("What is the rainfall for " + months[index] + "? ");
		double input = keyboard.nextDouble();
		monthsList.add(input);
	}
	
	
	for(double rainfall : monthsList) {
		totalRainfall += rainfall;
	}
	
	averageRainfall = totalRainfall / (months.length);
	
	
	maxRainfall = Collections.max(monthsList);
	maxIndex = monthsList.indexOf(maxRainfall);
	maxMonth = months[maxIndex];
	
	
	minRainfall = Collections.min(monthsList);
	minIndex = monthsList.indexOf(minRainfall);
	minMonth = months[minIndex];
	
	System.out.println("\nYour entered values for rainfall amount are: " + monthsList + "\n");
	System.out.println("The total rainfall of the year is: " + totalRainfall + "\n"); 
	System.out.println("The average rainfall of the year is: " + String.format("%.2f", averageRainfall) + "\n");
	System.out.println("The maximum rainfall of the year is " + maxRainfall  + " for month " + maxMonth + "\n");
	System.out.println("The minimum rainfall of the year is " + minRainfall + " for month " + minMonth + "\n");
	 	}
	}

