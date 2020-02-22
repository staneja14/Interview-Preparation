package arrays;

/*
 * ArrayInverse.java - A class representing program for finding inverse of an array.
 * 
 * @author Shivani Taneja
 * created on: 01/15/2020
 */

//Time Complexity: O(arr.length)

public class ArrayInverse {

	/*
	 * Function for finding inverse of an array
	 * 
	 * @return Inverse Array
	 */
	public static int[] inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			inv[val] = i;
		}
		return inv;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 4, 2 };
		int[] result = inverse(arr);
		for (int val : result) {
			System.out.print(val + " ");
		}
	}
}
