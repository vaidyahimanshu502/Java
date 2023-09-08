package interview;

public class FindSmallest {

	static int findSmallest(int arr[], int n) {
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
		return arr[0];
	}
	public static void main(String[] args) {
		int arr[] = {1,5,4,8,9,1,2,7};
		int n = arr.length;
		int smallest = findSmallest(arr, n);
		System.out.println(smallest);
	}

}
