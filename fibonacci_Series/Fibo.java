package fibonacci_Series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibo {

	public static double fibo;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int no = sc.nextInt();
//		System.out.print("Length of the series: ");
//		int length = sc.nextInt();
//		fiboUsingArrayList(start, length);
//		fiboUsingArray(start, length);
//		recursion(1);
		
	   System.out.println("fibonacci number : "+fiboRecursion(no));  	
		
	}

	public static void fiboUsingArrayList(int start, int length) {
		List<Integer> fibo = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			if (i == 1) {
				start = start + 1;
			} else if (i > 1) {
				start = fibo.get(i - 1) + fibo.get(i - 2);
			}

			fibo.add(start);
		}

		System.out.println(fibo);

	}

	public static void fiboUsingArray(int start, int length) {
		int[] fibo = new int[length];

		for (int i = 0; i < length; i++) {
			if (i == 1) {
				start = start + 1;
			} else if (i > 1) {
				start = fibo[i - 2] + fibo[i - 1];
			}

			fibo[i] = start;
		}

		System.out.println(Arrays.toString(fibo));

	}

	public static void recursion(int no) {
		System.out.println(no);
		if (no < 10) {
			no = no + 1;
			recursion(no);
		}
	}

	public static double fiboRecursion(double no) {
	  
	  if(no == 0) {
		  fibo = 0;
	  }else if(no == 1) {
		  fibo = 1;
	  }else if(no > 1) {
			  fibo = fiboRecursion(no - 2) + fiboRecursion(no-1);
	  }
		return fibo;
	}

}
