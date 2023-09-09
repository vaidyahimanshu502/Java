package interview;

public class FindDuplicates {

	static void findDuplicates(int arr[], int n) {
		if(n==0) {
			System.out.println("Please enter a valid input!");
		}
		if(n==1) {
			System.out.println("There is no duplicate element!");
		}
		int i=0, j = n-1;
		while(j >= i) {
			if(arr[i] == arr[j]) {
				System.out.println("Duplicate element is" + arr[i]);
				i++;
				j = n-1;
			}
		   j--;
		   if(j == i) {
			   j = n-1;
			   i++;
		   }
		}
		System.out.println("There is no duplicate element!");
	}
	public static void main(String[] args) {
		int arr[] = {1,5,4,3,2,8,7,1,5};
		int n = arr.length;
		findDuplicates(arr, n);
	}

}
