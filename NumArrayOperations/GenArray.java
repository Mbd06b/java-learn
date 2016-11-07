import java.lang.reflect.Array;

//============================================================================
//DESCRIPTION : Lab 6 - Arrays 
//CLASS       : COSC 1337.S70  (INEW 2230.S01)
//AUTHOR      : Matthew Dowell
//DATE        : 11/07/2015
//============================================================================

/*
 * Develop a program which allows the user to enter numbers into an array. Input will be as follows:
 * The user will enter the total number of integers to be entered into the array. (Use array size of 5)
 * The user will then enter that number of unique integers (negative or positive)). Do not allow the numbers
 * of values entered to exceed the array size. 
 * 
 * Develop methods to:
 * 'main' method
 * Print the array
 * Sort the array (Using your own sort method)
 * Determine the highest value.
 * Determine the lowest value
 * Calculate the average value (double)
 */


public class GenArray<T> { //T for type(int, double, char, ecetera...)
	
	private T[] 	array;
	private	int		lineWrap; //aid to wrap line after printing "lineWrap" number of elements if a custom value is perferred.
	
	public GenArray(Class<T> type, int size){
		
		@SuppressWarnings("unchecked") 
		final T[] array = (T[]) Array.newInstance(type, size); 
		this.array = array;
		lineWrap = size; 
	}
	
	public T get(int i){
		return array[i];
	}
	
	public int length(){
		return array.length;
	}
	
	public boolean set(T value, int i){
			if(i > array.length){
				System.out.println("Index out of bounds - assignment failed");
				return false;
			}else{
				array[i] = value; 
				return true; 
			}
			
	}
	public int max(){
		int largestValue = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++){
			if((Integer)array[i] > largestValue){
				largestValue = (Integer)array[i]; 
			}
		}
		return largestValue; 
	}
	
	public int min(){
		int lowestValue = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++){
			if((Integer)array[i] < lowestValue){
				lowestValue = (Integer)array[i]; 
			}
		}
		return lowestValue; 
	}
	
	public int sum(){
		int sum = 0; 
		for(int i = 0; i < array.length; i++){
			sum += (Integer)array[i];
		}
	return sum; 
	}
	
	public double average(){ 
		return 1.0d * this.sum()/array.length; //casts sum to double to return the proper average. 
	}
	
	public void sort(){
		boolean sorted = true; 
		T temp; 
		int i; 
		int numElements = array.length; 
		do{
			sorted = true;
			numElements--; 
			for(i = 0; i < numElements; i++){
				if(((Integer) array[i]).compareTo((Integer)array[i + 1]) > 0){ //TODO Figure out a cast, or method that allows the compareTo of a Generic Type
					temp = array[i]; 
					array[i] = array[i + 1];
					array[i + 1] = temp; 
					sorted = false; 
				}else; 
			}	
		System.out.println(this.toString());
		}while(!sorted); 
		System.out.println("Array Sorted!");
	};
	
	//Output Values;
	public String toString(){
		String tempString = ""; 
		for(int i = 0; i < array.length; i++){
				tempString += "array["+i+"] = " + array[i] + " "; 
				if((i != 0) && (i % lineWrap == 0)){tempString += "\n";}else; //line wrap every "lineWrap" 
			}
		return tempString; 
	}
	
	
	

}
