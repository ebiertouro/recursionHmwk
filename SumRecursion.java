package recursion;

public class SumRecursion {
	
	public static void main(String[] args) {
		int x = 21432;
		System.out.println("The sum of the digits in " + x + " is: " + SumDigits(x));
		
	}
	
	public static int SumDigits(int x) {
		
		//base case = make sure we don't go below one digit
		if (x < 10) {
			return x;
		}

		//take off the last digit
		int divDigit = x/10;
		int multDigit = divDigit*10;
		int lastDigit = x - multDigit;
		
		//pass in the original number minus the last digit
		return lastDigit + SumDigits(divDigit);

	}
}