package interview;
import java.util.*;

public class SlidingWindow {
	
	public static int calculateMaxSum(int arr[], int k) {
		
		int n=arr.length;
		if(n<k) {
			return -1;
		}
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
//		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<k;i++) {
//			for(int j=i;j<k-i+1;j++) {
//				sum+=arr[j];
//			}	
			sum+=arr[i];
//		maxSum=Math.max(maxSum, sum);
		}
		
		int window_sum=sum;
		
		for(int i=k;i<n;i++) {
			window_sum+=arr[i]-arr[i-k];
			if(maxSum > window_sum) {
				maxSum = maxSum;
			}else {
				maxSum=Math.max(window_sum, sum);
			}
		}
		return maxSum;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		int largestSum=calculateMaxSum(arr, k);
		System.out.println(largestSum);
	}
}
