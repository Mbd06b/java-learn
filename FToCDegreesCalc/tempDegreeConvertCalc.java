import java.text.NumberFormat;
import java.util.Scanner; 

//============================================================================
// DESCRIPTION : Temp Farenheit to Celsius Calculator 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 09/26/2015
//============================================================================

public class tempDegreeConvert{
	
	public static void main (String [] args){
		
		Scanner keyboard = new Scanner (System.in);
		final String DEGREE = "\u00b0"; 
		double tempInF = 0; 
		double tempInC = 0; 
		
		
		System.out.println("We will convert Farenheit to Celsius");
		System.out.println("Enter the temperature in degrees farenheight:");
		
		double tempInF = keyboard.nextDouble(); 
		double tempInC = (5/9) * (tempInF - 32);
		
			
		System.out.println(tempInF + DEGREE +"F = " + tempInC + DEGREE + "C");

	}
}


