package interview;

public class FindSumOfRowsAndCol {

	static void printSum(int arr[][], int n, int m) {
		
		
		for(int i = 0; i < n; i++) {
			int rowSum = 0;
//			int colSum = 0;
			int j;
			for(j = 0; j < m; j++) {
				rowSum += arr[i][j];
//				colSum += arr[j][i];
			}
			System.out.println("Sum of "+(i+1) +" "+ "Row is " + rowSum);
//			System.out.println("Sum of "+(j+1)+"th " + "Col is " + colSum);
		}

		for(int i = 0; i < n; i++) {
//			int rowSum = 0;
			int colSum = 0;
			int j;
			for(j = 0; j < m; j++) {
//				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
//			System.out.println("Sum of "+(i+1)+"th " + "Row is " + rowSum);
			System.out.println("Sum of "+(i+1)+" "+ "Col is " + colSum);
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int n = arr.length;
		int m = arr[0].length;
		printSum(arr, n, m);
	}

}
