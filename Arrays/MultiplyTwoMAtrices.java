package interview;

public class MultiplyTwoMAtrices {

	static int[][] findMultiplication(int arr1[][], int arr2[][], int n, int m) {
		if(n==0 || m==0) {
			return null;
		}

		int multiplication[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				multiplication[i][j] = 0;
				for(int k = 0; k < n; k++) {
					multiplication[i][j] += arr1[i][k]*arr2[k][j];
				}
				
			}
		}
		return multiplication;
	}
	public static void main(String[] args) {
		int arr1[][] = {{1,2,3}, {1,2,3}, {1,2,3}};
		int arr2[][] = {{1,2,3}, {1,2,3}, {1,2,3}};
		
		int n = arr1.length;
		int m = arr1[0].length;
		
		int multiplicationOfTwoMatrices[][] = findMultiplication(arr1, arr2, n, m);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(multiplicationOfTwoMatrices[i][j] + " ");
			}
			System.out.println();
		}

	}

}
