import java.util.Objects;

//============================================================================
// DESCRIPTION : Lab 4 - Rectangle Class 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 10/10/2015
//============================================================================
public class Rectangle {
	
	//member variables
	private double width, height; 
	private String color; 
	
	Rectangle (){ width = 1; height = 1; color = "white"; } //default constructor
	Rectangle ( double w, double h, String c) {width = w; height = h; color = c;} //other constructor 
	Rectangle ( Rectangle toCopy){width = toCopy.width; height = toCopy.height; color = toCopy.color;}//copy constructor 
	
	
	
	public double getWidth 	 (){return width;}
	public double getHeight	 (){return height;}
	public String getColor 	 (){return color;}
	
	public boolean setWidth	 (double w)	{width = w;  return true;}
	public boolean setHeight (double h)	{height = h; return true;}
	public boolean setColor  (String c) {color = c;  return true;}
	
	public double findArea   (){double area = width * height; return area;}
	
	public String toString (){return "Width: " + width + " Height: " + height + " Color: " + color;}; 
	
	public boolean equals (Object rect){
		if(this == rect){
			return true;
		}
		if(rect == null || getClass() != rect.getClass()){
			return false; 
		}
		
		Rectangle rect1 = (Rectangle)rect; 
		return Objects.equals(width, rect1.width)
				&& Objects.equals(height, rect1.height)
				&& Objects.equals(color, rect1.color);
	}
	
	
	
	
}