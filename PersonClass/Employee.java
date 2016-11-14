

public class Employee extends Person{
	
	private String employeeID;
	private String title;
	private double salary; 
	
	public Employee (String fn, String ln, int a, String s){
		
	}
	
	public Employee (String fn, String ln, int a, String s, String eid, String t, double d){
		
		super(fn, ln, a, s); //goes straight to the Person class, and executes the parent, 
							 //argument list and constructor this is only one level. 
							 //otherwise we would have to call firstName = fn; lastName =ln; and so on.  
		employeeID = eid;
		title = t; 
		salary = d; 
		
		
	}
	
}