
public class HotDogStandTest{
	

	public static void main (String [] args){
		
		HotDogStand.HotDog menu = null; 
		HotDogStand firstStand = new HotDogStand("Matthew's Hot Dogs");
		
		//System.out.println(firstStand);
		
		firstStand.sellDogs(HotDogStand.HotDog.NEWYORK, 15 ); 
		firstStand.justSold(); 
		firstStand.sellDog(HotDogStand.HotDog.GERMAN); 
		firstStand.sellDogs(HotDogStand.HotDog.CLASSIC, 3);
		firstStand.sellDog(HotDogStand.HotDog.KOSHER); 
		System.out.println(firstStand);
		
		
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
		
		HotDogStand secondStand = new HotDogStand("Corner Park Brats"); 
		
		secondStand.sellDogs(HotDogStand.HotDog.TOFU, 2);
		secondStand.sellDog(HotDogStand.HotDog.CLASSIC);
		secondStand.sellDogs(HotDogStand.HotDog.CHICAGO, 2);
		secondStand.sellDogs(HotDogStand.HotDog.KOSHER, 10);
		System.out.println(secondStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold()+ "\n\n");
		
		
		HotDogStand thirdStand = new HotDogStand("Grime's Special Weiners");
		thirdStand.justSold(); 
		thirdStand.justSold(); 
		thirdStand.sellDogs(HotDogStand.HotDog.CHICAGO, 3);
		thirdStand.sellDogs(HotDogStand.HotDog.TOFU, 10);
		System.out.println(thirdStand);
		System.out.println("Total Hot Dogs Sold: " + HotDogStand.getTotalDogsSold() + "\n\n");
		
	}

}