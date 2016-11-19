
// COSC 1337.S70  (INEW 2230.S01) 11/18/2015 mbd06b(Mdowell1)- Lab 7

//This class is "conceptual" to satisfy the parameters of this lab. 
//I would not create a separate Circle class. I would opt to extend the Ellipse class,
//by including a "special case" of Ellipse to represent the Circle.
//As you can see here, I tried to model that principle in the Circle constructor call.


public class Circle extends Ellipse {

	Circle(){
		super(null, null, null); 
		System.out.println("Circle null Constructor Called");
	}
	
	Circle(Integer x1, Integer y1, Integer radius ){
		super(x1, y1, radius); //Uses ellipse circle constructor. 
		System.out.println("Circle (x1, y1, r) Constructor Called");
	}
	
	// move() is inherited from the abstract Shape method.  
	
	@Override
	public boolean draw() {
		System.out.println("Circle draw()"); 
		return true;
	}

	@Override
	public boolean erase() {
		System.out.println("Circle erase()"); 
		return false;
	}
	
	
}
