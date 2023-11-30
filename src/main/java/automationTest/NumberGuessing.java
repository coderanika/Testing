package automationTest;

import java.util.Scanner;

public class NumberGuessing {

	
	// Driver Code
	public static void main(String[] args) {
		
		// Function Call
        guessingNumberGame();
        
	}
		
		public static void
	    guessingNumberGame()
	    {
	        // Scanner Class
	        Scanner sc = new Scanner(System.in);
	        
	        //Math.random() -> It returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
	       //to make it integer we are converting the double value to int by using the format
	        //int number = (int)Math.random();
	 
	        // Generate the numbers
	        int number =  1 + (int)(100	* Math.random());
	                               
	 
	        // Given K trials
	        int K = 10;
	 
	        int i;
	        int guess;
	 
	        System.out.println(
	            "A number is chosen"
	            + " between 1 to 100."
	            + "Guess the number"
	            + " within 10 trials.");
	 
	        // Iterate over K Trials
	        for (i = 0; i < K; i++) {
	 
	            System.out.println(
	                "Guess the number:");
	 
	            // Take input for guessing
	            guess = sc.nextInt();
	 
	            // If the number is guessed
	            if (number == guess) {
	                System.out.println(
	                    "Congratulations!"
	                    + " You guessed the number.");
	                break;
	            }
	            else if (number > guess
	                     && i != K - 1) {
	                System.out.println(
	                    "The number is "
	                    + "greater than " + guess);
	            }
	            else if (number < guess
	                     && i != K - 1) {
	                System.out.println(
	                    "The number is"
	                    + " less than " + guess);
	            }
	        }
	 
	        if (i == K) {
	            System.out.println(
	                "You have exhausted"
	                + " K trials.");
	 
	            System.out.println(
	                "The number was " + number);
	        }
	    }
	 
	    
	    
	 
	        
	    
	

		
		
		
		
		
		
		
		
	}


