import java.util.concurrent.ThreadLocalRandom;

//============================================================================
//DESCRIPTION : Lab 8 - Shape Inheritance with polymorphism
//CLASS       : COSC 1337.S70  (INEW 2230.S01)
//AUTHOR      : Matthew Dowell   
//DATE        : 11/18/2015
//============================================================================


/*
 * From Lab 7 - :  Develop the ‘Shape’ application such that:
‘Rectangle’, ‘Ellipse’, and ‘Triangle’ classes inherit from the ‘Shape’ class. 
Develop the ‘Square’ and ‘Circle’ class where ‘Square’ inherits from ‘Rectangle’ and ‘Circle’ inherits from ‘Ellipse’.
 
‘Triangle’ has no derived class.
For each class, implement the overridden methods ‘draw’, ‘move’, and ‘erase’.  

Each method should only have an output statement such as “Rectangle – draw method” that will be displayed when the method is invoked. 
Implement the default constructors for each class with a corresponding message to be displayed when invoked.

No initializations are required; that is, the output message will be the only executable statement in the constructors.
Do not implement any other methods for these classes ( i.e., ‘toString’, ‘equals’, getters and setters ).
Implement a ‘ShapeTest’ class which will instantiate an object of each class.
Exercise each of the ‘draw’, ‘move’, and ‘erase’ methods of each class
Remember to make sure that there is only a single class per file.

 * */

public class ShapesTest{
	
	static public boolean runMethods(Shape shape){
		
		/*Lab 8 - Polymorphism Parameters 
		 * 
		 * Develop the ‘Shape’ application such that:
		 *  Implement an array of objects of various types (all SIX classes), in any order.
		 *  In some type of a looping structure, demonstrate polymorphism by calling all three
		 *  of the methods, draw, move, and erase. That is, within the curly braces, there will
		 *  be only three method calls.
		 *  Verify that the output messages come from all three methods, from all seven classes.
		 *  The only class that you should have to develop for this class will be the test
		 *  application. The six shape classes from Lab-7 should remain unchanged.
		 */
		
		//generates a random x and y values between 0 and 100 for testing the movement of the shapes. 
		Integer x = new Integer(ThreadLocalRandom.current().nextInt(0, 99 + 1));
		Integer y = new Integer(ThreadLocalRandom.current().nextInt(0, 99 + 1)); 
		shape.move(x, y);
		shape.draw();
		shape.erase(); 
		System.out.println("");
		return true; 
	};
	
	
	public static void main(String[]args){

/*------------Shape (abstract class cannot be called)----
*		Shape was converted to an abstract class for clearer implementation of the child classes. 
*
*		System.out.println("Calling shape null");
*		Shape test = new Shape(); 
*		System.out.println("");
*		
*		System.out.println("Calling shape origin");
*		Shape point = new Shape(1,1); 
*		System.out.println("");
*/
	
//--------------Ellipse -----------------------------------
		System.out.println("Calling Ellipse null");
		Ellipse nullEllipse = new Ellipse(); 
		runMethods(nullEllipse); 
		
	
		System.out.println("Calling circleEllipse");
		Ellipse circleEllipse = new Ellipse(10, 10, 5);
		runMethods(circleEllipse);
		
		
		System.out.println("Calling stdEllipse");
		Ellipse stdEllipse = new Ellipse(20, 30, 10, 15); 
		runMethods(stdEllipse); 
		
		//-------Circle (child of Ellipse)---------------
			
			System.out.println("Calling  nullCircle");
			Circle nullCircle = new Circle(); 
			runMethods(nullCircle); 
		
			
			System.out.println("Calling stdCircle");
			Circle stdCircle = new Circle(10, 10, 5); 
			runMethods(stdCircle); 

//---------------Rectangle---------------------------------
		
		System.out.println("Calling nullRectangle");
		Rectangle nullRectangle = new Rectangle();
		runMethods (nullRectangle); 
		
		System.out.println("Calling stdRectangle");
		Rectangle stdRectangle = new Rectangle(10, 10, 15, 20);
		runMethods (stdRectangle);
		
		System.out.println("Calling squareRect");
		Rectangle squareRect = new Rectangle (10,10, 15);
		runMethods (squareRect);
		
		// -----Square (child of Rectangle)---------------
			System.out.println("Calling null Square");
			Square nullSquare = new Square(); 
			runMethods(nullSquare);
			
			System.out.println("Calling stdSquare");
			Square stdSquare = new Square(10, 10, 15);
			runMethods(stdSquare); 

//----------------Triangle--------------------------------
		
		System.out.println("Calling nullTriangle");
		Triangle nullTriangle = new Triangle(); 
		runMethods(nullTriangle);
		
		System.out.println("Calling stdTriangle");
		Triangle stdTriangle = new Triangle(10, 15, 25, 25,25);
		runMethods(stdTriangle); 
		
		
		System.out.println("Testing Done");
			
	}
}