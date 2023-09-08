package interview;

public class SortInDesc {

	static int[] sortInDesc(int arr[], int n) {
		if(n==0 || n==1) {
			return arr;
		}
		for(int i =0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] <= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {5,4,7,9,1,5,4,6};
		int n = arr.length;
		int[] sortedInDesc = sortInDesc(arr, n);

		for(int i : sortedInDesc) {
			System.out.print(i + " ");
		}
	}

}
