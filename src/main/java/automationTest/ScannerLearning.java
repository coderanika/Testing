package automationTest;

import java.util.Scanner;

public class ScannerLearning {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		
		float amount = sc.nextFloat();
		
		System.out.println("Your amount " + amount + " consists of");
		
		
		
		int dollars = (int) amount;
		
	    System.out.println(dollars + " dollars");
	    
	    float dollarsfloat = (float) dollars;
	    
	   System.out.println(dollarsfloat);
	    		
	    float remainingAmount = amount - dollarsfloat  ;
	    	
	  System.out.println(remainingAmount);
	  
	  
	  
	}

}
