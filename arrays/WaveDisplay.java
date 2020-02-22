package arrays;

public class WaveDisplay {

	public static void main(String[] args) {

		int[][] arr = {

				{ 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }

		};

		// Since we are traversing column wise so starting the loop of column first
		for (int j = 0; j < arr[0].length; j++) {
			// If the number of columns are even then traverse from top to bottom
			if (j % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j] + " ");
				}
			}else
			// If number of columns are odd then traverse from bottom to top
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
