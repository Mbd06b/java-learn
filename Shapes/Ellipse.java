// COSC 1337.S70  (INEW 2230.S01) 11/18/2015 mbd06b(Mdowell1)- Lab 7

public class Ellipse extends Shape{

	private Integer rMajor;
	private Integer rMinor; 
	
	Ellipse(){
		super(null, null); //unknown origin of Shape.  
		rMajor = null; 
		rMinor = null; 
		System.out.println("Ellipse null Constructor Called");
	}
	
	Ellipse(Integer x1, Integer y1, Integer rMajor, Integer rMinor){
		super(x1, y1); //sets xOrigin & yOrigin; 
		
		this.rMajor = rMajor;
		this.rMinor = rMinor; 
		System.out.println("Ellipse Constructor Called");
		
	}
	
	Ellipse(Integer x1, Integer y1, Integer radius){
		super(x1, y1); 
		rMajor = radius; 
		rMinor = null; //Circle needs only one r-value. 
		System.out.println("Ellipse(Circle) constructor Called");
	}
	
	
	// move() is inherited from the abstract Shape method.  

	
	@Override
	public boolean draw() {
		System.out.println("Ellipse draw()"); 
		return true;
	}


	@Override
	public boolean erase() {
		System.out.println("Ellipse erase()"); 
		return true;
	}
	
}
