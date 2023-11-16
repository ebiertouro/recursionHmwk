package recursion;
import java.util.*;

public class NumberFinderRecursion {
	
	public static void main(String[] args) {
		
		//main method instantiates an array, sorts it, and passes it into the recursive method
		int[] array = {7, 14, 21, 6, 40, 12, 9, 99, 1};
		int x = 40;
		Arrays.sort(array);
		
		int result = finder(array, x, 0, array.length - 1);
		
		//display the results of the recursive search
		System.out.println("Searching for the number " + x + " in the array...");
		
		if (result == -1) 
		    System.out.println("Sorry, that number does not exist in this array.");
		
		else 
		    System.out.println("That number exists at index: " + result);
		}
	
	public static int finder(int [] array, int x, int left, int right)  {
	    if (left <= right) {
	    	//find the middle - changes every time we loop through the recursive search
	        int mid = left + (right - left) / 2;

	        if (array[mid] == x) {
	            return mid; 
	        }
	        //if target is greater than the middle, it is on the right, 
	        //so we move the middle over to the right
	        if (array[mid] < x) {
	            return finder(array, x, mid + 1, right);
	        }
	        //otherwise, target is less than the middle, it is on the left, 
	        //so we move the middle over to the left
	        return finder(array, x, left, mid - 1); 
	    }
	    //if target is not found
	    return -1;
	}
}