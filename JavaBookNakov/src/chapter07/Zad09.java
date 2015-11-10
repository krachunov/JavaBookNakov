package chapter07;
import java.util.Scanner;

public class Zad09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число:");
		int n = scan.nextInt();
		int j = 0;
		int x = 0;
		int sum = 0;
		int bestSum = 0;
		int[] arr = { 1, 2, 3, 4, 5 };
		int z = 0;

		for (x = -1; x <= arr.length - 1; x++) {
			System.out.println();
			sum = 0;

			for (j = x + 1; j < arr.length; j++) {
				sum += arr[j];
				// System.out.println("value: " + arr[j]);
				if (sum == n) {

					bestSum = sum;
					System.out.println(bestSum);
					continue;
				}
			
			}
		}
	}
}
