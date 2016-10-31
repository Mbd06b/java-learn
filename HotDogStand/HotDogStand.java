import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

//============================================================================
//DESCRIPTION : Lab 5 - Hot Dog Stand Class 
//CLASS       : COSC 1337.S70  (INEW 2230.S01)
//AUTHOR      : Matthew Dowell
//DATE        : 10/31/2015
//============================================================================

/*
 * Savich Absolute Java pg. 339 Proj. 1
 * You operate several hot dog stands distributed throughout town. Define a class named HotDogStand that has an instance
 * variable for the hot dog stand's ID number and an instance variable for how many hot dogs the stand has sold that day. 
 * Create a constructor that allows a user of the class to initialize both values. 
 * 
 *   Also create a method named justSold that increments by one the number of hotdogs the stand has sold.
 *   The idea is that this method will be invoked each time the stand sells a hot dog so that you can track the total number
 *   of hot dogs sold by the stand. Add another method that returns the number of hot dogs sold. 
 *   
 *   Finally, add a static variable that tracks the total number of hot dogs sold by all hot dog stands and a 
 *   static method that returns the value in this variable.
 *   
 *   Write a main method to test your class with at least three hot dog stands that each sell a variety of hot dogs. 
 * 
 */

public class HotDogStand {
	
	private static 	int totalHotDogsSold = 0;
	
	private 	 int [] dogsSold = new int [HotDog.values().length];//returns the #of items in the enum. 
	private    	 String idNumber;
	private		boolean disposeNotCalled; 
	private 	 	int timesCopied = 1; //THE ORIGINAL
	
	
	
	public enum HotDog{
		//create custom inventory variables specific to the dogs being sold. 
		//we could later hard code: $price, $cost, and topping quantities to better estimate inventories.  
			CLASSIC(0, "Just a bun and a dog"),
			CHICAGO(1, "Poppyseed bun, sport peppers, nuclear green relish, mustard, onions, Dill pickle spear, and tomato"),
			NEWYORK(2, "Standard bun and beef dog with mustard and sauerkraut, and sweet onions in a tomato based sauce"),
			GERMAN (3, "Standard bun with Bavarian in-case Bratwurst, beer-mustard, and sauerkraut"),
			TOFU   (4, "Vegan Bun with tofu dog, 100% fillers!"),
			KOSHER (5, "Standard Hebrew National bun and dog.");
		
		private	   String description;
		private final int iNum; //to create a number value to better index elsewhere.  
		
		private HotDog(int iNum, String description){
					   this.description = description;
					   this.iNum = iNum; 
				};
		

		public 	  int 	 geti(){return iNum;}; 
		public String getDesc(){return description;}
		
		//create enum Strings in a preferred print format CLASSIC becomes Classic; 
		@Override
		public String toString(){
						String constName = super.toString();
						return constName.substring(0, 1) + constName.substring(1).toLowerCase(); 
					  }
	}

	
//---------Hot Dog Stand CONSTRUCTOR-------------------------------
//Default 
	HotDogStand (){
		for(int i = 0; i < (HotDog.values().length); i++){
			dogsSold[i] = 0; 
		}
		idNumber = null; 
		disposeNotCalled = true; 
	}
	
//Other Constructor
	HotDogStand (String idNumber){
		for(int i = 0; i < (HotDog.values().length); i++){
			dogsSold[i] = 0; 
		}
		this.idNumber = idNumber;
		disposeNotCalled = true;
	}
	
	
//Copy Constructor
	HotDogStand (HotDogStand toCopy){
		if(toCopy == null){
			 throw new NullPointerException("Null argument - Copy Constructor" ); 
		 }
		   toCopy.timesCopied++; //increases original 1, to 2 and so on. 
		   this.idNumber = toCopy.idNumber;
		   this.idNumber = toCopy.idNumber + " #" + toCopy.timesCopied; 
	 //In a practical sense, I don't think the copy constructor should copy these Hot Dogs Sold count values. 
	 //but for the theoretical purpose of creating an exact copy.. here's what that looks like: 
		this.dogsSold = toCopy.dogsSold;
		totalHotDogsSold += toCopy.getStandTotal(); //increases our static counter.   
	}

	
//Methods
	public static int getTotalDogsSold()			 {return totalHotDogsSold;}
	public		  int getDogOfTypeSold(HotDog option){return dogsSold[option.geti()];}
	public	   String	   getIdNumber()		     {return idNumber;}
	public		  int   getTimesCopied()			 {return timesCopied  - 1;} //- 1 so the original shows as 0; 
	public 		  int    getStandTotal(){
						 	int sum = 0; 
							for(int i = 0; i < (HotDog.values().length); i++){
								sum += dogsSold[i]; 
							}
							return sum; 
						 }
	
	public 	  boolean      setidNumber(String str){
										if(this.equals(str)){
											return false;
										}else{
										this.idNumber = str; return true;}
							}
		
	public 	  boolean	   setDogsSold(HotDog option, int quantity){
	    if ( (getDogOfTypeSold(option)+ quantity) < 0){
	        throw new IllegalArgumentException("Hot Dogs Sold cannot be negative.");
	    }else{
			if(quantity < 0){
				Scanner keyboard = new Scanner (System.in); //System.in is the console.
		    	System.out.println("By using a negative value you are canceling a sale, are you sure you want to continue? (Enter Y or N)\n");
				String confirm = keyboard.next(); 
						if(!confirm.equals("Y")){
							System.out.println("Transaction Cancelled");
							keyboard.close();
							return false; 
						}
				keyboard.close(); 
		 }
		    	
			switch(option){
			case CLASSIC: dogsSold[option.geti()] =  dogsSold[option.geti()] + quantity;
						  System.out.println("Sold " + quantity + " " + option);
						  break;			  
			case CHICAGO: dogsSold[option.geti()] =  dogsSold[option.geti()] + quantity;
						  System.out.println("Sold " + quantity + " " + option);
						  break;				  
			case NEWYORK: dogsSold[option.geti()] =  dogsSold[option.geti()] + quantity;
						  System.out.println("Sold " + quantity + " " + option);
			  			  break;
			case  GERMAN: dogsSold[option.geti()] =  dogsSold[option.geti()] + quantity;
						  System.out.println("Sold " + quantity + " " + option);
			  			  break;
			case    TOFU: dogsSold[option.geti()] =  dogsSold[option.geti()] + quantity;
						  System.out.println("Sold " + quantity + " " + option);
			  			  break;  
			case  KOSHER: dogsSold[option.geti()] =  dogsSold[option.geti()] + quantity; 
						  System.out.println("Sold " + quantity + " " + option);
			  			  break;  
			default: System.out.println("Invalid Hotdog Selection");
					return false; 
		}
	totalHotDogsSold += quantity; 
	return true; //dogsSold was incremented.  
				
	    }			
		    
}
	public boolean  justSold(){
		setDogsSold(HotDog.CLASSIC, 1);
		return true; 
	}
	
	
	public boolean sellDog (HotDog option){
				  setDogsSold(option, 1); 
				  return true;
	}; 

	public	String toString (){
		
		String tempString = this.idNumber + " has sold: \n";
		int i = 0;
		for (HotDog d : HotDog.values()) {
		     tempString += d + ":[" + Array.getInt(dogsSold, i) + "] ";
		     if(i < (HotDog.values().length)){
		    	 i++;
		     }else;
		 }
		tempString += "\nStand Total Sold:" + getStandTotal(); 
		return tempString; 
}
	
	
	public void finalize (){
		
		if(disposeNotCalled){
		System.out.println("Person - finalize method");
		}
	}
	
	public void dispose (){
		disposeNotCalled = false; 
		System.out.println("Person - dispose method"); 
	}
	
	public boolean equals (Object stand){
		if(this == stand){
			return true;
		}
		if(stand == null || getClass() != stand.getClass()){
			return false; 
		}
		
		HotDogStand stand1 = (HotDogStand)stand; 
		return Objects.equals(idNumber, stand1.idNumber)
				&& Objects.equals(dogsSold, stand1.dogsSold);
	}
	
	
}



