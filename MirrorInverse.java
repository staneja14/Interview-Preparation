package arrays;

/*
 * MirrorInverse.java - This class contains implementation of finding 
 * out whether an array is mirror inverse of itself.
 * 
 * @author Shivani Taneja
 * created on: 01/15/2020
 */
public class MirrorInverse {

	public static boolean isMirrorInverse(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if (arr[val] != i) {
				return false;
			}

		}
		return true;
	}
	

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 0, 1 };
		boolean result = isMirrorInverse(arr);
		System.out.println(result);
	}
}
