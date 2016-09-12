import java.io.InputStream;
import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;

//============================================================================
// DESCRIPTION : HelloWorld.java
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 08/22/2015
//============================================================================


public class HelloWorld
{
		public static void main(String[] args) {
			
			System.out.println ( "Hello World, from Matthew!!!" );
			
			
		//Lab 1 - Exercise 5.  
			
//-------------------METHOD 1 ------------------------
			
	String emoString = "hate"; 
			
				System.out.println ("The line of text to be changed is:");
				System.out.println ("I " + emoString + " you.");
			
			emoString = "love"; 
			
				System.out.println ("I have rephrased that string to read:");
				System.out.println ("I " + emoString + " you.");
			
			
			System.out.println("OR - If the following was the perferred method for this exercise, here's another sample:"); 
	
//-------------------METHOD 2 -------------------------------------
			
	String sampleSentance = "I hate these instructions as they are not very clear.";
			
				System.out.println(sampleSentance); 
				System.out.println("Now, I'll find hate with the .indexOf() method of the String class, and replace 'hate' with 'love', by rebuilding the sentance with .substring() method."); 
			
			int locNum = sampleSentance.indexOf("hate"); //grabs location of hate in the string	
				
				String endStr = sampleSentance.substring(locNum + 4); //can be an explicit '4' for the word "hate".
				sampleSentance = sampleSentance.substring(0, locNum) + "love" + endStr; 
			
			//sampleSentance is now " I love these instructions as they are not very clear. 
			
				 locNum = sampleSentance.indexOf("not"); //grabs the location of 'not' in the modified string;
				
				 endStr = sampleSentance.substring(locNum + "not".length() + 1); //"are".length will return a 3,  beginning the new ending at _very clear. + 1 to  delete the extra space 
				 sampleSentance = sampleSentance.substring(0, locNum) + endStr; //reconstructs without  "not"
				 
				 System.out.println (sampleSentance); 
				
		}
}