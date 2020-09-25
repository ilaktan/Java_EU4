package Assignment_3;

public class question_7 {
	
	public static void main(String[] args) {
		
		/*
		 * Question-7
		 * 
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * Sample output
		 * 
		 * Price in cents : 95
		 * 
		 * Your change is 0 quarters, 0 dimes, and 1 nickels
		 */
		
		
		/* 1 Quarters= 25 cents
		   1 Dimes=10 cents
		   1 Nickel=5 cents
		   
		 */
		/*Vending Machine accept only 1 dollar coins.so 1 DOLLAR=100 cents*/
		
		int amount, quarters, dimes, nickels,exchange;

		 amount=95;
		 exchange= 100-amount;
		 
	
		 
		 quarters=exchange/25;
		 exchange=exchange%25;
		 
		 dimes=exchange/10;
		 exchange=exchange%10;
		 
		 nickels=exchange/5;
		 exchange=exchange%5;
		 
		 
		 
		 System.out.println("Your change is "+quarters+" quarters "+ 	dimes	+" dimes, and "+nickels+" nickels");
		    

		}
		 
		
	}


