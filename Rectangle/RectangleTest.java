//============================================================================
// DESCRIPTION : Lab 4 - Rectangle Class 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 10/10/2015
//============================================================================
public class RectangleTest {
	
	public static void main (String [] args){
				
		Rectangle rectDefault = new Rectangle(); 
		Rectangle rectRed = new Rectangle(10, 10, "red"); 
		Rectangle rectYellow = new Rectangle(5, 5, "yellow"); 
		
	
		//overloading the toString() method allows calling the object without the more explicit object.toString() call.
		System.out.println("Default Rectangle: " + rectDefault + " Area is: " + rectDefault.findArea());
		System.out.println("Red Rectangle 1: " + rectRed + " Area is: " + rectRed.findArea()); 
		System.out.println("Yellow Rectangle 2:" + rectYellow + " Area is: " + rectYellow.findArea() + "\n\n");
		
		rectDefault.setHeight(10);
		rectDefault.setWidth(12.3);
		rectDefault.setColor("purple");
		
		System.out.println("Default Rectangle amended with set methods values are now:\n " + rectDefault+ "\n\n");
		
		System.out.println("Default Rectangle displayed with get methods:\n" +
							"Width: " + rectDefault.getWidth() +
							", Height: " + rectDefault.getHeight() +
							", Color: " + rectDefault.getColor() + "\n\n");
		
		Rectangle rectCopy = new Rectangle(rectDefault); 
		
		System.out.println("defaultRect should equal rectCopy: " + rectDefault.equals(rectCopy) + "\n");
		System.out.println("defaultFan should NOT equal rectRed: " + rectDefault.equals(rectRed));
		
		
	}
}