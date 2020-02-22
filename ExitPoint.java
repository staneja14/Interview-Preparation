package arrays;

public class ExitPoint {

	public static void main(String[] args) {

		int[][] arr = { { 0, 0, 1, 0 }, { 1, 1, 0, 0 }, { 0, 1, 0, 0 }, { 1, 0, 1, 0 } };
		int dir = 0;
		int i = 0;
		int j = 0;
		while (true) {
			dir = (dir + arr[i][j]) % 4;
			if (dir == 0) {
				j++;
				if (j == -1) {
					j--;
					System.out.println(i + " " + j);
					break;
				}
			} else if (dir == 1) {
				i++;
				if (i == -1) {
					i--;
					System.out.println(i + " " + j);
					break;
				}
			} else if (dir == 2) {
				j--;
				if (j == -1) {
					j++;
					System.out.println(i + " " + j);
					break;
				}
			} else if (dir == 3) {
				i--;
				if (i == -1) {
					i++;
					System.out.println(i + " " + j);
					break;
				}
			}
		}
	}
}