package basics.java;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Take input from user till user does not press X or x
		while(true) {
			//Taking operator from user
			System.out.print("Enter the Operator-");
		    char op = s.next().trim().charAt(0);
			if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.print("Enter first operands - ");
				float num1 = s.nextFloat();
				System.out.print("Enter the second operands - ");
				float num2 = s.nextFloat();
				
				if(op == '+') {
					float ans = num1 + num2;
					System.out.println("Sum of the numbers is :: "+ ans);
				}
				if(op == '-') {
					float ans = num1 - num2;
					System.out.println("Sum of the numbers is :: "+ ans);
				}
				if(op == '*') {
					float sum = num1 * num2;
					System.out.println("Sum of the numbers is :: "+ sum);
				}
				if(op == '/') {
					if(num2 != 0) {
						float sum = num1 / num2;
					       System.out.println("Sum of the numbers is :: "+ sum);
					}	
				}
				if(op == '%') {
					float sum = num1 % num2;
					System.out.println("Sum of the numbers is :: "+ sum);
				}
				if(op == ''X' || op == 'x') {
					break;
				} else {
					System.out.println("Invalid Operations!");
				}
			}			
		}
	}
}
