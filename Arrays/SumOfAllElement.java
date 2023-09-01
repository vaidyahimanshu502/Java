package interview;

public class SumOfAllElement {
	
	static void findSum(int arr[]) {
		int n = arr.length;
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all elements = " + sum);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
        findSum(arr);
	}

}
