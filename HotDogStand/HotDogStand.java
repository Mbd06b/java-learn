import java.lang.reflect.Array;

/*
 * pg. 339 Proj. 1
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
	
	private 	int [] dogsSold = new int [HotDog.values().length];//returns the #of items in the enum, -1 for base 0 array.  
	private    	 String idNumber;
	
	
	
	public enum HotDog{
		//create custom inventory variables specific to the dogs being sold. 
		//we could later hard code: $price, $cost, and topping quantities to better estimate inventories.  
			CLASSIC(0, "Just a bun and a dog"),
			CHICAGO(1, "Poppyseed bun, sport peppers, nuclear green relish, mustard, onions, Dill pickle spear, and tomato"),
			NEWYORK(2, "Standard bun and beef dog with mustard and sauerkraut, and sweet onions in a tomato based sauce"),
			GERMAN (3, "Standard bun with Bavarian in-case Bratwurst, beer-mustard, and sauerkraut"),
			TOFU   (4, "Vegan Bun with tofu dog, 100% fillers!"),
			KOSHER (5, "Standard Hebrew National bun and dog.");
		
		private String description;
		private final int iNum; //to create a number value to better index elsewhere.  
		private HotDog(int iNum, String description){
			this.description = description;
			this.iNum = iNum; 
		};
		

		public int geti(){return iNum;}; 
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
	}
	
//Other Constructor
	HotDogStand (String idNumber){
		for(int i = 0; i < (HotDog.values().length); i++){
			dogsSold[i] = 0; 
		}
		this.idNumber = idNumber; 
	}
	
//Copy Constructor
	HotDogStand (HotDogStand toCopy){
		this.dogSold[] = toCopy.dogsSold[];
		this.idNumber = toCopy.idNumber; 
	}

	
//Methods
	
	public static int getTotalDogsSold(){return totalHotDogsSold;}
	public 		  int    getStandTotal(){
						int sum = 0; 
							for(int i = 0; i < (HotDog.values().length); i++){
								sum += dogsSold[i]; 
							}
							return sum; 
						}
	
	boolean 	shutDown

	
	public String toString (){
	
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
			
	public boolean sellDog (HotDog option){
		
			switch(option){
				case CLASSIC: dogsSold[option.geti()]++; 
							  System.out.println("Sold 1 " + option);
							  break;			  
				case CHICAGO: dogsSold[option.geti()]++; 
							  System.out.println("Sold 1 " + option);
							  break;				  
				case NEWYORK: dogsSold[option.geti()]++; 
							  System.out.println("Sold 1 " + option);
				  			  break;
				case  GERMAN: dogsSold[option.geti()]++; 
							  System.out.println("Sold 1 " + option);
				  			  break;
				case    TOFU: dogsSold[option.geti()]++; 
							  System.out.println("Sold 1 " + option);
				  			  break;  
				case  KOSHER: dogsSold[option.geti()]++; 
							  System.out.println("Sold 1 " + option);
				  			  break;  
				default: System.out.println("Invalid Hotdog Selection");
						return false; 
			}
			totalHotDogsSold++; 
			return true; //dogsSold was incremented.  
	}; 
	
	
	
	public boolean  justSold(){
						sellDog(HotDog.CLASSIC);
						return true; 
					}
	
	public boolean sellDogs (HotDog option, int quantity){
		
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
	}; 

	

	
	
}



