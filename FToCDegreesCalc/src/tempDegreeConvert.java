import java.text.DecimalFormat; 
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
		
		String pattern = ("#0.0#");
		DecimalFormat decimalPattern = new DecimalFormat(pattern); 
		
		
		System.out.println("We will convert Farenheit to Celsius");
		System.out.println("Enter the temperature in degrees farenheight:");
		
		tempInF = keyboard.nextDouble(); 
		//(5/9) * (tempInF - 32)
		tempInC = ((tempInF - 32)*5)/7 ; 
		
		System.out.println(decimalPattern.format(tempInF) + DEGREE +"F = " + decimalPattern.format(tempInC) + DEGREE + "C");

	}
}


