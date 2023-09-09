package interview;

public class TransposeOfMatrix {

	static void findAndPrintTranspose(int mat[][], int n, int m) {
		int transpose[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				
			   transpose[i][j] = mat[j][i];
			}
			
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int mat[][] = {{1,2,3}, {4,5,6}, {7,8,9}}; 
		int n = mat.length;
		int m = mat[0].length;
		
		findAndPrintTranspose(mat, n, m);
	}

}
