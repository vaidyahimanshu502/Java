package interview;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class printFirstNegativeOfSizeK {

	
	public static void printFirstNegative(int arr[],int n, int k){
		
		boolean flag;
//		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n-k+1;i++) {
			flag=false;
			for(int j=0;j<k;j++) {
				if(arr[i+j]<0) {
//					list.add(arr[j]);
					System.out.print(arr[i+j]+" ");
					flag=true;
					break;
				} 
			}
			if(!flag) {
//				list.add(0);
				System.out.print("0"+" ");
			}
		}
//		return list;
	}
	public static void main(String[] args) {
		
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=s.nextInt();
//		}

//		int k=s.nextInt();
		int arr[]= {12,-1,-7,8,-15,30,16,28};
		int n=arr.length;
		int k=3;
//		ArrayList<Integer>list=(ArrayList<Integer>) printFirstNegative(arr, n, k);
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+" ");
//		}
		printFirstNegative(arr, n, k);
	}
}
 