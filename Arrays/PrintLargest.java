package interview;

public class PrintLargest {
	static void printLargest(int arr[]) {
		int n = arr.length;
		if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
		int largest = arr[0];
			for(int i = 1; i < n; i++) {
				if(arr[i] > largest) {
					largest = arr[i];
				}
			}
			System.out.println("largest element in the array - " + largest);
	}
	public static void main(String[] args) {
		int arr[] = {1,5,2,9,4,7};
		printLargest(arr);
	}
}
