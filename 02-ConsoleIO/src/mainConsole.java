import java.io.InputStream;
import javax.swing.JOptionPane; 
import java.text.NumberFormat; 
import java.util.Locale; //for the Locale formatting
import java.text.DecimalFormat; 
import java.util.Scanner; 




public class mainConsole {
   
	public static void main(String[] args) {
		
		String myString = "\"My String\""; 
		static final double PI = 3.14159;
		
	
		
		System.out.println(myString + " this is an example of double quotes using \\\" ");
		/**   This ** Double Asterisk triggers the "javadoc" program to collect all comments in your code, for manuals and printing. 
		 *   \" Double Quote
		 *   \' Single Quote
		 *   \\ Backslash
		 *   \n Newline
		 *   \t Tab
		 *   \r Carraige Return 
		 */
		double price = 19.8; 
		
	
		System.out.printf("$%6.2f", price);
		System.out.println(); 
		
		String name = "magic apple"; 
		System.out.printf("$%6.2f for each %s. %n", price, name);
		System.out.println(); 
		
		System.out.println("Default Location:");
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		
		System.out.println(moneyFormatter.format(19.8));
		System.out.println(moneyFormatter.format(19.8111111));
		System.out.println(moneyFormatter.format(19.8999999));
		System.out.println(moneyFormatter.format(19));
		System.out.println(moneyFormatter.format(1900000000.8));
		System.out.println();
		
		
		System.out.println("British Location:");
		moneyFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.println(moneyFormatter.format(19.8));
		System.out.println(moneyFormatter.format(19.8111111));
		System.out.println(moneyFormatter.format(19.8999999));
		System.out.println(moneyFormatter.format(19));
		System.out.println(moneyFormatter.format(1900000000.8));
		System.out.println();
		
		System.out.println("Decimal Formatting:");
		DecimalFormat pattern00dot000 = new DecimalFormat("00.000"); 
		DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
		
		double d = 12.3456789;
		System.out.println("Pattern 00.000");
		System.out.println(pattern00dot000.format(d));
		System.out.println("Pattern 0.00");
		System.out.println(pattern0dot00.format(d));
		System.out.println();
		
		Scanner keyboard = new Scanner (System.in); //System.in is the console.
		
		System.out.println("Type in \"jelly beans\":");
		String string1 = keyboard.next(); 
		String string2 = keyboard.next(); 
		
		System.out.println("When I type \"jelly beans\", string1 becomes " + string1 + ". string2 becomes" + string2);
		
		System.out.println("Enter number of peas in a pod:");
	
		int numberOfPeas = keyboard.nextInt(); 
		
		System.out.println("Enter number of pods:");
		int numberOfPods = keyboard.nextInt(); 
		
		int totalNumPeas = numberOfPeas * numberOfPods; 
		
		System.out.println("The number of Peas is:" + numberOfPeas + "  The number of Pods is: " + numberOfPods); 
		System.out.println("The total number of peas = " + totalNumPeas); 
		
		System.out.println();
		System.out.println();
		
		System.out.println("Now we will demonstrate a Scanner Problem:");
		
		System.out.println ("Enter the values: ");
		int nn = keyboard.nextInt(); 
		keyboard.nextLine(); 
		
		String s1 = keyboard.nextLine(); 
		String s2 = keyboard.nextLine();
		
		System.out.println( " = " + nn);
		System.out.println();
		System.out.println();
		
		
	}
}

/*
 * Excercise 3: Write a program that reads in two integers typed on the keyboard 
 * and outputs their sum, difference, and product. 
 * 
 * Excrcise 4: An automobile is used for commuting purpose. Write a program that takes as input
 * the distance of the commute in miles, 
 * the automobile's fuel consumption rate in miles per gallon, 
 * and the price of a gallon of gas. 
 * The program should then output the cost of the commute.  
 * 
*/ 