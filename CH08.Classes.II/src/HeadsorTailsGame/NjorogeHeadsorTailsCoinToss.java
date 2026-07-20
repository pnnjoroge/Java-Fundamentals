package HeadsorTailsGame;

import java.util.Random;

public class NjorogeHeadsorTailsCoinToss {

	public static void main(String[] args) {
	
		int min = 1;
		int max = 2;
		
		System.out.print("The chosen tossed face is: ");
		
		getRandomNumber(min, max);
	}
		public static int getRandomNumber (int min, int max) {
			
			Random rand = new Random(); 
			
			int number = rand.nextInt(max-min + 1) + min;
			
			switch(number) {
			
			case 1:
				System.out.print("Heads");
			break;
			case 2:
				System.out.print("Tails");
			break;	
			}
			System.out.println("\nThe chosen tossed number is: " + number);
			return number;
		
	}

}
