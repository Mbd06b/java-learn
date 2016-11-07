import java.util.Scanner;
import java.lang.Class;

//============================================================================
//DESCRIPTION : Lab 6 - Arrays 
//CLASS       : COSC 1337.S70  (INEW 2230.S01)
//AUTHOR      : Matthew Dowell
//DATE        : 11/07/2015
//============================================================================

/*

 * Develop methods to:
 * 'main' method
 * Print the array
 * Sort the array (Using your own sort method)
 * Determine the highest value.
 * Determine the lowest value
 * Calculate the average value (double)
 */


public class NumArrayTest {

	public static void main(String[] args) {
		
			int spaces 	 = 0;
			int intValue = 0; 
			int	i 		 = 0; 
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Enter Size of Array");
		System.out.print(">");
				spaces	 = keyboard.nextInt(); 
	
		//Create Array
		GenArray<Integer> numArray = new GenArray<Integer>(Integer.class, spaces);  
		System.out.println("Enter Integer Values of Array");
		
		//Input Values; 
		for(i = 0; i < numArray.length(); i++){
		System.out.print("Array["+i+"]>"); 
		intValue = keyboard.nextInt(); 
		numArray.set(intValue, i);
		}
		
		//Output Array
		System.out.println("Your array is:\n" + numArray.toString()); 
		
		System.out.println("Max value is " + numArray.max());
		System.out.println("Min value is " + numArray.min());
		System.out.println("Average is " + numArray.average()); 
		
		//Sort Array
		System.out.println("Sorting Array!");
		numArray.sort(); 
		
		
		keyboard.close(); 
	}

}
