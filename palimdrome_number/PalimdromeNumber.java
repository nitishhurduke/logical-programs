package palimdrome_number;
/* 	
 * PALIMDROME NUMBER
 * 
 * A palindromic number is a number that remains the same when its digits are reversed.
 *
 * */
import java.util.Scanner;

public class PalimdromeNumber {

	public static void main(String[] args) {
		while(true) {
		int no = pickANumber();
		System.out.println(isPalimdrome(no)?no+" is a Palimdrome Number":no+" is NOT a Palimdrome Number");
		}
	}

	private static int pickANumber() {
		Scanner scanner = new Scanner(System.in);
		boolean numCheck = false;
		int no = 0;
		while (!numCheck) {
			System.out.print("Enter a Number: ");
			String noString = scanner.next();
			try {
				no = Integer.parseInt(noString);
				numCheck = true;
			} catch (Exception e) {
				System.err.println("Invalid Number Try Again..");
			}
			
		}

		return no;
	}
	
	private static boolean isPalimdrome(Integer no) {
	 boolean isPalimdrome = false;
	 int revNumber = 0;
	 int tempNum = no;
			 
	 /*Reversing Number
	  * */
	 
	 while(tempNum>0) {
		 int rem = tempNum% 10;
		 revNumber = revNumber * 10 + rem;
		 tempNum /= 10;
	 }
	 
	 /* Using String Buiilder
	  
	 StringBuilder noString = new StringBuilder(no.toString());
	 noString.reverse();
	 revNumber = Integer.parseInt(noString.toString());
	 */
	 
	 
	 if(no == revNumber) {
		 isPalimdrome = true;
	 }
	 
	 
	 
	 return isPalimdrome;
	}
}
