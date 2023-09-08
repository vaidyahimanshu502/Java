package interview;

public class Find2ndLargest {

	static int find2ndLargest(int arr[], int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return arr[0];
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j ++) {
				if(arr[i] >= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[n-2];
	}
	public static void main(String[] args) {
		int arr[] = {5,4,8,7,9,3,1,2};
		int n = arr.length;
		int _2ndLargest = find2ndLargest(arr, n);
		System.out.println(_2ndLargest);
	}

}
