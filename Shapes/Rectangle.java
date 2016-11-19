// COSC 1337.S70  (INEW 2230.S01) 11/18/2015 mbd06b(Mdowell1)- Lab 7

public class Rectangle extends Shape {
	
	private Integer length;
	private Integer width; 
	
	Rectangle(){
		super(null, null); 
		length = null;
		width = null; 
		System.out.println("Rectangle Null Constructor Called");
	}

	Rectangle(Integer xOrigin, Integer yOrigin, Integer length, Integer width){
		super(xOrigin, yOrigin);
		this.length = length;
		this.width = width; 
		System.out.println("Rectangle (x1,y1,len,width) Constructor Called"); 
	}
	
	Rectangle(Integer xOrigin, Integer yOrigin, Integer side){
		super(xOrigin, yOrigin);
		length = side;
		width = side; 
		System.out.println("Rectangle-square Constructor Called");
	}
	
	
	
	// move() is inherited from the abstract Shape method.  

	
	@Override
	public boolean draw() {
		System.out.println("Rectangle draw()"); 
		return true;
	}


	@Override
	public boolean erase() {
		System.out.println("Rectangle erase()"); 
		return true;
	}

}
