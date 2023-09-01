package interview;

public class findDuplicate {
	
	static void findDuplicate(int arr[]) {
		int n = arr.length;
//		for(int i = 0 ; i < n; i++) {
//			for(int j = i + 1; j < n; j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}
//				
//			}
//		}
		int i = 0, j = n-1;
		while(j >= i) {
			if(arr[i] == arr[j]) {
				System.out.println(arr[i]);
				i++;
				j = n-1;
			}
			j--;
			if(j == i) {
				j = n-1;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,2,3,8,9,4};
		findDuplicate(arr);
	}
}

/*This approch works only if array is sorted*/

//public class findDuplicate {
//    static void findDuplicate(int arr[]) {
//        int n = arr.length;
//        int i = 0, j = 1;
//
//        while (j < n) {
//            if (arr[i] == arr[j]) {
//                System.out.println(arr[i]);
//                // Skip subsequent duplicates
//                while (j < n && arr[i] == arr[j]) {
//                    j++;
//                }
//            } else {
//                i = j;
//                j++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
////        int arr[] = {1, 2, 2, 3, 3, 4, 5, 6, 8, 9, 9};
//    	 int arr[] = {1,5,8,9,1,3,5,6};
//        findDuplicate(arr);
//    }
//}


