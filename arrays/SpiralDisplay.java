package arrays;

public class SpiralDisplay {
	
	//Check for rectangular matrix
	//Eg: 1 6 
	// 2 3 4 5 6 7
	
	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
				{ 41, 42, 43, 44, 45 } };

		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int toe = arr.length * arr[0].length;
		int cntr = 1;

		while (cntr <= toe) {

			// left wall
			for (int i = minr; i <= maxr; i++) {
				System.out.print(arr[i][minc] + " ");
				cntr++;
			}
			minc++;

			// bottom wall
			for (int j = minc; j <= maxc; j++) {
				System.out.print(arr[maxr][j] + " ");
				cntr++;
			}
			maxr--;

			// right wall
			for (int i = maxr; i >= minr; i--) {
				System.out.print(arr[i][maxc] + " ");
				cntr++;
			}
			maxc--;

			// top wall
			for (int j = maxc; j >= minc; j--) {
				System.out.print(arr[minr][j] + " ");
				cntr++;
			}
			minr++;
		}
	}

}
