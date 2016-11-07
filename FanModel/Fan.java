import java.util.Objects;

//============================================================================
// DESCRIPTION : Lab 4 - Fan Model Class 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 10/10/2015
//============================================================================
public class Fan {
	
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan ( ) {speed = SLOW; radius = 5; color = "white"; on = false;}
	public Fan ( int speed, double radius, String color, boolean on ){
				this.speed = speed; this.radius = radius; this.color = color; this.on = on;
	}
	public Fan (Fan toCopy) {speed = toCopy.speed; radius = toCopy.radius; color = toCopy.color; on = toCopy.on;} 

	public int 	 	 getSpeed 	( ) {return speed;}
	public double 	getRadius 	( ) {return radius;}
	public String 	getColor 	( ) {return color;}
	
	public void 	setSpeed 	( int speed ) 	  {this.speed = speed;}
	public void 	setRadius	( double radius	) {this.radius = radius;}
	public void 	setColor 	( String color )  {this.color = color;}
	public void 	setOn 	 	(boolean status)  {on = status;}
	
	public boolean isOn () {
		return on; 
	}
	
	public boolean equals (Object fan){
		if(this == fan){
			return true;
		}
		if(fan == null || getClass() != fan.getClass()){
			return false; 
		}
		
		Fan fan1 = (Fan)fan; 
		return Objects.equals(speed, fan1.speed)
				&& Objects.equals(radius, fan1.radius)
				&& Objects.equals(color, fan1.color)
				&& Objects.equals(on, fan1.on); 
	}
	
	
	public String toString () {
		String statusStr; 
		String speedStr; 
		
			if(on){
				statusStr = "ON"; 
			}else{
				statusStr = "OFF";
			}
			
			
			switch(speed){
				case 1: speedStr = "Slow";
					break;
				case 2: speedStr = "Medium";
					break;
				case 3: speedStr = "Fast";
					break;
				default: 
					speedStr = "SPEED ERROR, your fan killed everyone";
			}
			
		
		return "Speed: " + speedStr + ", Radius: " + radius + ", Color: " + color + ", Status: " + statusStr;
		}
	
	
}
