package prime_number;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("1.Check Number's Primality" + "\n2.Check All Prime Number in a Range" + "\n Choose: ");
			String noString = scanner.next();

			switch (noString) {
			case "1":
				checkPrimeNo();
				break;
			case "2":
				takePrimesRange();
				break;

			default:
				break;
			}
		}

	}

	private static void takePrimesRange() {
		Scanner scanner = new Scanner(System.in);

		boolean startFlag = false;
		boolean endFlag = false;
		int start = 0;
		int end = 0;

		System.out.println();
		System.out.print("Enter Start Point of Range: ");
		while (!startFlag) {

			String startString = scanner.next();
			try {
				start = Integer.parseInt(startString);
				startFlag = true;
			} catch (Exception e) {
				System.out.println("Invalid Number...");
				System.out.println();
				System.out.print("Enter Correct Start Point: ");
			}

		}
		System.out.print("Enter End Point of Range: ");
		while (!endFlag) {

			String endString = scanner.next();
			try {
				end = Integer.parseInt(endString);
				endFlag = true;
			} catch (Exception e) {
				System.out.println("Invalid Number...");
				System.out.println();
				System.out.print("Enter Correct End Point: ");
			}

		}

		checkPrimesInRange(start, end);

	}

	private static void checkPrimesInRange(int start, int end) {
		int totalCount = 0; 
		List<Integer> primeNumbers = new LinkedList<Integer>();

		for (int no = start; no <= end; no++) {
			if (no <= 2) {
				primeNumbers.add(2);
				totalCount++;
				no = 2;
			} else {
				boolean checkPrime = false;

				prime: for (int i = 2; i <= no; i++) {
					if (no != i && no % i == 0) {
						checkPrime = false;
						break prime;
					} else {
						checkPrime = true;
					}
				}

				if (checkPrime) {
					primeNumbers.add(no);
					totalCount++;
				}
			}

		}
		System.out.println();
		System.out.println("Total "+totalCount+" Prime Numbers found in "+start+" to "+end+" range which are: "  +primeNumbers);
		System.out.println();

	}

	private static void checkPrimeNo() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		String noString = scanner.next();
		int no = Integer.parseInt(noString);

		boolean prime = false;

		if (no == 0 || no == 1) {
			prime = false;
		} else if (no == 2) {
			prime = true;
		} else if (no != 2 && no % 2 == 0) {
			System.out.println(no + " divisible by 2");
			prime = false;
		} else {
			for (int i = 2; i < no; i++) {
				if (no % i == 0 && no != i) {

					System.out.println(no + " divisible by " + i);
					prime = false;
					break;
				} else {
					prime = true;
				}
			}
		}

		System.out.println();
		System.out.println(prime ? no + " is a Prime Number " : "Number is Not a Prime number");
		System.out.println();
	}

}
