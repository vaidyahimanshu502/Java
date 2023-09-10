package interview;

public class CheckWhetherIdentityMatrixOrNot {

	static void checkIdentity(int arr[][], int n, int m) {
		if(n != m) {
			System.out.println("Matricx is not a identity Matrix!");
			return;
		}
		boolean isIdentity = true;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i == j && arr[i][j] != 1) {
//					System.out.println("Given matrix is not an identity matrix!");
					isIdentity = false;
					return;
				} else if(i != j && arr[i][j] != 0) {
//					System.out.println("Given matrix is not an identity matrix!");
					isIdentity = false;
					return;
				} else {
//					System.out.println("Given matrix is an Identity Matrix!");
					isIdentity = true;
				}
			}
		}
		if(isIdentity) {
			System.out.println("Given matrix is an Identity Matrix!");
		} else {
			System.out.println("Given matrix is not an identity matrix!");
		}
	}
	public static void main(String[] args) {
		int arr1[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
//		int arr2[][] = {{1,0,1}, {0,1,0}, {1,0,1}};
		
		int n = arr1.length;
		int m = arr1[0].length;
		checkIdentity(arr1, n, m);
	}

}
