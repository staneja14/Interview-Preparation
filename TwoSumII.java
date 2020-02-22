package arrays;

public class TwoSumII {

	public static int[] twoSumII(int[] numbers, int target) {

		int low = 0;
		int high = numbers.length - 1;
		int sum = numbers[low]+numbers[high];
		while (low <= high) {
			//int sum = numbers[low] + numbers[high];
			if (sum > target) {
				high--;
			} else if (sum < target) {
				low++;
			} else {
				return new int[] { low + 1, high + 1 };
			}

		}
		return new int[] { low + 1, high + 1 };

	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 0;
		int[] result = twoSumII(arr, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
