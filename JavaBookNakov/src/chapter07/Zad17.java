package chapter07;
import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {
		int[][] mat = {

		{ 2, 2, 2, 2, 8, 8, 8 }, { 1, 2, 3, 4, 8, 8, 8 },
				{ 1, 2, 2, 2, 2, 2, 2 }, { 1, 2, 3, 4, 8, 8, 8 }, };

		int count = 1;
		int tmpNumber = 0;
		int x = 0;
		int y = 0;
		int curentPositionX = 0;
		int curentPositionY = 0;

		for (x = 0; x < mat.length; x++) {
			for (y = 0; y < mat[0].length; y++) {
				for (int z = 0; x <= 4; z++) {
					if (mat[x][x] == mat[x][y + 1]) {
						count++;
						if (y < 0 || y >= mat.length - 1 || x < 0
								|| x > mat.length||y-1<0) {
							break;
						}
					}
					if (mat[x][x] == mat[x + 1][y]) {
						count++;
						if (y < 0 || y >= mat.length - 1 || x < 0
								|| x > mat.length||y-1<0) {
							break;
						}
					}
					if (mat[x][x] == mat[x][y - 1]) {
						count++;
						if (y < 0 || y >= mat.length - 1 || x < 0
								|| x > mat.length||y-1<0) {
							break;
						}
					}
					if (mat[x][x] == mat[x - 1][y]) {
						count++;
						if (y < 0 || y >= mat.length - 1 || x < 0
								|| x > mat.length||y-1<0||x-1<0) {
							continue;
						}
					}
				}
			}
		}

		System.out.println(count);
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				System.out.printf("%d ", mat[row][col]);
			}
			System.out.println();
		}
	}
}
