

public class PersonTest {
	
	public static void main (String [] args){
		
		
		System.out.println("Population = " + Person.getPopulation());
		
		Person joe1;
		joe1 = new Person (); 
		joe1.setFirstName("Joe"); 
		joe1.setLastName("Jonas");
		joe1.setAge(21); 
		joe1.setSSN("123-45-6789");
		System.out.println( "Population = " + Person.getPopulation());
		
		
		Person joe2 = new Person ("Joe","Jonas",21,"123-45-6789");
		//System.out.println("Population = " + Person.getPopulation());
		
		Person sue = new Person (); 
		sue.setFirstName("Sue"); 
		sue.setLastName("Smith");
		sue.setAge(20); 
		sue.setSSN("222-45-6789"); 
		System.out.println("Population = " + Person.getPopulation());
		
		
		Person matthew = new Person ("Matthew","Dowell",28,"227-12-1234");
		System.out.println("Population = " + Person.getPopulation());
		
		
		System.out.println( "Sue = " + sue);
		
		
/*
		if( joe1.equals ( sue ) )
			System.out.println(("Joe1 and Sue ARE equal");
		else
			System.out.println( "Joe1 and Sue ARE NOT equal ");
		
		if ( joe1.equals (joe2))
			System.out.println("Joe 1 and Joe2 ARE equal"); 
		else
			System.out.println("Joe1 and Joe2 ARE NOT equal");
*/
		joe1 = joe2 = sue = null;
		System.gc(); 
		
		try{
			Thread.sleep(100);
		}catch (Exception e){}
		
		
		//for(int i = 0; i < 100000000; i++);
		
		System.out.println( "Population = " + Person.getPopulation());
		
		
		
	}
	
}
