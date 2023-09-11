package basics.java;

import java.util.Scanner;

public class PrintNthFibonaci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		int b = 1;
		
		int count = 2;
		
		while(count <= n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
		}
		System.out.println(n+"th " + "fibonacii number is :: " + b);
	}

}
