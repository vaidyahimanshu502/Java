package interview;

public class Find3rdLargest {

	static int find3rdLargest(int arr[], int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return arr[0];
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] >= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
		return arr[n-3];
	}
	public static void main(String[] args) {
		int arr[] = {5,7,8,6,4,9,3};
        int n = arr.length;
        int _3rdLargest = find3rdLargest(arr, n);
        System.out.println(_3rdLargest);
	}

}
