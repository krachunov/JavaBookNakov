package chapter06;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int x = scn.nextInt();

		int array[][] = new int[x][x];

		for (int i = 1; i < x; i++) {
			for (int j = i; j < x; j++) {
				array[i][j] = j;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
		}
	}

}
