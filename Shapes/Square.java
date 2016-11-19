// COSC 1337.S70  (INEW 2230.S01) 11/18/2015 mbd06b(Mdowell1)- Lab 7


//This class is "conceptual" to satisfy the parameters of this lab. 
//I would not create a separate Square class. I would opt to extend the rectangle class,
//by including a "special case" of rectangle to represent the Square.
//As you can see here, I tried to model that principle in the Square constructor call. 

public class Square extends Rectangle {

	
	Square(){
		super(null, null, null); 
		System.out.println("Square null Constructor Called");
	}
	
	Square(Integer x1, Integer y1, Integer side ){
		super(x1, y1, side); //Uses ellipse Square constructor. 
		System.out.println("Square (x1, y1, r) Constructor Called");
	}
	
	// move() is inherited from the abstract Shape method.  
	
	@Override
	public boolean draw() {
		System.out.println("Square draw()"); 
		return true;
	}

	@Override
	public boolean erase() {
		System.out.println("Square erase()"); 
		return false;
	}
	
}
