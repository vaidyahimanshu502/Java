package interview;

public class RotateToRightTillN {

	
	static void rotateRightToN(int arr[], int n) {
		int len = arr.length;
		
		for(int i = 0; i < n; i++) {
			int j, last;
			last = arr[len -1];
			for(j = len-1; j > 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = 3;
		rotateRightToN(arr, n);

	}

}
