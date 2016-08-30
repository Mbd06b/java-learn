import java.io.InputStream;
import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;

//============================================================================
// DESCRIPTION : HelloWorld.java
// CLASS       : COSC 1337.S70
// AUTHOR      : Matthew Dowell
// DATE        : 08/22/2015
//============================================================================


public class HelloWorld
{
		public static void main(String[] args) {
			System.out.println ( "Hello World, from Matthew!!!" );
			
			int answer; 
			String firstString = "Hello World, from Matthew's String";
			
			
			answer = 2 + 2; 
			
			System.out.println (answer);
			System.out.println ("Java is not a drink");
			System.out.println ("You like tea");
			
			System.out.println (firstString + " the answer is " + answer); 
			
			firstString = "I don't think you can do this";
			
			System.out.println (firstString + ". Well I was wrong, you can");
			
			boolean test = false; 
			
			if(firstString == "I don't think you can do this"){
				test = true; 
			}else{
				test = false; 
			}
			System.out.println(test);
			
			
		}
}