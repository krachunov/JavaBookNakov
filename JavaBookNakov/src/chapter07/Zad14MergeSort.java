package chapter07;
public class Zad14MergeSort {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 6, 5 };

		int n = 0;

		int firstStartIndex = 0;
		int firstEndIndex = arr.length - 1;
		int possition = ((firstStartIndex + firstEndIndex) / 2);
		int startIndex = 0;
		int endIndex = possition;
		int startIndexSecond = possition + 1;
		int endIndexSecond = arr.length - 1;

		int[] L = new int[possition + 1];
		int[] R = new int[arr.length - possition - 1];
		int countL = 0;

		for (int i = startIndex; i <= endIndex; i++) {
			L[countL] = arr[i];
			countL++;
		}

		int countR = 0;
		for (int i = startIndexSecond; i <= endIndexSecond; i++) {
			R[countR] = arr[i];
			countR++;
		}

		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(java.util.Arrays.toString(L));
		System.out.println(java.util.Arrays.toString(R));

	}
}
