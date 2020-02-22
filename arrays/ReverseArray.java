package arrays;

/*
 * ReverseArray.java - A class representing program for reversing an array
 * 
 * @author Shivani Taneja
 * created on: 01/15/2020
 */
public class ReverseArray {

	/*
	 * Function for swapping the elemeentss in array
	 */
	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/*
	 * Function for reversing the array. reverseArray use swap function to reverse
	 * the array.
	 * 
	 * @return Reveresed array
	 */
	public static int[] reverseArray(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			swap(arr, left, right);
			left++;
			right--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 15, 26, 25, 14, 5, 27, 22 };
		reverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

