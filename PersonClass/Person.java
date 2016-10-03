

public class Person { //must match filename 

	
		 public void 	 	 setFirstName (String str)  {firstName = new StringBuffer (str);} 
		 public void	 	 setLastName  (String str)	{lastName = new StringBuffer  (str);}
		 public void 	 	 setAge 	  (int i)		{age = i;}
		 public void 	 	 setSSN 	  (String str)	{ssn = new StringBuffer   	  (str); }
		 
		 
		 public StringBuffer getLastName  (){return lastName;}
		 public StringBuffer getFirstName (){return firstName;}
		 public int 		 getAge		  (){return age;}
		 public StringBuffer getSSN 	  (){return ssn;}
		
		 
		 
		 
		//Class Variables
		private StringBuffer firstName;
		private StringBuffer lastName;
		private int age; 
		private StringBuffer ssn; 
		
		//Class methods
}

//there can be only ONE "public" class per file. 

