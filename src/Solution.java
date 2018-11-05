/**********************************************************************************************
 * PROJECT: PrimeNumbers
 * 
 * AUTHOR: itshally
 * 
 * FILE: Solution.java
 * 
 * This code checks if the input value is prime number or not, else it will show an error message 
 * if the input value is invalid.
 * 
 * INPUT: 2
 * OUTPUT: Yes, it's a prime number.
 * 
 * INPUT: 55
 * OUTPUT: No, it's not a prime number.
 **********************************************************************************************/
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	
		//gets the value of a number
		System.out.print("Enter any integer number: ");
		
		//try-catch to see if the entered value is a number
		try {
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			
			
			System.out.println("\nIs " + number + " a Prime? \n\nAnswer: ");
			
			//0 and 1 are not prime
			if(number == 0 || number == 1) {
				System.out.println("No, it's not a prime number.");
			}else {
			
				//check if the number is divisible by itself and 1...
				boolean answer = true;
				for(int x = 2; x < Math.sqrt(number); x++) {
					if(number%x == 0) { 
						answer = false;
					}
				}
	
				
				/**
				 * To use while loop... 
				 * 	
				 * 	int x = 2;  //it starts with 2 because 0 and 1 are not prime numbers
				 * 	while(x < Math.sqrt(number)){
				 * 		if(number%x == 0){
				 * 			answer = false;
				 * 		}
				 * 		x++;
				 * 	}
				 * 
				 * */
	
				/**
				 * To use do-while loop... 
				 * 
				 * 	int x = 2;
				 * 
				 * 	do{
				 * 		if(number%x == 0){
				 * 			answer == false;
				 * 		}
				 * 		x++;
				 * 	}while(x < Math.sqrt(number));
				 * 
				 **/
				
				
				//shows the result
				if(answer == false) {
					System.out.println("No, it's not a prime number.");
				}else {
					System.out.println("Yes, it's a prime number.");
				}
			}//end of else
		}catch(Exception ex) {
			//this will be the output if it's invalid
			System.out.println("\nPlease enter an integer number only");
		}
		
	}

}
