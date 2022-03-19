package armstrong_number;
/*
What is an Armstrong Number?
 A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself. For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more
 * 
 * */

import java.util.Scanner;

public class Armstrong {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int no = pickNumber();
			System.out.println(checkArmtrong(no) ? no + " is an Armstrong Number" : no + " is NOT an Armstrong Number");
		}

		/*
		 * if (checkArmtrong(no)) { System.out.println(no + " is an Armstrong Number");
		 * } else { System.out.println(no + " is NOT an Armstrong Number"); }
		 * 
		 */

	}

	private static boolean checkArmtrong(Integer no) {
		boolean isArmstrong = false;
		int digits = no.toString().length();
		int sum = 0;
		int tempNo = no;

		while (tempNo > 0) {

			int rem = tempNo % 10;

			sum = sum + (int) Math.pow(rem, digits);

			tempNo /= 10;

		}

		if (sum == no) {

			isArmstrong = true;
		}

		return isArmstrong;
	}

	private static int pickNumber() {
		boolean noCheck = false;
		int no = 0;
		while (!noCheck) {
			System.out.print("Enter a Number : ");
			String noString = scanner.next();

			try {
				no = Integer.parseInt(noString);
				noCheck = true;
			} catch (Exception e) {
				System.err.println("Invalid Number..Try Again");
			}

		}
		return no;
	}
}
