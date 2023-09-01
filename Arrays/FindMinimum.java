package interview;

public class FindMinimum {
	
	public static void findMinimum(int arr[]) {
		int n = arr.length;
	    int min = arr[0];
	    for(int i = 1; i < arr.length; i++) {
	    	if(arr[i] < min) {
	    		min = arr[i];
	    	}
	    }
	    System.out.println("Smallest Element = " + min);
	}

	public static void main(String[] args) {
	 int arr[] = {5,8,7,6,4,9};
	 findMinimum(arr);

	}

}
