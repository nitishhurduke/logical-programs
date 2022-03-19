package swap_numbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		System.out.print("Pick Number X: ");
		int no1 = pickNum();
		System.out.print("Pick Number Y: ");
		int no2 = pickNum();
		
		no1 = no1 + no2;
		no2 = no1 - no2 ;
		no1 = no1 - no2;
		
		System.out.println("X = "+no1+" and Y = "+no2 );
	}

	private static int pickNum() {
		Scanner scanner = new Scanner(System.in);
		boolean isNumber = false;
		int no = 0;
		
		while(!isNumber) {
			String noString = scanner.next();
			try {
				no = Integer.parseInt(noString);
				isNumber = true;
			} catch (Exception e) {
				System.err.println("Invalid number try again..");
				System.out.print("Enter Number : ");
			}
			
		}
		
		return no;
	}
}
