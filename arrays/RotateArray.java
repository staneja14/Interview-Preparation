package arrays;

/*
 * RotateArray.java - This class contains implementation for array
 * rotation.
 * 
 * @author Shivani Taneja
 * created on: 01/15/2020
 */
public class RotateArray {

	public static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void reverse(int[] arr, int left, int right) {

		while (left < right) {
			swap(arr, left, right);
			left++;
			right--;
		}
	}

	public static void rotate(int[] arr, int n, int k) {

		//k = k % n;
		if (k < 0) {
			k = k + n;
		}
		// If array is : a b c d e f g
		// Rotate by factor of 3
		// Part 1 will be from 0 to 4

		// P1- P1' (First part is rotated)
		reverse(arr, 0, n - k - 1);

		// P2 - P2' (Part 2 is rotated)
		reverse(arr, n - k, n - 1);

		// (P1'P2')' - P2P1
		reverse(arr, 0, n - 1);

	}
	
	//display
	public static void display(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 7, 3);
		display(arr,7);
		System.out.println();
		rotate(arr, 7, -3);
		display(arr,7);

	}

}
