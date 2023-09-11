package basics.java;

public class GetReverseOfNumber {

	public static void main(String[] args) {
	int n = 23579;
	int newNum = 0;
		while(n > 0) {
			int rem = n % 10;
			newNum = newNum*10+rem;
			n = n/10;
		 }
		System.out.println("Reversed number :: "+ newNum);
	}
}
