package chapter08;
public class Zad05 {
	public static void whatIsElement(int possition, int[] array) {
		if (possition > 0 && possition < array.length) {
			if (array[possition] > array[possition + 1]) {
				System.out.println("The possition: " + possition
						+ " is hierst from the next");
			} else {
				System.out.println("The possition: " + possition
						+ " is low from the next");
			}
			if (array[possition] > array[possition - 1]) {
				System.out.println("The possition: " + possition
						+ " is hierst from the begin");
			} else {
				System.out
						.println("The previous or the last element is ot of array");

			}
		}
		if (possition == 0) {
			if (array[possition] > array[possition + 1]) {
				System.out.println("The possition: " + possition
						+ " is hierst from the next");
			} else {
				System.out.println("The possition: " + possition
						+ " is low from the next");
			}
			if (possition == array.length) {
				if (array[possition] > array[possition - 1]) {
					System.out.println("The possition: " + possition
							+ " is hierst from the begin");
				} else {
					System.out
							.println("The previous or the last element is ot of array");
				}
			}
		}
	}

	public static void main(String[] args) {
		int possitionOnarray = 0;
		int[] arr = { 1, 2, 3, 2, 5, 6, 7, 8, 9, 0 };

		whatIsElement(possitionOnarray, arr);

	}

}
