package interview;

public class DisplayUpperTriangle {

	static void printUpperTri(int arr[][], int n) {
		if(n <= 0) {
			System.out.print("Please provide valid matrix!");
		}
		for(int i =0; i < n; i++) {
			for(int j = 0; j < n; j++  ) {
				if(j >= i) {
					System.out.print(arr[i][j]+ " ");
				} else {
					System.out.print("0" + " ");
				}
		     }
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4}, {4,5,6,6}, {7,8,9,5}, {1,2,3,4}};
		int n = arr.length;
		printUpperTri(arr, n);
	}

}
