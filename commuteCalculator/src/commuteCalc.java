import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner; 

//============================================================================
// DESCRIPTION : Exercise 4: Commute Calculator 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 09/26/2015
//============================================================================

/*
 * Exercise 4: An automobile is used for commuting purpose. Write a program that takes as input
 * the distance of the commute in miles, 
 * the automobile's fuel consumption rate in miles per gallon, 
 * and the price of a gallon of gas. 
 * The program should then output the cost of the commute.  
*/ 

public class commuteCalc{
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		double costOfCommute = 0; 
			
		System.out.println("An automobile is used for commuting. \n"
						+ "Enter the distance from destination (in miles):"); 
		
		double 	miles = keyboard.nextDouble(); 
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US); 
		
		System.out.println("Enter the efficiency of the vehicle in miles per gallon(mpg): ");
		double  milesPerGallon = keyboard.nextDouble();
		
		System.out.println("Enter the price for a gallon of gasoline:");
		double  pricePerGallon = keyboard.nextDouble(); 
		 
		System.out.print("\n\n The whole commute is " + (miles*2) + " miles. \n The vehicle gets " + milesPerGallon + "mpg, and gasoline is ");
		System.out.println(moneyFormatter.format(pricePerGallon) + " per gallon");
		costOfCommute = (miles * 2)/milesPerGallon * pricePerGallon;
		
		System.out.print("\n The total cost of a 2-way commute is: ");
		System.out.print(moneyFormatter.format(costOfCommute));
		
		}
		
}