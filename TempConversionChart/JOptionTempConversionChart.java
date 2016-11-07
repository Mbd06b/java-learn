//============================================================================
// DESCRIPTION : Temp Farenheit to Celsius Conversion Table Generator
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 10/03/2016
//============================================================================

import java.text.DecimalFormat;
import javax.swing.JOptionPane; 

public class JOptionTempConversionChart{
	
	public static void main (String [] args){
		
	double 	        tempInC = 0;
	double       tempInFLow = 0; 
	double 	    tempInFHigh = 0; 
	int	     incrementTable = 0; //increment
	int		 		 	  i = 0; 
	boolean tableIncomplete = true;
	
	final String   	 DEGREE = "\u00b0"; //degree symbol
	String 		  	pattern = ("#0.0#");
	String	 	displayTable; 
	
	DecimalFormat decimalPattern = new DecimalFormat(pattern); 
	JOptionPane tempCalcWindow = new JOptionPane(); 
		
		
	tempCalcWindow.showMessageDialog(null, "This is a Fahrenheit to Celsius Conversion Table Generator\n");
	
	tempInFLow  	= Double.parseDouble(tempCalcWindow.showInputDialog("Enter Low Temperature in Fahrenheit:"));
	tempInFHigh 	= Double.parseDouble(tempCalcWindow.showInputDialog("Enter High Temperature in Farenheit:"));
	incrementTable	= Integer.parseInt	(tempCalcWindow.showInputDialog("Enter increment to display:"));
	
		//The conversion table
	displayTable = ("Fahrenheit    Celsius\n" ); //4-spaces
		
		//Builds the table with one big string. 
		while(tableIncomplete){
			
			tempInC = ((tempInFLow - 32)*5)/9;
			displayTable = (displayTable + decimalPattern.format(tempInFLow) + DEGREE +"F    =    " + decimalPattern.format(tempInC) + DEGREE + "C\n" );
			
			if(tempInFLow == tempInFHigh){ 
				tableIncomplete = false; 
			}else if((tempInFLow + incrementTable) > tempInFHigh){ //if incrementing goes past our target
					tempInFLow 		= tempInFHigh;
					tempInC 		= ((tempInFLow - 32)*5)/9;
					displayTable 	= (displayTable + decimalPattern.format(tempInFLow) + DEGREE +"F    =    " + decimalPattern.format(tempInC) + DEGREE + "C\n" );
					tableIncomplete = false; //end loop
				}
	
			tempInFLow += incrementTable; 
				
			}
		tempCalcWindow.showMessageDialog(null, displayTable);
		System.exit(0);
	}
}