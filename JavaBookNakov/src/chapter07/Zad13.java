package chapter07;
import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the search number");
		int num = scan.nextInt();
		int[] arr = { 98, 7, 6, 5, 4, 3, 2, 1 };
		// sort the array
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = i + 1; x < arr.length; x++) {
				if (arr[i] > arr[x]) {
					int tmp = arr[x];
					arr[x] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		// print the sorted array
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + ",");

		}
		// set the varaible to teh search
		int startIndex = 0;
		int endIndex = (arr.length - 1);
		int currentIndex = 0;

		currentIndex = ((startIndex + endIndex) / 2);

		do {
			if (arr[currentIndex] == num) {
				System.out.println();
				System.out.println("Числото е намерено на позиция: "+ currentIndex);
				break;
			} else if (arr[currentIndex] > num) {
				endIndex = currentIndex;
				currentIndex = ((startIndex + endIndex - 1) / 2);
			} else {
				startIndex = currentIndex;
				currentIndex = ((endIndex + startIndex + 1) / 2);
			}
			if (startIndex == endIndex && arr[currentIndex] == num) {
				System.out.println("Няма такова число");
			}

		} while (startIndex != endIndex);

	}
}