package chapter07;
import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the X");
		int x = scan.nextInt();
		System.out.print("Enter the Y");
		int y = scan.nextInt();

		int[][] arr = new int[x][y];
		for (int i = 0; i < arr.length; i++) {
			for (int ii = 0; ii < arr.length; ii++) {
				System.out.println("Enter the arr[" + i + "][" + ii + "]");
				arr[i][ii] = scan.nextInt();
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.printf( "%d ",arr[row][col]);
			}
			System.out.println();
		}
	}

}
