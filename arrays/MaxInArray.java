package arrays;

/*
 * MaxInArray.java - A class for representing program to find maximum element
 * in an array.
 * 
 * @author Shivani Taneja
 * created on: 01/15/2020
 */
public class MaxInArray {

	/*
	 * Find max in an array
	 * 
	 * @return An integer data type containing max
	 * Time Complexity of this program is: O(arr.length)
	 */
	public static int max(int[] arr) {
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {

		int[] arr = { 33, 2, 1, 0, 9, 21, 98, 34 };
		int maxElement = max(arr);
		System.out.println("The maximum element in the array is: " + maxElement);

	}

}
