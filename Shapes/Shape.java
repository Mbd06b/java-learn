// COSC 1337.S70  (INEW 2230.S01) 11/18/2015 mbd06b(Mdowell1)- Lab 7


//there should be no reason to call "Shape" - since it is an abstract concept.  
public abstract class Shape {
	
	private Integer xOrigin; //origin x-coordinate
	private Integer yOrigin; //origin y-coordinate 
	
	public Shape(){
		xOrigin = null; 
		yOrigin = null; 
		System.out.println("Shape - null Constructor Called"); 
	}

	public Shape(Integer x1, Integer y1){
		xOrigin = x1;
		yOrigin = y1; 
		System.out.println("Shape - (x1, y1)Origin Constructor Called");
	}
	
	//Any movement, or creation will be dependent upon an origin. So we can place the move method here for saved keystrokes.  
	public boolean move(Integer x2, Integer y2){
		xOrigin = x2; 
		yOrigin = y2; //origin changes. 
		
		System.out.println( this.toString() + " (x,y) Origin Moved to: " + "(" + x2 +", " + y2 + ")");
		return true;
	}; 
	
	
	abstract public boolean draw();
	abstract public boolean erase(); 
	 
	
}
