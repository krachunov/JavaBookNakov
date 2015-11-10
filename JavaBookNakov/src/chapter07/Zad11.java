package chapter07;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the n");
		int n = scan.nextInt();
		System.out.print("Enter the m");
		int m = scan.nextInt();

		int sumSubMatrix = 0;

		// Enter the matrix and value to the matrix
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int ii = 0; ii < m; ii++) {
				System.out.print("Enter the matrix[" + i + "][" + ii + "]");
				matrix[i][ii] = scan.nextInt();
			}
		}

		int currentSum = 0;
		int maxSum = 0;
		int maxSquareX = 0;
		int maxSquareY = 0;

		int y = 0;
		int x = 0;
		for (x = 0; x < n - 2; x++) {
			for (y = 0; y < m - 2; y++) {
				currentSum = matrix[x][y] + matrix[x][y + 1] + matrix[x][y + 2]
						+ matrix[x + 1][y] + matrix[x + 1][y + 1]
						+ matrix[x + 1][y + 2] + matrix[x + 2][y]
						+ matrix[x + 2][y + 1] + matrix[x + 2][y + 2];
				System.out.println("x: " + x);
				System.out.println("y: " + y);
				System.out.println("Matrix [" + x + "][" + y + "]:"
						+ matrix[x][y]);
				System.out.println("Matrix [" + x + "][" + y + "+1]:"
						+ matrix[x][y + 1]);
				System.out.println("Matrix [" + x + "+1][" + y + "]:"
						+ matrix[x + 1][y]);
				System.out.println("Matrix [" + x + "+1][" + y + "+1]:"
						+ matrix[x + 1][y + 1]);
				System.out.println("Matrix [" + x + "+2][" + y + "]:"
						+ matrix[x + 2][y]);
				System.out.println("Matrix [" + x + "+2][" + y + "+1]:"
						+ matrix[x + 2][y + 1]);
				System.out.println("Matrix [" + x + "+2][" + y + "+2]:"
						+ matrix[x + 2][y + 2]);
				System.out.println("Sum: " + currentSum);
			}

			if (currentSum > maxSum) {
				maxSum = currentSum;
				maxSquareX = x;
				maxSquareY = y;

			}
		}
		// Print the matrix
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println("max sum: " + maxSum);
		System.out.println("MaxSqeareX: " + maxSquareX);
		System.out.println("maxSquareY: " + maxSquareY);
		System.out.println();
		for (int row = maxSquareX - 2; row < matrix.length; row++) {
			for (int col = maxSquareY - 2; col < matrix[0].length; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();

		}
	}
}
