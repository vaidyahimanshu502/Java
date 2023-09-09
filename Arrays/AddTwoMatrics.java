package interview;

public class AddTwoMatrics {

	static int[][] findSumOfMatrix(int arr1[][], int arr2[][], int n, int m) {
		if(n==0) {
			System.out.println("Please provide valid matrix!");
			return null;
		} 
		if(m==0) {
			System.out.println("Please provide valid matrix!");
			return null;
		}
		int sumOfMatrix[][] =new  int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sumOfMatrix[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sumOfMatrix;
	}
	public static void main(String[] args) {
		int arr1[][] = {{1,2,3}, {2,4,3}, {4,5,6}};
		int arr2[][] = {{1,2,3}, {2,4,3}, {4,5,6}};
		int n = arr1.length;
		int m = arr1[0].length;
		
		int sumMatrix[][] = findSumOfMatrix(arr1, arr2, n, m);

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
