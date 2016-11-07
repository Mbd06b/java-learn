


/** This Person class is constructed with StringBuffer class which is a MUTABLE class. 
//Because it is MUTABLE, we need to DEEP COPY the instance variables for the accessor methods. 
//the standard String class, is IMMUTABLE, which cannot be changed so the shallow is acceptable. 

@author - Matthew Dowell
@version v1.1.1

*/

public class Person { //must match filename 

//------Default Constructor----------------------
		public Person (){
			this ( " ", " ", 0, " "); 
			System.out.println( "Person Class - default constructor" );
		}
	
//------Other Constructor-------------------------
/** @param fn- Person's first name
 *  @param ln - Person's last name
 *  @param a - Person's age
 *  @param s - Person's Social Security Number
  */
		public Person (String fn, String ln, int a, String s){
			firstName = new StringBuffer(fn);
			lastName  = new StringBuffer(ln); 
			age		  = a; 
			population++; 
			disposeNotCalled = true; 
			ssn		  = new StringBuffer(s); 
		}

//-------Copy Constructor ------------------------
/**
 * This is the copy constructor for the Person class 
 * 
 * @param toCopy - the orginial object to be copied
 * @throws NullPointerException - if a null argumen is passed to method.
 */
		public Person (Person toCopy){ 
		 if( toCopy == null){
			 throw new NullPointerException("Null argument - Person Copy Constructor" ); 
		 }
			firstName = new StringBuffer(toCopy.firstName.toString());
			lastName  = new StringBuffer(toCopy.lastName.toString()); 
			age		  = toCopy.age; 
			population++; 
			disposeNotCalled = true; 
			ssn		  = new StringBuffer("000-00-0000"); //we don't really want to copy someone's ssn.  We should hard-code an appropriate placeholder until specifically called.  
		}

//------Methods-------------------------------
		 public void 	 	 setFirstName (String str)  {firstName = new StringBuffer (str);} 
		 public void	 	 setLastName  (String str)	{lastName = new StringBuffer  (str);}
		 public void 	 	 setAge 	  (int i)		{age = i;}
		 public void 	 	 setSSN 	  (String str)	{ssn = new StringBuffer   	  (str);}
		 
		 public StringBuffer getLastName  (){return new StringBuffer (lastName.toString());}  //this returning of a new StringBuffer is known as a "deep copy" which is a reference to a copy.
		 public StringBuffer getFirstName (){return new StringBuffer (firstName.toString());} //the "shallow copy" is a reference to the variable itself.  
		 public int 		 getAge		  (){return age;}
		 public StringBuffer getSSN 	  (){return new StringBuffer (ssn.toString());}
		 public static int   getPopulation(){return population;}
		 
		
		 
		 public String toString(){ //toString is a member of Object class. This helps us execute comparison methods. 
			 String x = "" + firstName + " " + lastName + " " + age + " " + ssn; 
			 return x;
		 }
		 
		//Class Variables
		private  StringBuffer firstName;
		private	 StringBuffer lastName;
		private 		  int age; 
		private  StringBuffer ssn; 
		
		
		//Static Class Variables
		private boolean disposeNotCalled; 
		private static int population;
		
		//a "Static" initialization block
		
		
		//Class methods
		
		public void finalize (){
			
			if(disposeNotCalled){
			population--;
			System.out.println("Person - finalize method");
			}
		}
		
		public void dispose (){
			population--; 
			disposeNotCalled = false; 
			System.out.println("Person - dispose method"); 
		}
		
	
		
		public boolean equals(Object obj) {
			if ( this == obj){
				return true;
			}else{
			
				if( ( obj != null ) && ( getClass() == obj.getClass( ) ) ){
					Person d = ( Person ) obj;
					
					if (  ( firstName.toString().equals(d.firstName.toString()) )  &&
						  ( lastName.toString ().equals(d.lastName.toString())  )  &&
						  ( age == d.age ) ){
						return true; 
					}else{
						return false; 
					}

				
				}
			}
			
			
			
		}
}

//there can be only ONE "public" class per file. 

