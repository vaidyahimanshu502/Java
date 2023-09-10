package interview;

public class SubtractTwoMatrices {

	static void subtractAndPrint(int arr1[][], int arr2[][], int n, int m) {
		int result[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				result[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr1[][] = {{1,2,3}, {1,2,3}, {1,2,3}};
		int arr2[][] = {{1,2,3}, {1,2,3}, {1,2,3}};
		
		int n = arr1.length;
		int m = arr1[0].length;
		
	    subtractAndPrint(arr1, arr2, n, m);
	}
}
