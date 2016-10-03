

public class PersonTest {
	
	public static void main (String [] args){
		
		Person joe;
		joe = new Person (); 
		
		Person sue = new Person (); 
			
		joe.setFirstName("Joe"); 
		joe.setLastName("Jonas");
		joe.setAge(21); 
		joe.setSSN("123-45-6789"); 
		
		sue.setFirstName("Sue"); 
		sue.setLastName("Smith");
		sue.setAge(20); 
		sue.setSSN("222-45-6789"); 
		
	}
	
}
