package recursion;

public class CountdownRecursion {
	//main method passes an int into the recursive method
	
	public static void main(String[] args) {
		int x = 21;
		System.out.println("We are counting down from " + x);
		countdown(x);
		
	}
	
	public static void countdown(int x) {
		 
		//base case make sure we don't go below 0
		if (x < 1) {
			System.out.println("Done!");
			return ;
		}
		
		System.out.println(x);
		// subtract 1 from the number and pass back into the method
		countdown(x - 1);
		
	}
}