package interview;

public class PrintEvenPlacedElement {

	static void printAtEvenPlace(int arr[]) {
		for(int i = 1; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
        printAtEvenPlace(arr);
	}
}
