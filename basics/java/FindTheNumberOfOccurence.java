package basics.java;

public class FindTheNumberOfOccurence {

	public static void main(String[] args) {
		int n = 17171717;
		//Find the occurence of 7
		int count = 0;
		
		while(n > 0) {
			int digit = n % 10;
			if(digit == 7) {
				count++;		
			}
			n = n/10;
		}
		
		System.out.println("Occurence of 7 is :: " + count);

	}

}
