import java.util.Scanner; 

//============================================================================
// DESCRIPTION : Exercise 3 - Scanner with Integers
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 08/22/2015
//============================================================================

/*
 * Exercise 3: Write a program that reads in two integers typed on the keyboard 
 * and outputs their sum, difference, and product.  
 */

public class scannerBasics{
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		int 	a = 0; 
		int 	b = 0; 
		int 	functionValue = 0; 
		
		System.out.println("Enter two integers: "); 
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		
		functionValue = a + b; 
		System.out.println("The sum " + a + " + " + b + " is: " + functionValue);
		
		functionValue = a - b; 
		System.out.println("The difference " + a + " - " + b + " is: " + functionValue);
		
		functionValue = a * b;
		System.out.println("The product " + a + " * " + b + " is: " + functionValue);
		
		
	}
};