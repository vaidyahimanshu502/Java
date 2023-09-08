package interview;
import java.util.*;

public class SortInAsc {

	static int[] sortInAsc(int arr[], int n) {
		if(n < 1) {
			return arr;
		}
			for(int i = 0 ; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
	          }
			}
	return arr;
	}
	public static void main(String[] args) {
//     Scanner s = new Scanner(System.in);
//     int n = s.nextInt();
   int arr[] = {6,5,4,3,2,1};
   int n = arr.length;
//     for(int i =0; i < n ; i++ ) {
//    	 arr[i] = s.nextInt();
//     }
     int sortedArr[] = sortInAsc(arr, n);
     for(int i : sortedArr) {
    	 System.out.print(i + " ");
     }
	}
}
