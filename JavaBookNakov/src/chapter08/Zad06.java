package chapter08;
public class Zad06 {
	public static int firstLargeElements(int[] array) {
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				index = i;
				break;
			}
			else{
				index=0;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 2, 1, 8, 9, 1, 1, };

		System.out
				.println("The index of arr who is bigger from previous and the next is: "
						+ firstLargeElements(arr));

	}

}
