package recursion;

public class StringRecursion {
//Write a recursive function to reverse a given string. 
	
	public static void main(String[] args) {
		//instantiate a string and pass to the recursive method
		String x = "Spagetti-cheese casserole with cornflake crumbs.";
		System.out.println("Supper tonight was: " + x);
		System.out.println("We will now reverse the string.");
		System.out.println(StringReverse(x));
		
	}
	
	public static String StringReverse(String str) {
		//base case if there are no char or only one char - cannot reverse in that case
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    //pass in the string minus first char and attach first char at the end
	    //when looped over, this reverses the whole string
	    return StringReverse(str.substring(1)) + str.charAt(0);
	}
}