package chapter07;

import java.util.Scanner;

public class Zad13BinnarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the search number");
		int num = scan.nextInt();
		int[] arr = { 98, 7, 6, 5, 4, 3, 2, 1 };

		// Sort loop
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = i + 1; x < arr.length; x++) {
				if (arr[i] > arr[x]) {
					int tmp = arr[x];
					arr[x] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int currentIndex = 0;
		currentIndex = (startIndex + endIndex) / 2;

		while (arr[currentIndex] != num && startIndex <= endIndex) {
			if (arr[currentIndex] > num) {
				endIndex = currentIndex - 1;
			} else {
				startIndex = currentIndex + 1;
			}
			currentIndex = ((startIndex + endIndex) / 2);
		}
		if (startIndex <= endIndex) {
			System.out.println("търсеното число " + num
					+ " е намерено на позиция: " + currentIndex);
		} else {
			System.out.println("Търсеното число не е намерено");
		}
	}
}
