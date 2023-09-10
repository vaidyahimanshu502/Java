package interview;

public class CheckingEqualityOfTwoMatrices {

	static void checkEquality(int arr1[][], int arr2[][]) {
		int n = arr1.length;
		int m = arr1[0].length;
		
		int k = arr2.length;
		int l = arr2[0].length;
		
		if(n != k && m != l) {
			System.out.println("Given Matrices are not equal!");
		}
		boolean isEqual = true;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr1[i][j] == arr2[i][j]) {
					isEqual = true;
				} else {
					isEqual = false;
				}
			}
		}
		if(isEqual) {
			System.out.println("Given Matrices are equal!");
		} else {
			System.out.println("Given Matrices are not equal!");
		}
	}
	public static void main(String[] args) {
		int arr1[][] = {{4,7,3}, {2,5,3}, {7,5,9}};
		int arr2[][] = {{4,7,3}, {2,5,3}, {7,5,9}};
		
		checkEquality(arr1, arr2);

	}

}
