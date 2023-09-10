package interview;

public class CheckWhetherSparesOrNot {

	static void checkSpares(int arr[][], int n, int m) {
		if(n <= 0) {
			return;
		}
		int zeroCount = 0;
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 0) {
					zeroCount++;
				}
			}
		}
		if(zeroCount > (n*m)/2) {
			System.out.println("Given Matrix is a Spare Matrix!");
		} else {
			System.out.println("Given Matrix is not a Spare Matrix!");
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{5,0,0}, {3,0,2}, {0,0,0}};
		int n = arr.length;
		int m = arr[0].length;
		checkSpares(arr, n, m);

	}

}
