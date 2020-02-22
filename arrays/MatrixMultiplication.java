package arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] m1 = { { 10, 1, 0 }, { 1, 0, 1 } };
		int[][] m2 = { { 2, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 0, 1 } };

		int r1 = m1.length;
		int c1 = m1[0].length;
		int r2 = m2.length;
		int c2 = m2[0].length;

		if (c1 != r2) {
			System.out.println("Can't be multiplied");
		}
		//Creating an array for product
		int[][] product = new int[r1][c2];
		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[0].length; j++) {
				for (int k = 0; k < r2; k++) {
					product[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[0].length; j++) {
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
	}
}
