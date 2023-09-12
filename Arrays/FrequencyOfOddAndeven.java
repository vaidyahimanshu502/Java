package interview;

public class FrequencyOfOddAndeven {

	static void printFreqOfOddAndEven(int arr[][],int n,int m) {
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j ++) {
				if(arr[i][j] % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("Frequency of even :: " + evenCount);
		System.out.println("Frequency of odd :: " + oddCount);
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int n = arr.length;
		int m = arr[0].length;
		printFreqOfOddAndEven(arr, n, m);

	}

}
