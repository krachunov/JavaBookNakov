package chapter07;
public class Zad07_BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 98, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = i + 1; x < arr.length; x++) {
				if (arr[i] > arr[x]) {
					int tmp = arr[x];
					arr[x] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + ",");

		}
	}
}
