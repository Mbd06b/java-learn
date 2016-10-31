

//============================================================================
// DESCRIPTION : Lab 5 - Hot Dog Stand Class 
// CLASS       : COSC 1337.S70  (INEW 2230.S01)
// AUTHOR      : Matthew Dowell
// DATE        : 10/31/2015
//============================================================================


public class HotDogStandTest{
	

	public static void main (String [] args){
		

		HotDogStand firstStand = new HotDogStand("Matthew's Hot Dogs");
		
		//System.out.println(firstStand);
		
		firstStand.setDogsSold(HotDogStand.HotDog.NEWYORK, 15 ); 
		firstStand.justSold(); //sells 1 classic dog.  
		firstStand.sellDog(HotDogStand.HotDog.GERMAN); 
		firstStand.setDogsSold(HotDogStand.HotDog.CLASSIC, 3);
		firstStand.sellDog(HotDogStand.HotDog.KOSHER); 
		System.out.println(firstStand);
		
		
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
		
		HotDogStand secondStand = new HotDogStand("Corner Park Brats"); 
		
		secondStand.setDogsSold(HotDogStand.HotDog.TOFU, 2);
		secondStand.sellDog(HotDogStand.HotDog.CLASSIC);
		secondStand.setDogsSold(HotDogStand.HotDog.CHICAGO, 2);
		secondStand.setDogsSold(HotDogStand.HotDog.KOSHER, 10);
		System.out.println(secondStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
		
		
		secondStand.setidNumber("Central Park Brats");
		System.out.println("Renaming and manual accessor 'get' test, Corner Park Brats is now, " + secondStand.getIdNumber() + " Which has sold:");
	    System.out.print("Classic:["   + secondStand.getDogOfTypeSold(HotDogStand.HotDog.TOFU) + "]" +
	    				 " Chicago:["  + secondStand.getDogOfTypeSold(HotDogStand.HotDog.CHICAGO) +"]" +
	    				 " New York:[" + secondStand.getDogOfTypeSold(HotDogStand.HotDog.NEWYORK) +"]" +
	    				 " German:["   + secondStand.getDogOfTypeSold(HotDogStand.HotDog.GERMAN) +"]" +
	    				 " Tofu:[" 	   + secondStand.getDogOfTypeSold(HotDogStand.HotDog.TOFU) +"]" +
	    				 " Kosher:["   + secondStand.getDogOfTypeSold(HotDogStand.HotDog.KOSHER) + "]\n" +
	    				 "Total Stand Sold: " + secondStand.getStandTotal() + "\nTotal Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
	    
		
		
		HotDogStand thirdStand = new HotDogStand("Grime's Special Weiners");
		thirdStand.justSold(); 
		thirdStand.justSold(); 
		thirdStand.setDogsSold(HotDogStand.HotDog.CHICAGO, 3);
		thirdStand.setDogsSold(HotDogStand.HotDog.TOFU, 10);
		System.out.println(thirdStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
		
		System.out.println("Copy Constructor Test, copied Grime's Special Weiners along with it's sales data (see copy constructor comments)");
		HotDogStand fourthStand = new HotDogStand(thirdStand); //Copy Constructor Test
		System.out.println(fourthStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
		
		System.out.println("Refund Test - 10 New York HotDogs Returned to Matthew's Stand");
		firstStand.setDogsSold(HotDogStand.HotDog.NEWYORK, -10);
		System.out.println(firstStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold() + "\n\n");
		
		System.out.println("Refund Exception Test - 16 New York HotDogs Returned to Matthew's Stand");
		firstStand.setDogsSold(HotDogStand.HotDog.NEWYORK, -16);
		System.out.println(firstStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold() + "\n\n");
		
	}

}