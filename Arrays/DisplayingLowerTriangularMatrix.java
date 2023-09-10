package interview;

public class DisplayingLowerTriangularMatrix {

	static void printLowerTriangle(int arr[][], int n, int m) {
		if(n != m) {
			System.out.println("Matrix should be squarematrix!");
		} else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(j > i) {
						System.out.print("0" + " ");
					} else {
						System.out.print(arr[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
		int n = arr.length;
		int m = arr[0].length;
		printLowerTriangle(arr, n, m);
	}

}
