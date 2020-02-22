package arrays;

import java.util.HashMap;

public class TwoSum {

	public static int[] TwoSumEfficient(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		
		return new int[] {-1,-1};
		
	}

	public static void main(String[] args) {
		int[] arr = { 2, 30, 9, 10, 3, 7, 1, 5 };
		int target = 9;
		int[] result = TwoSumEfficient(arr, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
