//============================================================================
// DESCRIPTION : Lab 4 - Fan Model Class 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 10/10/2015
//============================================================================
public class TestFan {

	public static void main(String[] args) {
		
		Fan defaultFan = new Fan(); 
		Fan testFan	   = new Fan(1,10,"yellow", true); 
		
		System.out.println("defaultFan is: " + defaultFan);
		System.out.println("testFan is: " + testFan + "\n\n");
		
		defaultFan.setSpeed(2);
		defaultFan.setRadius(12.5);
		defaultFan.setColor("purple"); 
		defaultFan.setOn(true); 
		
		System.out.println("defaultFan has been amended with set methods and is now\n" + defaultFan + "\n\n");
		System.out.println("defaultFan values displayed with get methods are:\n" +
						   "Speed: " + defaultFan.getSpeed() + ", Radius: " +
						   defaultFan.getRadius() + ", Color: " + defaultFan.getColor() + 
						   ", Status: " + defaultFan.isOn() +"\n\n"); 
		
		Fan copyFan = new Fan(defaultFan); 
		
		System.out.println("defaultFan should equal copyFan: " + copyFan.equals(defaultFan) + "\n");
		System.out.println("defaultFan should NOT equal testFan: " + testFan.equals(defaultFan));
		
		
	}

}
