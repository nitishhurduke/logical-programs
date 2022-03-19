package even_odd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		boolean flag = false;
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter A Number: ");
				int no = 0;
				while (!flag) {
					String noString = scanner.next();

					try {
						no = Integer.parseInt(noString);
						flag = true;
					} catch (NumberFormatException e) {
						System.out.println("Invalid Number..Try Again..");
						System.out.print("Enter Correct Number: ");
					} catch (NullPointerException e) {
						System.out.println("Number Can NOT be Null..Try Again..");
						System.out.print("Enter Correct Number: ");
					}
				}
				checkNumber(no);
				System.out.println();
				flag = false;
			}
		}
	}

	private static void checkNumber(int no) {

		if (no % 2 == 0) {
			System.out.println(no + " is an Even Number");
		} else {
			System.out.println(no + " is an Odd Number");
		}
	}

}
