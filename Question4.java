package MyAssignment5;

import java.util.Scanner;

public class Question4 {

	
//	Question-4:
//
//		Write a while loop that lets the user enter a number. The number should be
//		multiplied by 10, and the result stored in the variable product. The loop
//		should iterate as long as product contains a value less than 100.
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
	
		
	int product=0;
		
		while ( product<100) {
			
			System.out.println("Enter a number");
			
			 product = scan.nextInt();			 
			 product=product*10;
		}
	}
}
		
