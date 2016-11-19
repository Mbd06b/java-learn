// COSC 1337.S70  (INEW 2230.S01) 11/18/2015 mbd06b(Mdowell1)- Lab 7


public class Triangle extends Shape {
	
	private Integer sideA;
	private Integer sideB;
	private Integer sideC; 
	
	Triangle(){
		super(null,null);
		sideA = null; 
		sideB = null; 
		sideC = null; 
	}
	
	Triangle(Integer xOrigin, Integer yOrigin, Integer sideA, Integer sideB, Integer sideC){
		super(xOrigin, yOrigin); 
		
		this.sideA = sideA; 
		this.sideB = sideB;
		this.sideC = sideC; 
	}

	// move() is inherited from the abstract Shape method.
	
	@Override
	public boolean draw() {
		System.out.println("Triangle draw()"); 
		return true;
	}

	@Override
	public boolean erase() {
		System.out.println("Triangle erase()"); 
		return false;
	}
	
	

}
