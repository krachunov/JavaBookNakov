package chapter07;
public class Zad14MargeSort_NE {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 6,5 };

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
		for (int i = 0; i < L.length - 1; i++) {
			for (int x = i + 1; x < L.length; x++) {
				if (L[i] > L[x]) {
					int tmp = L[x];
					L[x] = L[i];
					L[i] = tmp;
				}
			}
		}
		
		
		int countR = 0;
		for (int i = startIndexSecond; i <= endIndexSecond; i++) {
			R[countR] = arr[i];
			countR++;
		}
		for (int i = 0; i < R.length - 1; i++) {
			for (int x = i + 1; x < R.length; x++) {
				if (R[i] > R[x]) {
					int tmp = R[x];
					R[x] = R[i];
					R[i] = tmp;
				}
			}
		}
		
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(java.util.Arrays.toString(L));
		System.out.println(java.util.Arrays.toString(R));

	}
}
