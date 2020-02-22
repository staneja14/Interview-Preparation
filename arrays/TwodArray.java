package arrays;

import java.util.Scanner;

public class TwodArray {

	public static int[][] takeInput(int row, int column) {

		int[][] arr = new int[row][column];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("Enter the value of cell at " + i + " row and "+ j + " column: ");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr, int row, int column) {
		System.out.println("The 2-D matrix is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, column;
		System.out.println("Enter the number of rows in 2-D array: ");
		row = s.nextInt();
 		System.out.println("Enter the number of columns in 2-D array: ");
		column = s.nextInt();
		int[][] arr = takeInput(row, column);
		display(arr, row, column);
	}

}
