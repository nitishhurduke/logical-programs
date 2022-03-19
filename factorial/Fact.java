package factorial;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double no = 5;
		double fact = 1;
		while (no > 0) {
			fact = fact * no;
			no--;
		}
		System.out.println("Factorial : "+fact);
	}

}
