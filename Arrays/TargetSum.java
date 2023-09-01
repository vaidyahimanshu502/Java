package interview;
import java.util.*;

public class TargetSum {
	 public static void main(String[] args) {
	        int[] nums = {1, 3, 2, 2, -4, -6, -2, 8};
	        int target = 4;
	        
	        List<int[]> firstCombination = findTwoSum(nums, target);
	        System.out.println("First Combination For " + target + ": " + Arrays.deepToString(firstCombination.toArray()));

	        int[] mergedArray = mergeArrays(firstCombination);
	        System.out.println("Merge Into a single Array: " + Arrays.toString(mergedArray));
	        
	        int doubleTarget = target * 2;
	        List<int[]> secondCombination = findDoubleCombination(mergedArray, doubleTarget);
	        System.out.println("Second Combination For " + doubleTarget + ": " + Arrays.deepToString(secondCombination.toArray()));
	    }
	    
	    // Find two integers in the array that sum up to the target value
	    private static List<int[]> findTwoSum(int[] nums, int target) {
	        List<int[]> result = new ArrayList<>();
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        for (int num : nums) {
	            int complement = target - num;
	            if (map.containsKey(complement)) {
	                int[] pair = {num, complement};
	                result.add(pair);
	            }
	            map.put(num, num);
	        }
	        
	        return result;
	    }
	    
	    // Merge the arrays into a single array and sort it in ascending order
	    private static int[] mergeArrays(List<int[]> arrays) {
	        int totalLength = 0;
	        for (int[] array : arrays) {
	            totalLength += array.length;
	        }
	        
	        int[] mergedArray = new int[totalLength];
	        int index = 0;
	        for (int[] array : arrays) {
	            for (int num : array) {
	                mergedArray[index++] = num;
	            }
	        }
	        
	        Arrays.sort(mergedArray);
	        return mergedArray;
	    }
	    
	    // Find combinations of elements in the array that sum up to the double target value
	    private static List<int[]> findDoubleCombination(int[] nums, int target) {
	        List<int[]> result = new ArrayList<>();
	        int length = nums.length;
	        
	        for (int i = 0; i < length - 3; i++) {
	            for (int j = i + 1; j < length - 2; j++) {
	                int left = j + 1;
	                int right = length - 1;
	                
	                while (left < right) {
	                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
	                    
	                    if (sum == target) {
	                        int[] quadruplet = {nums[i], nums[j], nums[left], nums[right]};
	                        result.add(quadruplet);
	                        left++;
	                        right--;
	                    } else if (sum < target) {
	                        left++;
	                    } else {
	                        right--;
	                    }
	                }
	            }
	        }
	        
	        return result;
	    }
}
