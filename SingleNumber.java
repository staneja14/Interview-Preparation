package arrays;

import java.util.HashSet;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int eachEle : nums) {
			if (set.contains(eachEle)) {
				set.remove(eachEle);
			} else {
				set.add(eachEle);
			}

		}
		for (int eachEle : set) {
			return eachEle;
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1 };
		int result = singleNumber(arr);
		System.out.println(result);
	}

}
