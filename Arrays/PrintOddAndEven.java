package interview;

public class PrintOddAndEven {

	static void printOddAndEven(int arr[], int n) {
		if(n == 0) {
			System.out.println("Enter Valid group of elements!");
			return;
		}
		for(int i : arr) {
			if(i % 2 == 0) {
				System.out.println("Even Element is --> " + i);
			} else {
				System.out.println("Odd Element is --> " + i);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,111,122,145,65};
		int n = arr.length;
		
		printOddAndEven(arr, n);

	}

}
